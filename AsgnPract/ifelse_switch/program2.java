import java.util.*;

class GradeRemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0); 
      

        // Using switch statement
        switch (grade) {
            case 'O':
                System.out.println("Outstanding");
                break;
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Satisfactory");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade Entered");
        }
    }
}


        // Using if-else ladder
        /*
        if (grade == 'O') {
            System.out.println("Outstanding");
        } else if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Very Good");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Satisfactory");
        } else if (grade == 'E') {
            System.out.println("Needs Improvement");
        } else if (grade == 'F') {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Grade Entered");
        }
        */

