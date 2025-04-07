import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = rows; j >= 1; j--) {
                    System.out.print((char)(64 + j) + " ");
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    System.out.print((char)(64 + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
