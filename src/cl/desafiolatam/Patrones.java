package cl.desafiolatam;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        patron1();
        patron2();
        patron3();
    }

    public static void patron1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para el patrón 1:");
        int n = sc.nextInt();
        int i;

        for (i = 0; i < n; i++) {

            if (i % 2 == 0)
                System.out.printf("*");
            else
                System.out.printf(".");
        }
        System.out.println();
    }

    public static void patron2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número para el patrón 2:");
        int n = sc.nextInt();
        int i;

        for (i = 0; i < n; i++) {

            if (i % 4 == 0)
                System.out.printf("1");
            else if (i % 4 == 1)
                System.out.printf("2");
            else if (i % 4 == 2) {
                System.out.printf("3");
            } else {
                System.out.printf("4");
            }
        }
        System.out.println();
    }

    public static void patron3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número para el patrón 3:");
        int n = sc.nextInt();
        int i;

        for (i = 0; i < n; i++) {

            if (i % 2 == 0)
                System.out.printf("||");
            else
                System.out.printf("*");
        }
        System.out.println();
    }
}