import java.util.*;

class eledevice{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your budget price: ");
        int price = sc.nextInt();
      

        if ( price >= 100000) {
            System.out.println(" iphone or samsung series");
      }else if( price < 50000 && price >= 30000){
            System.out.println(" oneplus ");
      }else if( price < 20000 ){
            System.out.println(" vivo, oppo ");
      }else{
            System.out.println(" realme, redmi ");
        }

    }
}

