import java.util.*;

class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 && num % 5 == 0 && num % 10 == 0) {
            System.out.println(num + " is divisible by 2, 5 and 10.");
        } else {
            System.out.println(num + " Is Not Divisible By 2, 5 and 10.");
        }
    }
}

