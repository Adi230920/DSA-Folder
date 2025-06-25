public class Lec_06 {
    public static void main(String[] args) {
        
        // Advanced Patterns
        
        //-----------------------------------------------------------------------------------------

        // Pattern 10 : Check Notes or patterns video 2:28  (Butterfly pattern)

        // int n = 4 ;

        // // outer loop - upper part 
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop - half pyramid 
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(" * ");
        //     }

        //     //inner loop - 180 degree rotated half pyramid 
        //     //space print 
        //     for(int j=1 ; j<=2*(n-i) ; j++){
        //         System.out.print("   ");
        //     }
        //     //star print
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(" * ");
        //     }

        //     System.out.println();
        // }
        
        // // outer loop - lower part 
        // for(int i=n ; i>=1 ; i--){
        //     //inner loop - half pyramid 
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(" * ");
        //     }

        //     //inner loop - 180 degree rotated half pyramid 
        //     //space print 
        //     for(int j=1 ; j<=2*(n-i) ; j++){
        //         System.out.print("   ");
        //     }
        //     //star print
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(" * ");
        //     }

        //     System.out.println();
        // }

        //-----------------------------------------------------------------------------------

        // Pattern 11 : Check Notes or patterns video 16:08 (Solid Rhombus)

        // int n = 5 ;

        // //outer loop 
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop 
        //     //space print 
        //     for(int j=1 ; j<=(n-i) ; j++){
        //         System.out.print("   ");
        //     }
        //     //star print
        //     for(int j=1 ; j<=n ; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //----------------------------------------------------------------------------------------------------------------

        // Pattern 12 : Check Notes or patterns video 21:43 (Number Pyramid)

        // int n = 5 ;

        // //outer loop 
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop
        //     //space print 
        //     for(int j=1 ; j<=(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     //number print
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(" "+i);
        //     }
        //     System.out.println();    
        // }

        //---------------------------------------------------------------------------------------

        // Pattern 13 : Check Notes or patterns video 27:32 (Pallindrome Pyramid)

        // int n = 5 ;

        // //outer loop 
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop 

        //     //space print 
        //     for(int j=1 ; j<=(n-i) ; j++){
        //         System.out.print(" ");
        //     }

        //     //descending number print 
        //     for(int j=i ; j>=1 ; j--){
        //         System.out.print(j);
        //     }

        //     //ascending number print from 2 
        //     for(int j=2 ; j<=i ; j++){
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }

        // Pattern 14 : Check Notes or patterns video (Diamond Pattern )

        // int n = 4 ;

        // //outer loop - upper half 
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop 
            
        //     //space print 
        //     for(int j=1 ; j<=(n-i) ; j++){
        //         System.out.print("   ");
        //     }

        //     //star print  
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print(" * ");
        //     }

        //     System.out.println();
        // }
        
        // //outer loop - upper half 
        // for(int i=n ; i>=1 ; i--){
        //     //inner loop 
            
        //     //space print 
        //     for(int j=1 ; j<=(n-i) ; j++){
        //         System.out.print("   ");
        //     }

        //     //star print  
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print(" * ");
        //     }

        //     System.out.println();
        // }
        

    }
    
}
