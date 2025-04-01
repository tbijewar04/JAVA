import java.util.*;

class pythago {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st input: ");
        int a = sc.nextInt();

         System.out.print("Enter the 2nd input: ");
        int b = sc.nextInt();
        
          System.out.print("Enter the 3rd input: ");
        int c = sc.nextInt();
      

        if ((a*a) + (b*b) == (c*c)) {
                        System.out.println(" its a pythagorean triplet");
              }else{
            System.out.println(" its not a pythagorean triplet");
      }

    }
}


