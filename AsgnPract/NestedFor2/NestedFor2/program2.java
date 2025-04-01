import java.util.*;

class NestedFor{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter the number of rows: ");
                int rows = sc.nextInt();

                for(int i = 0; i<rows; i++){

			for (int j = rows; j>0; j--) {
                                
				char ch = (char)('a' + j - 1);
				System.out.print(ch + " ");
                        }
                        System.out.println();
			
                }
        }
}
