package DSA;

import java.util.*;

public class Lec_19 {

    // Print all permutations of a string 
    public static int count = 0 ;
    public static void printPerm(String str , String permutation){

        // Base Case
        if(str.length() == 0){
            System.out.println(permutation);
            count++;
            return;
        } 
        // Operation
        for(int i=0 ; i<=str.length()-1 ; i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    // Count total paths in a maze to move from (0,0) to (n,m)
    public static int countPaths(int i , int j , int n , int m ){

        // Base Case - 1 
        if(i == n || j == m){
            return 0 ;
        }
        // Base Case - 2
        if(i == (n-1) && j == (m-1)){
            return 1 ;
        } 
        // Operation 
        // moving downwards
        int downPaths = countPaths(i+1, j, n, m); 
        // moving right 
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths+rightPaths;

    }

    // Place Tiles of size (1xm) in a floor of size (nxm)
    public static int placeTiles(int n , int m){

        // Base Case - 1
        if( n == m){
            return 2 ;
        } 
        // Base Case - 2 
        if( n < m){
            return 1 ;
        }

        // Operation 

        // vertically - recursion applied here 
        int vertPlacements = placeTiles(n-m, m);
        // horizontally - recursion applied here
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements ;

    }
    
    // Find the number of ways in which you can invite n people to your party , single or in pairs 
    public static int callGuests(int n){

        // Base Case 
        if(n <= 1){
            return 1 ;
        }

        // calling single guests 
        int ways1 = callGuests(n-1);

        // calling pair guests 
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2 ;

    }

    // Print all the subsets of a set of first (n) natural numbers 
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0 ; i< subset.size() ; i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static int countComb = 0 ;
    public static void findSubsets(int n , ArrayList<Integer> subset){

        // Base Case 
        if(n == 0){
            printSubset(subset);
            countComb++;
            return;
        }
        // Add hoga 
        subset.add(n);
        findSubsets(n-1, subset);

        // Add nahi hoga 
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);


    }

    public static void main(String[] args) {
        
        // Recursion - 03 

        // String str = "abc" ;
        // String newStr = " " ;
        // printPerm(str, newStr);
        // System.out.println(newStr);

        // int n = 3 , m = 3 ;
        // int totalPaths = countPaths(0, 0, n, m);
        // System.out.println(totalPaths);

        // int n = 4 ; 
        // int m = 2 ;

        // System.out.println(placeTiles(n, m));

        // int n = 4 ; 
        // System.out.println(callGuests(n));

        // int n = 3 ;
        // ArrayList<Integer> subset = new ArrayList<>();
        // findSubsets(n, subset);

        // System.out.println("Total Subsets : " + countComb);

        



    }
    
}
