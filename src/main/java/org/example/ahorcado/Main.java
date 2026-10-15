package org.example.ahorcado;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    // ---------- Constantes del juego ----------
    static final int MAX_INTENTOS = 6;
    static final double PUNTAJE_INICIAL = 100.0;
    static final double BONO_POR_INTENTO = 12.5;
    static final String[] BANCO_PALABRAS = {
            "JAVA", "BUCLE", "CADENA", "ENTERO", "CLASE",
            "OBJETO", "METODO", "BOOLEANO", "COMPILADOR", "VARIABLE"
    };

    // ---------- Lector compartido por todo el programa ----------
    static final Scanner teclado = new Scanner(System.in);

    // ---------- Contadores para el menu de estadisticas ----------
    static int totalPartidas = 0;
    static int victorias = 0;
    static int derrotas = 0;
    static int abandonos = 0;
    static double sumaPuntajes = 0.0;
    static double puntajeMaximo = 0.0;

    public static void main(String[] args) {
        int opcion;

        do {
            imprimirMenu();
            opcion = pedirOpcion();

            switch (opcion) {
                case 1 -> iniciarPartida();
                case 2 -> imprimirEstadisticas();
                case 3 -> System.out.println("\nPrograma finalizado. ¡Gracias por jugar!");
                default -> System.out.println("Opción no reconocida.");
            }
        } while (opcion != 3);
    }

    // ================= MENU Y VALIDACION =================

    static void imprimirMenu() {
        System.out.println("\n*** ADIVINA LA PALABRA SECRETA ***");
        System.out.println("1. Jugar");
        System.out.println("2. Ver Estadísticas");
        System.out.println("3. Salir");
    }

    static int pedirOpcion() {
        int opcion = -1;

        while (opcion < 1 || opcion > 3) {
            System.out.print("Elija una opción: ");
            String texto = teclado.nextLine().trim();

            try {
                opcion = Integer.parseInt(texto);
                if (opcion < 1 || opcion > 3) {
                    System.out.println("Aviso: solo existen las opciones 1, 2 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Aviso: \"" + texto + "\" no es un número válido. Intente de nuevo.");
                opcion = -1;
            }
        }
        return opcion;
    }

    static String pedirNombre() {
        String nombre;

        do {
            System.out.print("\n¿Cómo se llama el jugador? ");
            nombre = teclado.nextLine().trim().toUpperCase();

            if (nombre.length() == 0) {
                System.out.println("Aviso: el nombre no puede quedar vacío.");
            }
        } while (nombre.length() == 0);

        return nombre;
    }

    // ================= PARTIDA =================

    static void iniciarPartida() {
        // --- Variables de estado (tabla de la guia) ---
        String nombreJugador = pedirNombre();
        String palabraSecreta = BANCO_PALABRAS[(int) (Math.random() * BANCO_PALABRAS.length)];
        int intentosRestantes = MAX_INTENTOS;
        double puntaje = PUNTAJE_INICIAL;
        boolean juegoGanado = false;
        char ultimaLetra = ' ';

        boolean abandono = false;
        int aciertos = 0;
        int fallos = 0;

        // --- StringBuilder: mascara ("_ _ _ _") e historial ("A, E, J") ---
        StringBuilder mascara = new StringBuilder("_ ".repeat(palabraSecreta.length()).trim());
        StringBuilder historial = new StringBuilder();

        System.out.println("\nSuerte, " + nombreJugador + ". La palabra tiene "
                + palabraSecreta.length() + " letras.");

        while (intentosRestantes > 0 && !juegoGanado) {
            System.out.println("\n  " + mascara);
            System.out.println("  Usadas: " + (historial.length() == 0 ? "-" : historial.toString()));
            System.out.println("  Intentos: " + intentosRestantes + " de " + MAX_INTENTOS);
            System.out.print("Letra (o RENDIRSE): ");
            String entrada = teclado.nextLine().trim();

            if (entrada.length() == 0) {
                System.out.println("Aviso: no escribió nada.");
                continue;
            }

            if (entrada.equalsIgnoreCase("RENDIRSE")) {
                abandono = true;
                break;
            }

            if (entrada.length() > 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Aviso: escriba una sola letra.");
                continue;
            }

            ultimaLetra = Character.toUpperCase(entrada.charAt(0));

            if (historial.indexOf(String.valueOf(ultimaLetra)) != -1) {
                System.out.println("Aviso: la letra " + ultimaLetra + " ya fue probada.");
                continue;
            }

            if (historial.length() > 0) {
                historial.append(", ");
            }
            historial.append(ultimaLetra);

            // Recorre la palabra y destapa todas las posiciones coincidentes
            boolean acierto = false;
            for (int pos = 0; pos < palabraSecreta.length(); pos++) {
                String letraActual = String.valueOf(palabraSecreta.charAt(pos));
                if (letraActual.equalsIgnoreCase(String.valueOf(ultimaLetra))) {
                    mascara.setCharAt(pos * 2, ultimaLetra);
                    acierto = true;
                }
            }

            if (acierto) {
                aciertos++;
            } else {
                fallos++;
                intentosRestantes--;
            }

            System.out.println(acierto
                    ? "✔ Bien, la " + ultimaLetra + " sí aparece."
                    : "✘ La " + ultimaLetra + " no aparece en la palabra.");

            if (mascara.indexOf("_") == -1) {
                juegoGanado = true;
                break;
            }
            if (intentosRestantes == 0) {
                break;
            }
        }

        // --- Resultado y puntaje ---
        String estadoFinal;
        if (juegoGanado) {
            estadoFinal = "¡VICTORIA!";
            puntaje = PUNTAJE_INICIAL + intentosRestantes * BONO_POR_INTENTO;
            victorias++;
        } else if (abandono) {
            estadoFinal = "RENDICIÓN";
            puntaje = 0.0;
            abandonos++;
        } else {
            estadoFinal = "DERROTA";
            puntaje = 0.0;
            derrotas++;
        }

        // Casting a double para evitar la division entera
        int turnosValidos = aciertos + fallos;
        double porcentajeAciertos = turnosValidos == 0 ? 0.0 : (double) aciertos / turnosValidos * 100;

        totalPartidas++;
        sumaPuntajes += puntaje;
        if (puntaje > puntajeMaximo) {
            puntajeMaximo = puntaje;
        }

        imprimirResumen(nombreJugador, estadoFinal, palabraSecreta,
                intentosRestantes, porcentajeAciertos, puntaje);
    }

    // ================= SALIDAS (solo printf) =================

    static void imprimirResumen(String jugador, String estado, String palabra,
                                int restantes, double porcentaje, double puntaje) {
        String borde = "=".repeat(52);

        System.out.printf(Locale.US, "%n%s%n", borde);
        System.out.printf(Locale.US, "RESUMEN DE LA PARTIDA%n");
        System.out.printf(Locale.US, "%s%n", borde);
        System.out.printf(Locale.US, "Jugador: %s%n", jugador);
        System.out.printf(Locale.US, "Estado Final: %s%n", estado);
        System.out.printf(Locale.US, "Palabra Secreta: %s%n", palabra);
        System.out.printf(Locale.US, "Intentos Restantes: %d / %d%n", restantes, MAX_INTENTOS);
        System.out.printf(Locale.US, "Porcentaje Aciertos: %.2f%%%n", porcentaje);
        System.out.printf(Locale.US, "Puntaje Final: %.2f pts%n", puntaje);
        System.out.printf(Locale.US, "%s%n", borde);
    }

    static void imprimirEstadisticas() {
        String borde = "=".repeat(52);

        System.out.printf(Locale.US, "%n%s%n", borde);
        System.out.printf(Locale.US, "ESTADÍSTICAS DE LA SESIÓN%n");
        System.out.printf(Locale.US, "%s%n", borde);

        if (totalPartidas == 0) {
            System.out.printf(Locale.US, "Todavía no se ha jugado ninguna partida.%n");
        } else {
            System.out.printf(Locale.US, "%-22s %d%n", "Partidas jugadas:", totalPartidas);
            System.out.printf(Locale.US, "%-22s %d%n", "Victorias:", victorias);
            System.out.printf(Locale.US, "%-22s %d%n", "Derrotas:", derrotas);
            System.out.printf(Locale.US, "%-22s %d%n", "Rendiciones:", abandonos);
            System.out.printf(Locale.US, "%-22s %.2f pts%n", "Puntaje total:", sumaPuntajes);
            System.out.printf(Locale.US, "%-22s %.2f pts%n", "Puntaje promedio:", sumaPuntajes / totalPartidas);
            System.out.printf(Locale.US, "%-22s %.2f pts%n", "Mejor puntaje:", puntajeMaximo);
        }
        System.out.printf(Locale.US, "%s%n", borde);
    }
}
