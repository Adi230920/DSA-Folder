package DSA;

import java.util.*;

public class Lec_20 {

    public static void printPermutation(String str , String perm , int idx ){

        // Base Case 
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        // Operation and Recursive Call 
        for(int i=0 ; i<str.length() ; i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm + currChar, idx+1);
        }

    }

    public static void main(String[] args) {
        
        // BackTracking 

        String str = "ABC" ;

        printPermutation(str, "", 0);

        


    }
}