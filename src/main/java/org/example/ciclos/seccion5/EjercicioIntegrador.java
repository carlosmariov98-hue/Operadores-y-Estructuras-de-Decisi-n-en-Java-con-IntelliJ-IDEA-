package org.example.ciclos.seccion5;

import java.util.Scanner;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        final int CAPACIDAD_MAXIMA = 500;
        int totalUnidades = 0;
        int productosRegistrados = 0;
        double valorInventario = 0;
        int opcion;

        do {
            System.out.println("\n===== ALMACEN LOGISTICO =====");
            System.out.println("1. Registrar Lote de Productos");
            System.out.println("2. Ver Estado del Almacen");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1: {
                    System.out.print("Cantidad de productos del lote: ");
                    int n = Integer.parseInt(consola.nextLine());

                    for (int i = 1; i <= n; i++) {
                        System.out.println("--- Producto " + i + " de " + n + " ---");

                        System.out.print("Esta descontinuado? (s/n): ");
                        boolean descontinuado = consola.nextLine().equalsIgnoreCase("s");
                        if (descontinuado) {
                            System.out.println("Producto descontinuado: se omite.");
                            continue;
                        }

                        System.out.print("Precio unitario: ");
                        double precio = Double.parseDouble(consola.nextLine());
                        while (precio <= 0) {
                            System.out.print("Error: el precio debe ser mayor a cero. Intente de nuevo: ");
                            precio = Double.parseDouble(consola.nextLine());
                        }

                        System.out.print("Cantidad en stock: ");
                        int stock = Integer.parseInt(consola.nextLine());
                        while (stock <= 0) {
                            System.out.print("Error: el stock debe ser mayor a cero. Intente de nuevo: ");
                            stock = Integer.parseInt(consola.nextLine());
                        }

                        totalUnidades += stock;
                        valorInventario += precio * stock;
                        productosRegistrados++;

                        if (totalUnidades > CAPACIDAD_MAXIMA) {
                            System.out.println("ALERTA: sobrecupo. Capacidad maxima " + CAPACIDAD_MAXIMA
                                    + " superada. Se aborta el resto del lote.");
                            break;
                        }
                    }
                    break;
                }
                case 2:
                    System.out.println("===== ESTADO DEL ALMACEN =====");
                    System.out.println("Productos registrados: " + productosRegistrados);
                    System.out.println("Unidades totales: " + totalUnidades + " / " + CAPACIDAD_MAXIMA);
                    System.out.println("Valor del inventario: $" + valorInventario);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);
    }
}
