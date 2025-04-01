import java.util.*;

class ClothSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter clothing size (S, M, L, XL, XXL): ");
        String size = sc.next(); 
        
        // Using switch statement
        switch (size) {
            case "S":
                System.out.println("Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "L":
                System.out.println("Large");
                break;
            case "XL":
                System.out.println("Extra Large");
                break;
            case "XXL":
                System.out.println("Double Extra Large");
                break;
            default:
                System.out.println("Invalid size entered");
        }
    }
}


 // Using if-else ladder
        /*
        if (size.equals("S")) {
            System.out.println("Small");
        } else if (size.equals("M")) {
            System.out.println("Medium");
        } else if (size.equals("L")) {
            System.out.println("Large");
        } else if (size.equals("XL")) {
            System.out.println("Extra Large");
        } else if (size.equals("XXL")) {
            System.out.println("Double Extra Large");
        } else {
            System.out.println("Invalid size entered");
        }
        */
