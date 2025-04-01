import java.util.*;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for subject 1: ");
        int a = sc.nextInt();

        System.out.println("Enter the marks for subject 2: ");
        int b = sc.nextInt();

        System.out.println("Enter the marks for subject 3: ");
        int c = sc.nextInt();

        System.out.println("Enter the marks for subject 4: ");
        int d = sc.nextInt();

        System.out.println("Enter the marks for subject 5: ");
        int e = sc.nextInt();

        
        if (a < 40 || b < 40 || c < 40 || d < 40 || e < 40) {
            System.out.println("You failed the exam.");
        } else {
            
	  int sum = a + b + c + d + e;
          int per = sum / 5;

            switch (per / 10) {
                case 10:
		case 9:
                case 8:
                    System.out.println("Grade: First Class with Distinction");
                    break;
                case 7:
                    System.out.println("Grade: First Class");
                    break;
                case 6:
                    System.out.println("Grade: Second Class");
                    break;
                default:
                    System.out.println("Grade: Pass Class");
            }
        }
    }
}
