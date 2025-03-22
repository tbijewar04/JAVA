class IntegerCache{
     public static void main(String[] args){
     
     /*the range of integer cache in the heap section is -128 to 127, if the assigned number is greater than 127 then automatically another integer cache is created for that value with address, in this program there are two integer cache are made for each x and y with different address and in java stack address is stored so they became unequal*/

	     Integer x = 128;
	     Integer y = 128;

	     System.out.println(x);
	     System.out.println(y);

	     if(x == y){

	           System.out.println("equal");
	     }else{
	           
		    System.out.println("not equal");
	     
	     }
              

	     Integer b = 127;
             Integer a = 127;

	     System.out.println(b);
             System.out.println(a);

	     if(a == b){

                   System.out.println("equal");
             }else{

                    System.out.println("not equal");

             }
     }

}

  

