package org.example;

public class ErrorFallThrough {
    public static void main(String[] args) {
        int opcionCategoria = 1;
        switch (opcionCategoria) {
            case 1:
                System.out.println("Categoria Seleccion: Lunes (Jornada Laboral)");
                break;
            case 2:
                System.out.println("Categoria Seleccion: Martes (Jornada Laboral)");
                break;
            case 3:
                System.out.println("Categoria Seleccion: Miercoles (Jornada Laboral)");
                break;
            default:
                System.out.println("Dia no identificado");
        }
    }
}