import java.util.ArrayList;

public class practice {

    // Print all the permutations of a string 
    public static int count = 0 ;
    public static void printPermutation(String str , String permutation){

        // Base Case 
        if(str.length() == 0){
            System.out.println(permutation);
            count++;
            return;
        }
        // Operation 
        for(int i=0 ; i<=str.length()-1 ; i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1) ;
            printPermutation(newStr, permutation+currChar);
        }

    }

    // Count total paths in a maze from (0,0) to (n,m)
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
        // Operation 
        // Calling single guests
        int way1 = callGuests(n-1); 
        // Calling pair guests 
        int way2 = (n-1) * callGuests(n-2);

        return way1 + way2 ;

    }

    // Print all the subsets of a set of first (n) natural numbers 
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0 ; i<subset.size() ; i++){
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

        // Operation 
        // Add Hoga
        subset.add(n);
        findSubsets(n-1, subset); 
        // Add Nahi Hoga 
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }

    public static void main(String[] args) {
        
        // Recursion - 03 

        // String str = "abc" ;
        // String newStr = " " ;
        // printPermutation(str, newStr);
        // System.out.println(newStr);
        // System.out.println("Total Permutations : " + count);


        // int n = 3 ; 
        // int m = 3 ;
        // int totalPaths = countPaths(0, 0, n, m);
        // System.out.println("Total Paths : " + totalPaths);

        // int n = 4 ;
        // int m = 2 ;
        // System.out.println(placeTiles(n, m));

        // int n = 4 ;
        // System.out.println(callGuests(n));

        int n = 3 ;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
        System.out.println("Total Subsets : " + countComb);








    }
}