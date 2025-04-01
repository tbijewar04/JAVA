import java.util.*;

class NestedFor{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter number of row:");
                int rows = sc.nextInt();
                char ch = 65;

                for(int i = 1; i<=rows; i++){

                        for(int j = 1; j<=rows; j++){

                              System.out.print(ch + " ");
			      ch++;
                              
                        }
                        System.out.println();
			ch = 65;
                }
        }
}
