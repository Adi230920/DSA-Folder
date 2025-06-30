import java.util.*;

public class Lec_07 {

    // Print a given name in a function 
    public static void printMyName(String name) {
        System.out.println("Your Name is "+ name);
        return;
    }

    public static void main(String[] args) {

        // Functions and Methods

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        printMyName(name);
        



    }

}
