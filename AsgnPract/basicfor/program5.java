import java.util.*;

 class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
          
            if (i%2 != 0) {
                System.out.print(i + "\n");
            }
        }
    }
}

