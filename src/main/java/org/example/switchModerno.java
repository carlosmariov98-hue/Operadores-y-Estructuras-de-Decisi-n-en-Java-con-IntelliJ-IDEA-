package org.example;

import java.util.Scanner;

public class switchModerno {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("ingrese el numero del dia (1=Lunes ... 7=Domingo): ");
        int dia = Integer.parseInt(consola.nextLine());

        final String jornada = switch (dia) {
            case 1, 2, 3, 4, 5 -> "jornada laboral";
            case 6 -> "jornada parcial (sabado)";
            case 7 -> "descanso (domingo)";
            default -> "dia invalido";
        };

        System.out.println("tipo de jornada: " + jornada);
    }
}