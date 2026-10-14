package org.example.ciclos.seccion1;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int acumulador = 0;
        int contador = 0;

        System.out.print("Ingrese un entero (-99 para terminar): ");
        int numero = Integer.parseInt(consola.nextLine());

        while (numero != -99) {
            acumulador += numero;
            contador++;
            System.out.print("Ingrese un entero (-99 para terminar): ");
            numero = Integer.parseInt(consola.nextLine());
        }

        System.out.println("Total acumulado: " + acumulador);
        System.out.println("Cantidad de numeros procesados: " + contador);
    }
}
