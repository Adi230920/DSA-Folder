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

        //------------------------------------------------------------------------------------
        
        // Length
        System.out.println(fullName.length());

        //-------------------------------------------------------------------------------------
        
        //charAt
        for(int i=0 ; i<fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
        }

        //--------------------------------------------------------------------------------------

        // Comparison of 2 strings  
        String name1 = "Tony" ;
        String name2 = "Tony" ;

        if(name1.compareTo(name2) > 0 ){
            System.out.println(name1 + " is bigger than " + name2);
        }
        else if(name1.compareTo(name2) == 0){
            System.out.println("Both the strings are equal");
        }
        else{
            System.out.println(name2 + " is bigger than " + name1);
        }

        //-----------------------------------------------------------------------------------------

        // substring 

        String sentence = "My name is Tony" ;
        String name = sentence.substring(11,sentence.length());

        System.out.println(name);

        //------------------------------------------------------------------------------------------

        // Strings are immutable 

        




    }
    
}
