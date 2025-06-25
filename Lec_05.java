import java.util.*;

public class Lec_05 {
    public static void main(String[] args) {

        // Patterns

        // --------------------------------------------------------------------------------------

        // Pattern 1 : Check notes or patterns video 10:33 (Solid Rectangle)

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) //outer loop
        // { //inner loop
        // for (int j = 1; j <= m; j++)
        // {
        // System.out.print(" * ");
        // }
        // System.out.println(" ");
        // }

        // --------------------------------------------------------------------------------------

        // Pattern 2 : Check notes or patterns video 10:34 (Hollow Rectangle)

        // int n = 4;
        // int m = 5;

        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // ----------------------------------------------------------------------------------------

        // Pattern 3 : Check notes or patterns video 21:24 (Half Pyramid)

        // int n = 4;

        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j <= i /* upper limit */ ; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //-------------------------------------------------------------------------------

        // Pattern 4 : Check notes or patterns video 23:40 (Inverted Half Pyramid)

        // int n = 4 ; 

        // //outer loop 
        // for(int i=n ; i>=1 ; i--)
        // {
        //     //inner loop
        //     for(int j=1 ; j<=i ; j++)
        //     {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //-----------------------------------------------------------------------------------

        // Pattern 5 : Check notes or patterns video 31:31 (Inverted Half Pyramid) roted 180 degree

        int n = 4 ;

        //outer loop
        for(int i = 1 ; i <= n ; i++){
            //inner loop - space print 
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("   ");
            }
            
            //inner loop - star print 
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println(); 
        }

        //------------------------------------------------------------------------------

        // Pattern 6 : Check notes or patterns video 36:41 (Half Pyramid with Numbers)

        // int n = 5 ;

        // //outer loop 
        // for(int i = 1 ; i <= n ; i++){
        //     //inner loop 
        //     for(int j = 1 ; j <= i ; j++ ){
        //         System.out.print(" "+j+" ");
        //     }
        //     System.out.println();
        // }

        //----------------------------------------------------------------------------------

        // Pattern 7 : Check notes or patterns video 38:18 

        // int n = 5 ;

        // //outer loop 
        // for(int i = n ; i >= 1 ; i--){
        //     //inner loop 
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(" "+j+" ");
        //     }
        //     System.out.println();
        // }

        // Pattern 8 : Check notes or pattern video 47:19  (Floyds Triangle)

        // int n = 5 ;
        // int number = 1 ;

        // //outer loop 
        // for(int i = 1 ; i <= n ; i++){
        //     //inner loop 
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(" "+number+" ");
        //         number++; // number = number + 1 
        //     }
        //     System.out.println();
        // }

        //---------------------------------------------------------------------------------

        // Pattern 9 : Check notes or patterns video 53:18 (0 - 1 Triangle)

        // int n = 5 ;

        // //outer loop 
        // for(int i = 1 ; i <= n ; i++){
        //     //inner loop 
        //     for(int j = 1 ; j <= i ; j++){
        //         int sum = i + j ;
        //         if(sum % 2 == 0){
        //             System.out.print(" 1 ");
        //         }else{
        //             System.out.print(" 0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //-------------------------------------------------------------------------------

        // Homework Problem - 1 (Solid Rhombus)

        // int n = 5 ;

        // //outer loop
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop - space print 
        //     for(int j=1 ; j<=n-i ; j++){
        //         System.out.print(" ");
        //     }

        //     //inner loop - star print 
        //     for(int j=1 ; j<=n ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //--------------------------------------------------------------------------------------

        // Homework Problem - 2 (Number Pyramid)

        // int n = 5 ;

        // //outer loop
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop - space print 
        //     for(int j=1 ; j<=n-i ; j++){
        //         System.out.print(" ");
        //     }

        //     //inner loop - number print 
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(" "+i);
        //     }
        //     System.out.println();
        // }

        //-----------------------------------------------------------------------------------

        // Homework Problem - 3 : Pallindromic Number Pyramid 

        // int n = 5 ;

        // //outer loop
        // for(int i=1 ; i<=n ; i++){
        //     //inner loop - space print
        //     for(int j=1 ; j<=n-i ; j++){
        //         System.out.print(" ");
        //     }

        //     //inner loop - descending number print
        //     for(int j=i ; j>=1 ; j--){
        //         System.out.print(j);
        //     }

        //     //inner loop - ascending number print starting from 2 
        //     for(int j=2 ; j<=i ; j++){
        //         System.out.print(j);
        //     }  
        //     System.out.println();
        // }











        

        






    }

}
