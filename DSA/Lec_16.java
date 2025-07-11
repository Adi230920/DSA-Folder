package DSA;

public class Lec_16 {

    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Sorting

        // --------------------------------------------------------------------------------------------

        // Bubble Sort

        // int arr[] = { 7, 8, 3, 1, 2 };

        // System.out.print("Original Array : ");
        // printArray(arr);

        // //outer loop 
        // for(int i=0 ; i<=arr.length -1 ; i++){
        //     //inner loop 
        //     for(int j=0 ; j<arr.length-i-1 ; j++){
        //         if(arr[j] > arr[j+1]){
        //             //swap 
        //             int temp = arr[j] ;
        //             arr[j] = arr[j+1] ;
        //             arr[j+1] = temp ;
        //         }
        //     }
        // }

        // System.out.print("Sorted Array : ");
        // printArray(arr);

        //---------------------------------------------------------------------------------------------
        
        // Selection Sort 

        // int arr[] = { 7, 8, 3, 1, 2 };

        // System.out.print("Original Array : ");
        // printArray(arr);
        
        // // 7 8 3 1 2 

        // //outer loop 
        // for(int i=0 ; i<arr.length ; i++){
        //     int smallest = i ;
        //     //inner loop 
        //     for(int j=i+1 ; j<arr.length ; j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j ;
        //         }
        //     }
        //     // swap arr[smallest] and arr[i]
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        // System.out.print("Sorted Array : ");
        // printArray(arr);

        //---------------------------------------------------------------------------------------------------

        // Insertion Sort 

        int arr[] = { 7, 8, 3, 1, 2 };

        System.out.print("Original Array : ");
        printArray(arr);
        
        // 7 8 3 1 2 

        // outer loop 
        for(int i=1 ; i<arr.length ; i++){
            int current = arr[i] ; // 8 
            int j = i-1 ; // 7 

            while ( j>=0 && current < arr[j]){
                arr[j+1] = arr[j] ;
                j--;
            }

            //placement 
            arr[j+1] = current ;
        }

        System.out.print("Sorted Array : ");
        printArray(arr);

        //-------------------------------------------------------------------------------------------------------------
    }

}
