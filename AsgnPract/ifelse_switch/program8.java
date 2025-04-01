import java.util.*;

class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        

        if (num1 < 0 || num2 < 0) {
            System.out.println("Sorry, negative numbers not allowed");
            
        }else{

        int product = num1 * num2;
        System.out.println("Product: " + product);

        switch (product % 2) {
            case 0:
                System.out.println("The product is Even.");
                break;
            case 1:
                System.out.println("The product is Odd.");
                break;
	   }
        }
    }
}

