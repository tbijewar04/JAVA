import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print((char)(64 + rows - j) + " ");
                    } else {
                        System.out.print((rows - j) + " ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print((char)(65 + j) + " ");
                    } else {
                        System.out.print((j + 1) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

