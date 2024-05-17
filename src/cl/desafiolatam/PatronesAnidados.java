package cl.desafiolatam;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        patron_anidado1();
        patron_anidado2();
        patron_anidado3();
        patron_anidado4();
    }

    public static void patron_anidado1() {
        System.out.print("Ingrese un número del 1 al 5: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 1 || num > 5) {
            System.out.println("Número fuera de rango.");
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i == 0 || i == num - 1) {
                        System.out.print("*");
                    } else if (j == 0 || j == num - 1) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.printf("\n");
            }
        }

    }

    public static void patron_anidado2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 5: ");

        int num = sc.nextInt();

        if (num < 1 || num > 5) {
            System.out.println("Número fuera de rango.");
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i == 0 || i == num - 1 || j == (num - i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void patron_anidado3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 6: ");

        int num = sc.nextInt();

        if (num < 1 || num > 6) {
            System.out.println("Número fuera de rango.");
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i == j || j == (num - i - 1)) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void patron_anidado4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 6: ");

        int num = sc.nextInt();

        if (num < 1 || num > 6) {
            System.out.println("Número fuera de rango.");
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if ((i == 0 || j == num - 1) && j != num - 1 ||
                            j > 0 && j < num - 1 ||
                            (j == 0 || i == num - 1) && j != 0)  {
                        System.out.print("*");
                    } else if (num == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}