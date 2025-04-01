 import java.util.*;

class votingage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
       

        if (age != 0 && age > 18) {
            System.out.println(age + " is valid age for voting");
        } else {
            System.out.println(age + " is Invalid age " );
        }
    }
}


