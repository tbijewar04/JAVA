import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
      
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
      
        System.out.print("Enter operation ((1) +, (2) -, (3) *, (4) /, (5) %): ");
        int option = sc.nextInt();

        // Using switch statement
        switch (option) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 % num2));
                } else {
                    System.out.println("Cannot perform operation with zero.");
                }
                break;
            default:
                System.out.println(" Invalid operation.");
        }
    }
}



        // Using if-else ladder
        /*
        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        } else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else if (choice == 5) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 % num2));
            } else {
                System.out.println("Cannot perform operation with zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
        */

