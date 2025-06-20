import java.util.*;

public class Lec_04 {
    public static void main(String[] args) {

        // Loops

        // for loop

        // for (int counter = 0; counter < 100; counter = counter + 1) {
        // System.out.println("Hello World");
        // }

        // -----------------------------------------------------------------------

        // for(int counter = 0 ; counter < 11 ; counter++ ){

        // System.out.print(counter + " ");
        // }
        // i ++ => counter = counter + 1

        // ------------------------------------------------------------------------

        // while loop

        // int i = 0;
        // while (i < 11) {
        // System.out.print(i);
        // i++;
        // }

        // -------------------------------------------------------------------------

        // do - while loop

        // int i = 0; // initialisation
        // do {
        // System.out.println(i);
        // i++;

        // } while (i < 11);

        // --------------------------------------------------------------------------

        // Print the sum of n natural numbers

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();

        // int sum = 0 ;
        // for(int i = 1 ; i <= n ; i++){
        // sum = sum + i ;
        // }
        // System.out.println("Sum : " + sum);

        // Print the table of a number inputed by the user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int table = 0;
        for (int i = 0; i <= 10; i++) {

            table = n * i;
            System.out.println(n + " * " + i + " = " + table);

        }

        //-----------------------------------------------------------------------------

    }

}
