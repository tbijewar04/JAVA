import java.util.*;

class Core2web{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter first number: ");
                int a = sc.nextInt();

                System.out.println("Enter second number: ");
                int b = sc.nextInt();

		System.out.println("After a += 3, a = " +(a+=3));
		System.out.println("After b -= 2, b = "+(b-=2));
		System.out.println("After a *=2, a = "+(a*=2));
		System.out.println("After b /=3 , b = "+(b/=3));
		System.out.println("After a %= 5 , a = "+(a%5));
	}
}
