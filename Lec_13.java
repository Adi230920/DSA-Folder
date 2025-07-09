import java.util.*;
public class Lec_13 {

    public static void main(String[] args) {

        // String Builder

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String newString = sc.nextLine();

        // Declaration
        StringBuilder sb = new StringBuilder(newString);


        //System.out.println(sb);

        // ----------------------------------------------------------------------------

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // -------------------------------------------------------------------------------

        // //set char at index 0
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // ---------------------------------------------------------------------------------
        // inserting a character at a particular index in code 
        // sb.insert(2, 'n');
        // System.out.println(sb);

        //------------------------------------------------------------------------------------
        // deleting a particualr character at an index 
        // sb.delete(2, 3);
        // System.out.println(sb);
        // sb.delete(2, 4);
        // System.out.println(sb);

        //-------------------------------------------------------------------------------------

        // append - adding a character at the end 
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println("Length of String : " + sb.length());

        //---------------------------------------------------------------------------------------

        // String Reversal 
        System.out.println("Original String : " + sb);

        for(int i=0 ; i<sb.length()/2 ; i++){
            int front = i ;
            int back = sb.length() - 1 - i ;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println("Reversed String : " + sb);


        
        
    }
}