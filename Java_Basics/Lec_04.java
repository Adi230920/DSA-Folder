package Java_Basics;
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

        // -----------------------------------------------------------------------------------

        // Print the table of a number inputed by the user

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();

        // int table = 0;
        // for (int i = 0; i <= 10; i++) {

        // table = n * i;
        // System.out.println(n + " * " + i + " = " + table);

        // }

        // -----------------------------------------------------------------------------

        // Homework Problem -1 : Print all even numbers till n

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();

        // System.out.println("Even numbers between 0 to " + n + " : ");
        // for (int i = 0; i < n + 1; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        // -------------------------------------------------------------------------------

        // Homework Problem - 2 :
        // for(; ;) {
        //     System.out.println("Apna College");
        // }

        // -------------------------------------------------------------------------------

        // Homework Problem - 3 :

        // Scanner sc = new Scanner(System.in);
        // int choice;
        // do {
            
        //     System.out.println("Enter 1 to continue and 0 to stop : ");
        //     choice = sc.nextInt();

        //     if ( choice == 1 ){

        //         System.out.println("Enter the marks of student : ");
        //         int marks = sc.nextInt();

        //         if( marks >= 90 && marks <= 100 ){
        //             System.out.println("This is good");
        //         }
        //         if( marks >= 60 && marks <= 89 ){
        //             System.out.println("This is also good");
        //         }
        //         if( marks >= 0 && marks <= 59 ){
        //             System.out.println("This is good as well");
        //         }
        //         else{
        //             System.out.println("Please innsert marks between 0 to 100");
        //         }
        //     }

        // } while (choice == 1);

        //--------------------------------------------------------------------------------------

        // Bonus Homework Problem - Check whether a number is prime or not 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number to check prime or not : ");
        // int n = sc.nextInt();

        // boolean isPrime = true ;
        
        // if(n <= 1){
        //     isPrime = false;
        // }
        // else{
        //     for(int i=2 ; i <= Math.sqrt(n) ; i++){
        //         if(n % i == 0 ){
        //             isPrime = false ;
        //             break;
        //         }
        //     }
        // }

        // if(isPrime){
        //     System.out.println("Prime Number");
        // }else{
        //     System.out.println("Not Prime Number");
        // }
    }

}


