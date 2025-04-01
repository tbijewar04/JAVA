import java.util.*;

class SubscriptionPlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you are willing to pay: ");
        int amount = sc.nextInt();
        

        String plan;
        switch (amount) {
            case 799:
                plan = "Platinum Plan";
                break;
            case 599:
                plan = "Gold Plan";
                break;
            case 399:
                plan = "Silver Plan";
                break;
            case 199:
                plan = "Bronze Plan";
                break;
            default:
                plan = (amount < 199) ? "Free Plan with limited access" : "Invalid amount";
        }

        System.out.println("You are eligible for: " + plan);
    }
}


/* // Using if-else ladder
        if (amount == 799) {
            plan = "Platinum Plan";
        } else if (amount == 599) {
            plan = "Gold Plan";
        } else if (amount == 399) {
            plan = "Silver Plan";
        } else if (amount == 199) {
            plan = "Bronze Plan";
        } else {
            plan = (amount < 199) ? "Free Plan with limited access" : "Invalid amount";
        }
*/
