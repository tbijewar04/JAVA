import java.util.Scanner;

class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int num = 1;
        char ch = (char)(64 +rows);
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(ch +""+ num + " ");
		num++;
            }
            System.out.println();
        }
    }
}

