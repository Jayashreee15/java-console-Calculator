import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Calculator exited.");
    }
}