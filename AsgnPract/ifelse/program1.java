import java.util.*;

class posi_nega{

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();     
    

	if(num >= 0){
	
	     System.out.println(num + " is positive");
	}else{
	
	     System.out.println(num + " is negative");
	}
    
    }


}
