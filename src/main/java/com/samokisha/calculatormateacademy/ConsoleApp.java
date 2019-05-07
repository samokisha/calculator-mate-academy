package com.samokisha.calculatormateacademy;

import com.samokisha.calculatormateacademy.calculator.Calculator;

import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        welcomeMessage();

        String input = readInput();

        Calculator calculator = new Calculator();
        calculator.setTask(input);
        String result = calculator.getResult();

        printResult(result);
    }

    private static void printResult(String result) {
        System.out.println("The result of expression: " + result);
    }

    private static String readInput() {
        System.out.println("Please enter expression and press <Enter>:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }

    private static void welcomeMessage() {
        System.out.println("Console calculator\n" +
                "by Anatoly Samokisha\n" +
                "for Mate Academy");
    }
}
