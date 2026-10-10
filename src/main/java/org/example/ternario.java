package org.example;

import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("la cookie de sesion esta activa? (s/n): ");
        boolean cookieSesionActiva = consola.nextLine().equalsIgnoreCase("s");

        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";

        System.out.println("estado de conexion: " + estadoConexion);
    }
}