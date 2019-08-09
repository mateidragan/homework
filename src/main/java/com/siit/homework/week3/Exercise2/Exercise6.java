package com.siit.homework.week3.Exercise2;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner bobita = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int n1 = bobita.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int n2 = bobita.nextInt();
        System.out.println("Introduceti operatia dorita: ");
        String operation = bobita.next();

        calculator(n1, n2, operation);
    }

    public static String calculator(int n1, int n2, String operation) {
        if (operation.equals("+")){
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        }else {
            if (operation.equals("-")){
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            }else {
                if (operation.equals("*")){
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                }else {
                    if (operation.equals("/")){
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    }else {
                        System.out.println("Bad operation!");
                    }
                }
            }
        }

        return operation;
    }
}
