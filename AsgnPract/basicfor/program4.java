import java.util.*;

class EvenNum {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
       
        for (int i = 1; i <= num; i++) {
           
            if (i%2 == 0) {
                  System.out.print(i + "\n");
            }
        }

    }
}

