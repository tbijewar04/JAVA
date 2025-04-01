import java.util.*;

 class ShippingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Choose a shipping method:");
        System.out.println("1. Standard Shipping");
        System.out.println("2. Express Shipping");
        System.out.println("3. Same Day Delivery");
        System.out.println("4. International Shipping");

        int shippingChoice = sc.nextInt();

        double shippingCost = 0;

        switch (shippingChoice) {
            case 1:
                shippingCost = 5.99; 
                System.out.println("You chose Standard Shipping. The cost is: $" + shippingCost);
                break;
            case 2:
                shippingCost = 15.99; 
                System.out.println("You chose Express Shipping. The cost is: $" + shippingCost);
                break;
            case 3:
                shippingCost = 25.99; 
                System.out.println("You chose Same Day Delivery. The cost is: $" + shippingCost);
                break;
            case 4:
                shippingCost = 50.99; 
                System.out.println("You chose International Shipping. The cost is: $" + shippingCost);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid shipping method.");
                break;
        }

      
    }
}

