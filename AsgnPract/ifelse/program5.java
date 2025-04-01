import java.util.*;

class DiviCheck {
    public static void main(String[] args) {
        
	
	System.out.println("Enter the number: ");    
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println("Divisible by 7");
        } else {
            System.out.println("Not divisible by 7");
        }
    }
}

