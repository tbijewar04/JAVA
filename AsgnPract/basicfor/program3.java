import java.util.*;

class threedigit {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range number: ");
        int num = sc.nextInt();
        int num2 = 100;

        for (int i = 1; i <= num; i++) {
            System.out.print(num2 + ",");
            num2++;
           
        }
	 System.out.print("\n");
    }
}

