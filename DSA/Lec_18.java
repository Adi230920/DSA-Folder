package DSA;

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
                newString = newString + 'x';
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
            newString = newString + currChar ;
            moveAllX(str, idx+1, count, newString);
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

        String str = "axbcxxd" ;
        String newStr = "" ;

        moveAllX(str, 0, 0, newStr);

        System.out.println(newStr);
        







    }
    
}
