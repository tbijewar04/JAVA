import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (num % 2 == 1) {
                    System.out.print((num * num) + " ");
                } else {
                    System.out.print(num + " ");
                }
                num++;
            }
            System.out.println();
        }
    }
}

