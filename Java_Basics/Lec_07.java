package Java_Basics;
import java.util.*;

public class Lec_07 {

    // Print a given name in a function
    public static void printMyName(String name) {
        System.out.println("Your Name is " + name);
        return;
    }

    // Add 2 number and return the sum
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Multiply 2 number and return the product
    public static int calculateProduct(int a , int b){
        int product = a * b ;
        return product ;
    }

    // Print the factorial of a number 
    public static void printFactorial(int n){

        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1 ;
        for(int i=n ; i>=1 ; i--){
            factorial = factorial * i ;
        }
        System.out.println(factorial);
        return; //if we do not write return in void then also it is ok 

    }

    // Homework Problems 

    // Problem 1 : Make a function to check if a number is prime or not.
    public static void PrimeNumberChecker(int num){
        boolean isPrime = true ;

        if(num <= 1){
            System.out.println("Invalid Number.");
            return;
        }
        else{
            for(int i=2 ; i <= Math.sqrt(num) ; i++){
                if(num % i == 0){
                    isPrime = false ;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime Number.");
            return;
        }
        else{
            System.out.println("Not a Prime Number.");
            return;
        }
    }




    // Problem 2 : Make a function to check if a given number n is even or not.
    public static void isEvenOrOddChecker(int num){

        if( num % 2 == 0){
            System.out.println("Even Number.");
            return;
        }
        else{
            System.out.println("Odd Number.");
            return;
        }

    }
    
    
    // Problem 3 : Make a function to print the table of a given number n.
    public static void printTable(int num){
        int table = 0 ;
        for(int i=1 ; i <= 10 ; i++){
            table = num * i ; 
            System.out.println(num + " * " + i + " = " + table);
        }

    }


    // Main Function 
    public static void main(String[] args) {

        // Functions and Methods

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name = sc.nextLine();

        // printMyName(name);

        //------------------------------------------------------------------------------------------

        // System.out.print("Enter the first number : ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second number : ");
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);

        // System.out.print("The sum of " + a + " and " + b + " is " + sum);

        // int product = calculateProduct(a, b) ;

        // System.out.print("The product of " + a + " and " + b + " is " + product);

        //----------------------------------------------------------------------------------------------

        // System.out.print("Enter the number to find factorial : ");
        // int n = sc.nextInt();

        // System.out.print("The factorial of "+ n +" is ");
        // printFactorial(n);

        //------------------------------------------------------------------------------------------------

        // System.out.print("Enter the number to check even or odd : ");
        // int n = sc.nextInt();

        // isEvenOrOddChecker(n);

        //----------------------------------------------------------------------------------------------------

        // System.out.print("Enter the number to print its table : ");
        // int num = sc.nextInt();

        // printTable(num);

        //-------------------------------------------------------------------------------------------------------

        // System.out.print("Enter the number to check prime or not : ");
        // int n = sc.nextInt();

        // PrimeNumberChecker(n);

        //---------------------------------------------------------------------------------------------------------








 


    }

}
