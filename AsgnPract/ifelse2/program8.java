import java.util.*;


class grades{

     public static void main(String[] args){

           Scanner sc = new Scanner(System.in);
           System.out.println("enter the percentage");
           float per = sc.nextFloat();

           if(per>=85.00){
                 System.out.println("Passed: first class with distinction");
           }else if(per < 85.00 && per>=75.00){
                 System.out.println("Passed: first class");
           }else if(per < 75.00 && per>=65.00){
                   System.out.println("Passed: second class");
           }else if(per < 65.00 && per>=45.00){                                                                                                            System.out.println("pass");


     }else{
             System.out.println("fail");
     }





     }}
