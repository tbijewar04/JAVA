import java.util.*;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        
        for (int i = 1; i <= rows; i++) {
            int num = i;
            for (int j = 0; j < rows; j++) {
                System.out.print(num + " ");
                num += rows;
            }
            System.out.println();
        }
    }
}

