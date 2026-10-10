package org.example;

import java.util.Scanner;

public class integrador {


    static final String CUPON_VALIDO = "PROMO1";

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("ingrese la cantidad: ");
        int cantidad = Integer.parseInt(consola.nextLine());

        System.out.println("ingrese el tipo de cliente (VIP, REGULAR, NUEVO): ");
        String tipoCliente = consola.nextLine().toUpperCase();

        System.out.println("ingrese el cupon (o deje vacio): ");
        String cupon = consola.nextLine();

        // 1. Subtotal base
        double subtotalBase = cantidad * 250.00;

        // 2. Descuento por categoria (switch)
        double porcentaje;
        switch (tipoCliente) {
            case "VIP":
                porcentaje = 0.20;
                break;
            case "REGULAR":
                porcentaje = 0.10;
                break;
            case "NUEVO":
                porcentaje = 0.05;
                break;
            default:
                porcentaje = 0.0;
        }
        double descuentoCliente = subtotalBase * porcentaje;
        double subtotalConDescuento = subtotalBase - descuentoCliente;

        // 3. Cupon (if-else con operadores logicos)
        double descuentoCupon;
        if (cupon.equals(CUPON_VALIDO) && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }

        // 4. Impuestos y total
        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double total = baseImponible + iva;

        System.out.printf("subtotal base: $%.2f%n", subtotalBase);
        System.out.printf("descuento cliente: -$%.2f%n", descuentoCliente);
        System.out.printf("descuento cupon: -$%.2f%n", descuentoCupon);
        System.out.printf("base imponible: $%.2f%n", baseImponible);
        System.out.printf("IVA (16%%): +$%.2f%n", iva);
        System.out.printf("Total a pagar = $%.2f%n", total);
    }
}