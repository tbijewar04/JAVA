import java.util.*;

class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a traffic light color: ");
        String color = sc.next(); 
        

        // Using switch statement
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("wait");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("No such color present in traffic lights.");
        }
    }
}


// Using if-else ladder
        /*
        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Get Ready");
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("No such color present in traffic lights.");
        }
        */
