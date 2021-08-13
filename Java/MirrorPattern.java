import java.util.Scanner;
public class MirrorPattern{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        // int i=1;
        // while(i<=n){
        //     int spaces=1;
        //     while(spaces<=n-i){
        //         System.out.print(" ");
        //         spaces=spaces+1;
        //     }
        //     int stars=1;
        //     while(stars<=i){
        //         System.out.print("*");
        //         stars=stars+1;

        //     }
        //     System.out.println();
        //     i=i+1;

        // }

        // ----------------------------------------------------------
    //     int i=1;
    //     while(i<=n){
    //         int j=1;
    //         while(j<=n-i+1){
    //             System.out.print("*");
    //             j=j+1;
    //     }
    //     System.out.println();
    //     i=i+1;
    // }
// ----------------------------------------------------------------------
            // int i=1;
            // while(i<=n){
            //     int j=1;
            //     while(j<=n-i+1){
            //         System.out.print(n-i+1);
            //         j=j+1;
            // }
            // System.out.println();
            // i=i+1;
            // }
    // -------------------------------------------------------------------
    // int i=1;
    //     while(i<=n){
    //         int spaces=1;
    //         while(spaces<=n-i){
    //             System.out.print(" ");
    //             spaces=spaces+1;
    //         }
    //         int j=1;
    //         while(j<=i){
    //             System.out.print(j);
    //             j=j+1;

    //         }
    //         System.out.println();
    //         i=i+1;

    //     }
        // -----------------------------------------------------------
        // int i=1;
        // while(i<=n){
        //     int spaces=1;
        //     while(spaces<=n-i){
        //         System.out.print(" ");
        //         spaces=spaces+1;
        //     }
        //     // -------increaseing part------------
        //     int j=1;
        //     while(j<=i){
        //         System.out.print(j);
        //         j=j+1;
        //     }
        //     // ------decreasing part-----------------
        //     int k=i-1;
        //     while(k>=1){
        //         System.out.print(k);
        //         k=k-1;
        //     }
        //     System.out.println();
        //     i=i+1;

        // }
// --------------------------------------------------------------------
// int i=1;
// while(i<=n){
//     int spaces=1;
//     while(spaces<=n-i){
//         System.out.print(" ");
//         spaces=spaces+1;
//     }
//     // -------increaseing part------------
//         int j=1;
//         while(j<=i){
//             System.out.print("*");
//             j=j+1;

//         }
//         // ------decreasing part-----------------
//         int k=i-1;
//         while(k>=1){
//             System.out.print("*");
//             k=k-1;
//         }
//         System.out.println();
//         i=i+1;

//     }

// ----------------------------------------------
        // int i=1;
        
        // while(i<=n){
        //     int spaces=1;
        //     while(spaces<=n-i){
        //         System.out.print(" ");
        //         spaces=spaces+1;
        //     }
        //     // -------increaseing part------------
        //     int j=1;
        //     while(j<=i){
        //         int p=i;
        //         System.out.print(p+j-1);
        //         p=p-1;
        //         j=j+1;
        //     }
        //     // ------decreasing part-----------------
        //     int k=i-1;
        //     while(k>=1){
        //         System.out.print(k+i-1);
        //         k=k-1;
        //     }
        //     System.out.println();
        //     i=i+1;

        // }

        // ---------------------------------------------------

            // int i=1;
            // while(i<=(n/2)+1){
            //     int spaces=1;
            //     while(spaces<=(n/2)+1-i){
            //         System.out.print(" ");
            //         spaces=spaces+1;
            //     }
            //     // -------increaseing part------------
            //     int j=1;
            //     while(j<=(2*i)-1){
            //         System.out.print("*");
            //         j=j+1;

            //     }
            //     // ------decreasing part-----------------
            //     // int k=i-1;
            //     // while(k>=1){
            //     //     System.out.print("*");
            //     //     k=k-1;
            //     // }
                
            //     System.out.println();
            //     i=i+1;
            // }
            // i=1;
            // while (i <= n / 2) {
            //     // This tells us the number of spaces to give.
            //     int spaces = 1;
            //     while (spaces <= i) {
            //         System.out.print(" ");
            //         spaces=spaces+1;
            //     }
    
            //     int j = 2 * ((n / 2) - i + 1) - 1;
    
            //     // This tells us the number of stars for current row.
            //     while (j >= 1) {
            //         System.out.print("*");
            //         j=j-1;
            //     }
    
            //     System.out.println();
            //     i=i+1;
            // }

            // ---------------------------------------------------------
            System.out.println("*");
            int i=1;
            while(i<=n){
            
                System.out.print("*");
                int j=1;
                while(j<=i){
                
                    System.out.print(j);
                    j=j+1;  
                }
                int k=i-1;
                while(k>=1){
                    System.out.print(k);
                    k=k-1;

                }
                System.out.print("*");

            System.out.println();
            i=i+1;
        }
        // -------lower part-----------
        i=n-1;
        while(i>=1){
        
            System.out.print("*");
            
            int j=1;
            while(j<=i){
            
                System.out.print(j);
                j=j+1;
            }
            int k=i-1;
            while(k>=1){
                System.out.print(k);
                k=k-1;
            }
            System.out.print("*");
            System.out.println();
            i=i-1;
        }
        System.out.print("*");
    


    }
}