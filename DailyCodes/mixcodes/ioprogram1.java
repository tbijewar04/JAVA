 import java.util.*;

 class flat{
 
      public static void main(String[] args){
      
           Scanner sc = new Scanner(System.in);

	   System.out.println("Enter the society name:");
	   String socname = sc.next();

	   System.out.println("Enter wing:");
           char wing = sc.next().charAt(0);

	   System.out.println("Enter flat number:");
           int flatno = sc.nextInt();

	   System.out.println("Enter the rent:");
           float rent = sc.nextFloat();
           
	   System.out.println("society name: " + socname);
	   System.out.println("wing name: " + wing);
	   System.out.println("flat number : " + flatno);
	   System.out.println("Rent : " + rent);
	   
      }
 
 
 
 }
