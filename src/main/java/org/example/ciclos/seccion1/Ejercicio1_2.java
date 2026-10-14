package org.example.ciclos.seccion1;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        final double LIMITE = 1000000;
        double acumulado = 0;
        String causa = "";
        boolean procesando = true;

        while (procesando) {
            System.out.print("Ingrese el monto de la transaccion: ");
            double monto = Double.parseDouble(consola.nextLine());

            if (monto < 0) {
                causa = "monto negativo";
                procesando = false;
            } else {
                acumulado += monto;
                if (acumulado > LIMITE) {
                    causa = "superacion del limite de $1'000.000";
                    procesando = false;
                }
            }
        }

        System.out.println("===== INFORME =====");
        System.out.println("Saldo final acumulado: $" + acumulado);
        System.out.println("Causa de finalizacion: " + causa);
    }
}
