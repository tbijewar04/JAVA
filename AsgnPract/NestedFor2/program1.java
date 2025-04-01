import java.util.*; 

class NestedFor{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of rows: ");
		int rows = sc.nextInt();
		int num = 1;

		for(int i = 1; i<=rows; i++){
		
			for(int j = 1; j<=rows; j++){
			
				System.out.print(num*num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
