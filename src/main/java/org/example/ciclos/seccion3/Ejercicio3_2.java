package org.example.ciclos.seccion3;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un entero positivo N: ");
        int n = Integer.parseInt(consola.nextLine());

        // ----- Parte A: factorial -----
        if (n < 0) {
            System.out.println("El factorial no esta definido para negativos.");
        } else if (n > 20) {
            // 21! ya no cabe en un long (desbordamiento)
            System.out.println("N demasiado grande: el factorial desborda el tipo long (maximo N = 20).");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        // ----- Parte B: triangulo de altura N -----
        System.out.println("\nTriangulo de altura " + n + ":");
        for (int fila = 1; fila <= n; fila++) {
            for (int elemento = 1; elemento <= fila; elemento++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
