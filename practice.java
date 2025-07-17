import java.util.*;

public class practice {

    public static int findFactorial(int n){

        // Base Case
        if ( n == 1 || n == 0 ){
            return 1 ; 
        }  
        
        // Recursive call 
        // int fact_nm1 = findFactorial(n-1);
        // Operation
        int fact_n = n * findFactorial(n-1) ; 
        
        return fact_n ; 

    }

    // Print Fibonacci sequence till nth term 
    // public static void printFibo(int a , int b , int n){

    //     // Base Case 
    //     if(n==0){
    //         return;
    //     }
    //     // Operation 
    //     int c = a + b ; 
    //     System.out.println(c);
    //     // Recursive call 
    //     printFibo(b, c, n-1);

    // }

    public static void printFibo(int a , int b , int n){

        // Base Case 
        if(n == 0){
            return ;
        }
        // Operation 
        int c = a + b ;
        System.out.println(c);
        // Recursive call
        printFibo(b, c, n-1); 

    }

    public static int first = -1 ;
    public static int last = -1 ;

    public static void findOccurence(String str , int idx , char element){

        // Base Case 
        if(idx == str.length()){
            System.out.println("First occurence : " + first);
            System.out.println("Last occurence : " + last);
            return;
        }
        // Operation 
        int currCharac = str.charAt(idx);
        if( currCharac == element){
            if(first == -1){
                first = idx ;
            }
            else{
                last = idx ;
            }
        }
        // Recursive call
        findOccurence(str, idx+1, element);

    }

    // Check if an array is sorted (Strictly increasing)
    public static boolean isSorted(int arr[] , int idx){

        // Base Case 
        if(idx == arr.length-1){
            return true ; 
        }
        // Operation
        if( arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false ;
        }

    }

    




    public static void main(String[] args) {
        
        // int n = 4 ;
        // int m = 1 ;

        // System.out.println("Printing numbers from 5 to 1 \n");
        // printNumb(n);
        // System.out.println("\nPrinting numbers from 1 to 5 \n");
        // printNumber(m);
        // System.out.println("\nPrinting the sum of first " + n + " natural numbers ");
        // printingSum(1, n, 0);

        //------------------------------------------------------------------------------------------------------

        // int factorial = findFactorial(n);

        // System.out.println(factorial);

        //------------------------------------------------------------------------------------------------------

        // int a = 0 , b = 1 ;
        // int n = 10 ; 

        // System.out.println(a);
        // System.out.println(b);
        // printFibo(a, b, n-2);

        //------------------------------------------------------------------------------------------------------

        // int a = 0 , b = 1 , n = 10 ;

        // System.out.println(a);
        // System.out.println(b);
        // printFibo(a, b, n-2);

        //---------------------------------------------------------------------------------------------------------

        // String str = "aditya" ;
        // findOccurence(str, 0, 'x');

        //---------------------------------------------------------------------------------------------------------

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the array size : ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // // Array input
        // System.out.println("Enter elements to add in array : ");
        // for(int i=0 ; i<=size-1 ; i++){
        //     arr[i] = sc.nextInt();
        // }
        
        // System.out.println(isSorted(arr, 0));

        //---------------------------------------------------------------------------------------------------------

        // String str = "xxaxbcxxd" ;

        // String newstr = "" ;

        // moveAllX(str, 0, 0, newstr);

        // System.out.println(newstr);

        





    }

    
}