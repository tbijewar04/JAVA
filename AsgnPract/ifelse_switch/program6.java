import java.util.*;

 class NumberSpelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-5): ");
        int num = sc.nextInt();

        // Using switch statement
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println(num + " is greater than 5.");
        }
    }
}


        // Using if-else ladder
        /*
        if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else {
            System.out.println(num + " is greater than 5.");
        }
        */

