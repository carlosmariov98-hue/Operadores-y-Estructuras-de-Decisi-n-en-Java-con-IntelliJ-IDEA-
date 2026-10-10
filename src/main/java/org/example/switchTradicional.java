package org.example;

import java.util.Scanner;

public class switchTradicional {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("ingrese el numero del dia (1=Lunes ... 7=Domingo): ");
        int dia = Integer.parseInt(consola.nextLine());

        String jornada;

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                jornada = "jornada laboral";
                break;
            case 6:
                jornada = "jornada parcial (sabado)";
                break;
            case 7:
                jornada = "descanso (domingo)";
                break;
            default:
                jornada = "dia invalido";
        }

        System.out.println("tipo de jornada: " + jornada);
    }
}
