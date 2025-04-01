import java.util.*;


class NestedFor{

        public static void main(String[] args){
                                  
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the number of rows: ");
                int rows = sc.nextInt();

                for (int i = 0; i < rows; i++) {
                int num = i + 1;
                
		   for (int j = 0; j < rows; j++) {
                   System.out.print(num + " ");
		   num++;
                 }
                   System.out.println();
             }
       }
}
