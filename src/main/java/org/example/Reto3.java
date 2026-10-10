package org.example;


import java.util.Scanner;

    public class Reto3 {
        public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);

            double precioBase = 100.0;

            System.out.println("ingrese el tipo de entrada (VIP, ESTUDIANTE, GENERAL, ADULTO_MAYOR): ");
            String tipoEntrada = consola.nextLine().toUpperCase();

            double precioFinal;

            if (tipoEntrada.equals("VIP")) {
                precioFinal = precioBase * 1.10;      // 10% de recargo
            } else if (tipoEntrada.equals("ESTUDIANTE")) {
                precioFinal = precioBase * 0.50;      // 50% de descuento
            } else if (tipoEntrada.equals("ADULTO_MAYOR")) {
                precioFinal = precioBase * 0.60;      // 40% de descuento
            } else if (tipoEntrada.equals("GENERAL")) {
                precioFinal = precioBase;             // t
            } else {
                System.out.println("tipo de entrada no valido");
                return;
            }

            System.out.println("tipo de entrada: " + tipoEntrada);
            System.out.println("precio base: $" + precioBase);
            System.out.println("monto final a pagar: $" + precioFinal);
        }
    }
