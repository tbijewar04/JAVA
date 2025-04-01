import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        char ch = (char)(64 + rows);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch = (char)(ch - 1);
        }
    }
}

