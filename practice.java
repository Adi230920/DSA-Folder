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

    // Remove Duplicates in a string 
    public static boolean map[] = new boolean[26] ; // maping array 

    public static void removeDuplicates(String str , int idx , String newString){

        // Base Case 
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        // Operation 
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString = newString + currChar ;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }

    }

    // Print all the subsequences of a string 
    public static void subsequences(String str , int idx , String newString){

        // Base Case 
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        // Operation & Recursive call 
        char currChar = str.charAt(idx);
        // Call 1 : If he chooses
        subsequences(str, idx+1, newString+currChar);
        // Call 2 : If he does not choose 
        subsequences(str, idx+1, newString);

    }

    // Print all the unique subsequences of a string 
    public static void subsequences_unique(String str , int idx , String newString , HashSet<String> set){

        // Base Case
        if(idx == str.length()){
            if(set.contains(newString)){
                return ;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        } 
        // Operation 
        char currChar = str.charAt(idx) ;
        // Call 1 
        subsequences_unique(str, idx+1, newString+currChar, set);
        // Call 2
        subsequences_unique(str, idx+1, newString, set);

    }

    // Print keypad combination 
    public static String keypad [] = {"." , "abc" , "def" , "ghi" , "jkl" ,"mno" , "pqrs" , "tu" , "vwx" ,"yz" };

    public static void printCombination(String str , int idx , String combination){

        // Base Case 
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        // Operation 
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0 ; i<mapping.length() ; i++){
            printCombination(str, idx+1, combination+mapping.charAt(i));
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

        // String str = "abbccda" ;
        // String newString = "" ;

        // removeDuplicates(str, 0, newString);

        // System.out.println(newString);

        // String str = "abc" ;
        // String newString = "";

        // subsequences(str, 0, newString);

        // System.out.println(newString);
        
        // String str = "aaaa" ;
        // String newString = "";
        // HashSet<String> set = new HashSet<>();

        // subsequences_unique(str, 0, newString, set);

        // System.out.println(newString);

        String str = "23" ;
        String combination = "" ;

        printCombination(str, 0, combination);

        System.out.println(combination);



        





    }

    
}