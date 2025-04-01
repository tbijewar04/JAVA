import java.util.*;


class marks{

     public static void main(String[] args){
     
           Scanner sc = new Scanner(System.in);
	   System.out.println("enter the percentage");
	   float per = sc.nextFloat();

	   if(per>85.00){
	         System.out.println("medical");
	   }else if(per<=85.00 && per>75.00){
	         System.out.println("engineering");   
	   }else if(per<=75.00 && per>65.00){
	           System.out.println("pharmacy and bsc");
	   }else if(per<= 65.00 && per>=55.00){                                                                                                            System.out.println("ba");
     
     
     
     }else{
             System.out.println("take a drop year");
     }





     }}
