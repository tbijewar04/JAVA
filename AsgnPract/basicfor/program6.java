import java.util.*;

class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
      

        for (int i = num; i >= 10; i--) {
            System.out.print(i + "\n");
        }
    }
}

