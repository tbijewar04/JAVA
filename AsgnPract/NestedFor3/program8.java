import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            char symbol;
            if (i % 3 == 0) {
                symbol = '#';
            } else if (i % 3 == 1) {
                symbol = '$';
            } else {
                symbol = '@';
            }

            for (int j = 0; j < rows; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}

