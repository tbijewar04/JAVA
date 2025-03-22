import java.util.*;

class Core2web{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter first boolean value(true/false): ");
                boolean num1 = sc.nextBoolean();
		
                System.out.println("Enter second boolean value(true/false): ");
                boolean num2 = sc.nextBoolean();

                if(num1 && num2){
                        System.out.println(num1+ " && " + num2+ ":true");
                }else{
                        System.out.println(num1+ " && " + num2+ ":false");
		}


		if(num1 || num2){
			System.out.println(num1+ " || " + num2+ ":true");
                }else{  
			System.out.println(num1+ " || " + num2+ ":false");
                }


		if(!num1){
			System.out.println("!" +num1+ "true");
                }else{   
			System.out.println("! " + num2+ ":false");
		}


		if(!num2){
			System.out.println("! " + num1+ ":true");
                }else{                     
			System.out.println("! " + num2+ ":false");
                }
	}
}
