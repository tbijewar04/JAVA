import java.util.*;

class Company {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the company name:");
        String name = sc.next();

        System.out.println("Enter location:");
        String location = sc.next();

        System.out.println("Enter employee count:");
        int employeeCount = sc.nextInt();

        System.out.println("Enter average salary:");
        float avgSalary = sc.nextFloat();

        System.out.println("Company name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Employee count: " + employeeCount);
        System.out.println("Average Salary: " + avgSalary);
    }
}

