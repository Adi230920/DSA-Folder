package DSA;

import java.util.HashSet;
import java.util.Scanner;

public class Lec_18 {

    // Tower of Hanoi 
    public static void towerOfHanoi(int n , String src , String helper , String dest){

        // Base Case 
        if( n == 1){
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Operation 
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    // Print a string in reverse 
    public static void stringReverse(String str , int idx){

        // Base Case 
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return ;
        }
        // Operation 
        System.out.print(str.charAt(idx) + " ");
        // Recursive call 
        stringReverse(str, idx-1);

    }

    // Find the first and last occurence of an element in a string

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
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false ;
        }
        
    }

    // Move all (x) to the end of string "axbcxxd"
    public static void moveAllX(String str , int idx , int count , String newString){

        // Base Case 
        if(idx == str.length()){
            for(int i=0 ; i<count ; i++){
                newString = newString + 'x' ;
            }
            System.out.println(newString);
            return;
        }
        // Operation 
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString = newString + currChar;
            moveAllX(str, idx+1, count, newString);
        }

    }

    // Remove Duplicates in a string 
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str , int idx , String newString){

        // Base Case 
        if(idx == str.length()){
            System.out.println(newString);
            return ;
        }
        // Operation 
        char currChar = str.charAt(idx) ;
        if( map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString = newString + currChar ;
            map[currChar - 'a'] = true ;
            removeDuplicates(str, idx+1, newString);
        }

    }

    // Print all the subsequences of a string 
    public static void subsequences(String str , int idx , String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return ;
        }

        char currChar = str.charAt(idx);
        // to be 
        subsequences(str, idx+1, newString+currChar);
        
        // or not to be 
        subsequences(str, idx+1, newString);

    }

    // Print all the unique subsequences of a string 
    public static void subsequences_unique(String str , int idx , String newString , HashSet<String>set){

        // Base Case 
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return ;
            }
        }
        // Operation
        char currChar = str.charAt(idx); 
        // Call 1 
        subsequences_unique(str, idx+1, newString+currChar, set);
        // Call 2 
        subsequences_unique(str, idx+1, newString, set);

    }

    // Print keypad combination 
    public static String keypad [] = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" } ;

    public static void printComb(String str , int idx , String combination){

        // Base Case
        if(idx == str.length()){
            System.out.println(combination);
            return ;
        } 
        // Operation 
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0 ; i<mapping.length() ;i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }

    }


    public static void main(String[] args) {
        
        // Recursion - 02 

        // int n = 4 ;
        // towerOfHanoi(n, "S", "H", "D");

        // String str = "abcd" ;
        // stringReverse(str, str.length()-1);

        // String str = "abaacdaefaah";
        // findOccurence(str, 0, 'a');

        // int arr[] = {1,2,3,3,5} ;
        // System.out.println(isSorted(arr, 0));

        // String str = "axbcxxd" ;
        // String newStr = "" ;

        // moveAllX(str, 0, 0, newStr);
        // System.out.println(newStr);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string : ");
        // String str = sc.nextLine();
        // //String str = "abbccda" ;
        // String newStr = "" ;
        // removeDuplicates(str, 0, newStr);
        // System.out.println(newStr);

        // String str = "abc" ;
        // String newString = "" ;

        // subsequences(str, 0, newString);

        // System.out.println(newString);
        
        // String str = "aaa" ;
        // String newString = "" ;
        // HashSet <String> set = new HashSet<>();

        // subsequences_unique(str, 0, newString,set);

        // System.out.println(newString);

        String str = "4" ; 
        String combination = "" ;

        printComb(str, 0, combination);

        System.out.println(combination);




        







    }
    
}
