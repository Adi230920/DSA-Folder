import java.util.*;

public class Lec_08 {

    // Function to calculate average of 3 float numbers
    public static float printAverage(float a, float b, float c) {
        float average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();

        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();

        System.out.println("Enter the third number: ");
        float c = sc.nextFloat();

        float avg = printAverage(a, b, c);

        // Print average with 2 decimal places
        System.out.printf("The average of 3 numbers entered is %.2f\n", avg);

        sc.close(); // good practice to close Scanner
    }
}
