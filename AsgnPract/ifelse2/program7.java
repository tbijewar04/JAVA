import java.util.*;

class proloss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        int cost = sc.nextInt();
       
        System.out.print("Enter the selling price: ");
        int sell = sc.nextInt();


        if (sell > cost) {
            int res1 = sell - cost;
            System.out.println( "profit of " + res1 );
        } else if (sell < cost) {
             int res2 = cost - sell;
            System.out.println( "loss of " + res2 );
        } else if (sell == cost) {
            System.out.println(" no profit no loss" );
       }else{
            System.out.println(" invalid input");
      }

    }
}

