import java.util.*;

class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Rows and columns should be equal.");
            
        }

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ldSum = 0; 
        int rdSum = 0; 
        int sum = 0;

        System.out.println("Entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];

                if (i == j) {
                    ldSum += arr[i][j];
                }
                if (j == cols - 1 - i) {
                    rdSum += arr[i][j];
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of all elements: " + sum);
      
        System.out.println("Left Diagonal Sum: " + ldSum);

        System.out.println("Right Diagonal Sum: " + rdSum);

        int tdsum = ldSum + rdSum;

        if (rows % 2 != 0) {
            int center = rows / 2;
            tdsum -= arr[center][center];
        }

        System.out.println("Total diagonal sum : " + tdsum);
    }
}

