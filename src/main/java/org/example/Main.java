package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Fila 1
        int seg = 86400 % 3600;
        System.out.println("seg = " + seg);

        // Fila 2
        int x = 5;
        int y = ++x + x++;
        System.out.println("y = " + y + " | x = " + x);

        // Fila 3
        double div1 = 15 / 2;
        double div2 = 15.0 / 2;
        System.out.println("div1 = " + div1 + " | div2 = " + div2);

        // Fila 4
        x = 5;
        boolean flag = true;
        boolean res = flag && (++x > 0);
        System.out.println("res = " + res + " | x = " + x);
        }
    }
