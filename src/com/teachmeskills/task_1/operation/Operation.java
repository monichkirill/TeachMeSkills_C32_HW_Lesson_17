package com.teachmeskills.task_1.operation;

import com.teachmeskills.task_1.impl.MyFunc;

import java.util.Scanner;

public class Operation {
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to reverse a string or 2 to find the factorial: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the string to reverse: ");
                String inputString = scanner.next();

                MyFunc<String> reversedString = str -> new StringBuilder(inputString).reverse().toString();
                String result = reversedString.doOperation(inputString);
                System.out.println("Result: " + result);
                break;
            case 2:
                System.out.println("Enter the number to find the factorial: ");
                int number = scanner.nextInt();

                MyFunc<Integer> factorial = num -> {
                    if (num < 0) throw new IllegalArgumentException("Factorial cannot be negative");
                    int tempFact = 1;
                    for (int i = 1; i <= num; i++) {
                        tempFact *= i;
                    }
                    return tempFact;
                };

                try {
                    int resultFactorial = factorial.doOperation(number);
                    System.out.println("Factorial: " + resultFactorial);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
