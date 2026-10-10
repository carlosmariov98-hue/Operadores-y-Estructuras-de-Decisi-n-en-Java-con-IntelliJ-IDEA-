package org.example;

import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("ingrese tu calificacion final: ");
        double calificacionFinal = Double.parseDouble(consola.nextLine());

        System.out.println("ingrese el porcentaje de asistencia: ");
        int porcentajeAsistencia = Integer.parseInt(consola.nextLine());

        System.out.println("ingrese si entrego proyecto final: ");
        boolean entregoProyectoFinal = (consola.nextLine().equalsIgnoreCase("v") ? true : false);

        if (calificacionFinal >=70.0 && porcentajeAsistencia >= 80){
            System.out.println("el estudiante aprobo");
        } else if (entregoProyectoFinal && calificacionFinal >= 60) {
            System.out.println("pendiente a examen extraordinario");
        } else {
            System.out.println("el estudiante reprobo");

        }
    }
}

