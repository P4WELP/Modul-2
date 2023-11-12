
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Calculator {
    private Scanner scanner;

    public Calculator() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        printInstructions();
        boolean continueCalculations = true;

        while (continueCalculations) {
            double result = 0;
            double number1 = getNumberFromUser("Enter the first number: ");
            double number2 = getNumberFromUser("Enter the second number: ");
            String operation = getOperationFromUser();

            switch (operation) {
                case "+":
                    result = add(number1, number2);
                    break;
                case "-":
                    result = subtract(number1, number2);
                    break;
                case "*":
                    result = multiply(number1, number2);
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
                        continue;
                    }
                    result = divide(number1, number2);
                    break;
                case "exit":
                case "quit":
                    System.out.println("Exiting the calculator.");
                    continueCalculations = false;
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, *, /, exit, or quit.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    private void printInstructions() {
        System.out.println("Calculator!");
        System.out.println("You can pick the following operations:");
        System.out.println("Addition +");
        System.out.println("Subtraction -");
        System.out.println("Multiplication *");
        System.out.println("Division /");
        System.out.println("To exit, type 'exit' or 'quit'.");
    }

    private String getOperationFromUser() {
        System.out.print("Enter the operation (+, -, *, /): ");
        return scanner.next();
    }

    private double getNumberFromUser(String prompt) {
        double number;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (!isMoreThan0(number));
        return number;
    }

    private boolean isMoreThan0(double number) {
        return number > 0;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double divide(double a, double b) {
        return a / b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
