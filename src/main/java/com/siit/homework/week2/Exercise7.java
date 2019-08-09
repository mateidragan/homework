package com.siit.homework.week2;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner bobita = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceti primul numar: ");
            int n1 = bobita.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int n2 = bobita.nextInt();
            System.out.println("Introduceti operatia dorita: ");
            String operation = bobita.next();

            switch (operation) {
                case "+":
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case "-":
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case "*":
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case "/":
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
                default:
                    System.out.println("Bad operation!");
            }
            System.out.println("Mai doriti alta operatie? Yes/No");
            String answer = bobita.next();
            if (answer.equals("No")) {
                System.out.println("Va multumim ca ati utlizat calculatorul nostru!");
                break;
            }

        }
    }
}
