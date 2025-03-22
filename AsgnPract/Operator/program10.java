import java.util.*;

class Core2web{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.println("Enter second number: ");
                int num2 = sc.nextInt();
		
		int sum = 0;
		sum = num1 + num2;
		
                if(sum > 20){
                        System.out.println("The sum of " +num1+ " and " + num2+ "is greater than 20");
                }else{
                        System.out.println("The sum of " +num1+ " and " + num2+ "is less than 20");
                }
	}
}
