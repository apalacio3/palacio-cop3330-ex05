/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class SimpleMath {
    public static void main( String[] args )
    {
        System.out.print("What is the first number? ");

        Scanner input = new Scanner(System.in);
        String firstNum = input.nextLine();
        double first = Double.parseDouble(firstNum);

        System.out.print("What is the second number? ");

        String secondNum = input.nextLine();
        double second = Double.parseDouble(secondNum);

        double add = first + second;
        double sub = first - second;
        double product = first * second;
        double quotient = first / second;

        String output = first + " + " + second + " = " + add + "\n"
                + first + " - " + second + " = " + sub + "\n"
                + first + " * " + second + " = " + product + "\n"
                + first + " / " + second + " = " + quotient;

        System.out.println(output);
    }
}
