package org.example.ciclos.seccion2;

import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        double saldo = 500000;   // saldo inicial
        int opcion;

        do {
            System.out.println("\n===== MENU BANCARIO =====");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Deposito");
            System.out.println("3. Realizar Retiro");
            System.out.println("4. Salir del Sistema");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = Double.parseDouble(consola.nextLine());
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito realizado. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("El monto debe ser mayor a cero.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = Double.parseDouble(consola.nextLine());
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a cero.");
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
    }
}
