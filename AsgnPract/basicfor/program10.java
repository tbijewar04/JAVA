import java.util.*;

class CountOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = 1; i <= num; i += 2) {
            count++;
        }

        System.out.println("Count of odd numbers: " + count);
    }
}

