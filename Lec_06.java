public class Lec_06 {
    public static void main(String[] args) {
        
        // Advanced Patterns
        
        // Pattern 10 : Check Notes or patterns video 2:28  (Butterfly pattern)

        int n = 4 ;

        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("   ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("   ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }





    }
    
}
