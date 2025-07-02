import java.util.*;

public class Lec_12 {
    public static void main(String[] args) {
        
        //Strings 

        //-----------------------------------------------------------------------------------

        // // String Declaration 
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "Tony is a boy";

        //------------------------------------------------------------------------------

        // //User input for string 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter you string : ");
        // String name = sc.nextLine();

        // System.out.println("Your name is " + name);

        //-------------------------------------------------------------------------------

        // Concatenation 

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName ;
        System.out.println(fullName);
        
        // Length
        System.out.println(fullName.length());
        
        //charAt
        for(int i=0 ; i<fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
        }

        


    }
    
}
