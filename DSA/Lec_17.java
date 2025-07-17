package DSA;

public class Lec_17 {

    // Print numbers from 5 to 1
    public static void printNumb(int n) {

        // Base Case
        if (n == 0) {
            return;
        }
        // Operation
        System.out.println(n);
        // Recursive call
        printNumb(n - 1);

    }

    // Print numbers from 1 to 5
    public static void printNumber(int n) {

        // Base Case
        if (n == 6) {
            return;
        }
        // Operation
        System.out.println(n);
        // Recursive call
        printNumber(n + 1);

    }

    // Print the sum of first (n) natural numbers
    public static void printingSum(int i, int n, int sum) {

        // Base Case
        if (i == n + 1) {
            System.out.println(sum);
            return;
        }
        // Operation
        sum = sum + i;
        // Recursive call
        printingSum(i + 1, n, sum);

    }

    // Print the factorial of a number 
    public static int calcFactorial(int n){

        // Base Case 
        if ( n == 1 || n == 0){
            return 1 ; 
        }
        // Operation 
        // Recursive call 
        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n * fact_nm1 ;
        return fact_n ;

    }

    // Print the fibonacci sequence till (nth) term 
    public static void printFib(int a , int b , int n){

        // a -> second last term 
        // b -> last term 

        // Base Case
        if ( n == 0){
            return ;
        } 
        // Operation 
        int c = a + b ; 
        System.out.println(c);
        // Recursive call 
        printFib(b,c, n-1);
    }

    // Print x^n ( Stack Height = n )
    public static int printxn(int x , int n){

        // Base Case 1 and 2  
        if ( n == 0 ){
            return 1 ; 
        }
        if ( x == 0 ){
            return 0;
        }
        // Operation and Recursive call 
        int value = x * printxn(x, n-1) ; 
        return value ; 
    }

    // Print x^n ( Stack Height = logn )
    public static int printxn_new(int x , int n){

        // Base Case 1 and 2  
        if ( n == 0 ){
            return 1 ; 
        }
        if ( x == 0 ){
            return 0;
        }
        
        // if n is even 
        if ( n % 2 == 0 ){
            return printxn_new(x, n/2) * printxn_new(x, n/2) ;
        }
        else{
            // if n is odd 
            return printxn_new(x, n/2) * printxn_new(x, n/2) * x ;
        }
    }


    public static void main(String[] args) {

        // Recursion - 1

        //int n = 7;

        // printNumb(n);
        // printNum(n);
        //printingSum(1, n, 0);

        // int factorial = calcFactorial(n);
        // System.out.println(factorial);  

        // int a = 0 ; 
        // int b = 1 ; 
        // int m = 7 ;


        // System.out.println(a);
        // System.out.println(b);
        // printFib(a,b,m-2);

        int x = 2 ;
        int n = 3 ;

        int ans = printxn(x,n);
        int ans1 = printxn_new(x,n);
        System.out.println(ans);
        System.out.println(ans1);




    }

}
