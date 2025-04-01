import java.util.Scanner;

class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by both 3 and 7.");
        } else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3.");
        } else if (num % 7 == 0) {
            System.out.println(num + " is divisible by 7.");
        } else {
            System.out.println(num + " is neither divisible by 3 nor by 7.");
        }
    }
}

