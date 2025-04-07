import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of rows: ");
        int rows = sc.nextInt();

        char letter = (char)(64 + rows);
        int number = rows - 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i % 2 == 0) {
                    System.out.print(letter + " ");
                } else {
                    System.out.print(number + " ");
                }
            }

            System.out.println();

            if (i % 2 == 0) {
                letter -= 2;
            } else {
                number -= 2;
            }
        }
    }
}

