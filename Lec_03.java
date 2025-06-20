import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Lec_03 {
    public static void main(String[] args) {


        // Conditional Statements

// --------------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age : ");
        // int age = sc.nextInt();
        //
        // if(age > 18)
        // {
        // System.out.println("Adult");
        // }
        // else
        // {
        // System.out.println("Not Adult");
        // }

// -----------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int num = sc.nextInt();
        //
        // if ( num % 2 == 0 ) {
        // System.out.println("Even Number");
        // }
        // else {
        // System.out.println("Odd Number");
        // }
        //
// --------------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter the value of b : ");
        // int b = sc.nextInt();

        // if ( a == b ){
        // System.out.println("The two numbers are equal .");
        // }
        // else if ( a > b){
        // System.out.println("a is greater");
        // }
        // else {
        // System.out.println("a is lesser");
        // }
// ---------------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the button number :");
        // int button = sc.nextInt();

        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaste");
        // } else if (button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid Button");
        // }

//------------------------------------------------------------------------------------------

        // switch (button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Invalid Button");
        // }

//-------------------------------------------------------------------------------------------

// Homework Problem -1 (Calculator)
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("For Addition press button 1");    
        // System.out.println("For Subtraction press button 2");    
        // System.out.println("For Multiplication press button 3");    
        // System.out.println("For Division press button 4");    
        // System.out.println("For Modulo press button 5");
        
        // System.out.print("Enter the First Number : ");
        // int a = sc.nextInt();
        // System.out.print("Enter the Second Number : ");
        // int b = sc.nextInt();

        // System.out.print("Enter your desired button : ");
        // int button = sc.nextInt();

        // switch(button){
        //     case 1 : System.out.println("Sum : " + (a+b));
        //     break;
        //     case 2 : System.out.println("Difference : " + (a-b));
        //     break;
        //     case 3 : System.out.println("Multiplication: " + (a*b));
        //     break;
        //     case 4 : System.out.println("Division : " + (a/b));
        //     break;
        //     case 5 : System.out.println("Modulo : " + (a%b));
        //     break;
        //     default : System.out.println("Invalid Button");
        // }

// -----------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number : ");
        int month = sc.nextInt();

        switch(month){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("August");
            break;
            case 9 : System.out.println("September");
            break;
            case 10 : System.out.println("October");
            break;
            case 11 : System.out.println("November");
            break;
            case 12 : System.out.println("December");
            break;
            default:System.out.println("Invalid month");
        }

    }
}