package Java_Basics;
import java.util.*;

public class Lec_02 {
    public static void main(String[] args) {
        //Output - gives us the code output
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");

//        //Variables - value of these variables can be changed
//        int a = 25 ;
//        int b = 10 ;
//        String name = "Tony Stark" ;
//        int age = 48 ;
//        double price = 25.25 ;
//
//        int sum = a + b ;
//        int diff = a - b ;
//        int multiply = a * b ;
//        //System.out.println(sum);
//        //System.out.println(diff);
//        //System.out.println(multiply);
//
//        a = 10 ;
//        b = 5 ;
//        //int que = (a * b) / (a - b) ;
//        int que = a * b / a - b ;
//        System.out.println(que);

//        // Input - Takes input values
//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("Enter your name : " );
//        //String name = sc.next(); // next() - only takes 1 token
//        String name = sc.nextLine(); //nextLine() - takes full token
//        System.out.println("Your name is " + name);
//
//        // nextInt() - takes int input
//        // nextFloat() - takes decimal input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number : ");
        float b = sc.nextFloat();
        float sum = a + b ;
        System.out.println("Sum : " + sum);







    }
}