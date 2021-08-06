import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        n= s.nextInt();
        
// ---------------------------------------------------------------
        int i=1;
        int p=1;
        while(i<=n){
            p=i;
            int j=1;
            while(j<=i){
                System.out.print(p);
                p=p-1;
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
// -----------------------------------------------------------
        // int i=1;
        // // int p=1;
        // while(i<=n){
        //     // p=i;
        //     int j=1;
        //     while(j<=i){
        //         char jthchar=(char)('A'+i-1);
        //         System.out.print(jthchar);
        //         // p=p-1;
        //         j=j+1;
        //     }
        //     System.out.println();
        //     i=i+1;
        // }


    // -------------------------------------
    // int i=1;
    //     // int p=1;
    //     while(i<=n){
    //         // p=i;
    //         int j=1;
    //         while(j<=i){
    //             char jthchar=(char)('A'+j-1);
    //             System.out.print(jthchar);
    //             // p=p-1;
    //             j=j+1;
    //         }
    //         System.out.println();
    //         i=i+1;
    //     }
// --------------------------------------------------------------
        // int i=1;
        // // int p=1;
        // while(i<=n){
        //     char p=(char)('A'+i-1);
        //     // p=i;
        //     int j=1;
        //     while(j<=n){
                
        //         System.out.print(p);
        //         p=(char)(p+1);
        //         j=j+1;
        //     }
        //     System.out.println();
        //     i=i+1;
        // }
// -----------------------------------------------------------------

        //     int i=1;
        // // int p=1;
        // while(i<=n){
        //     char p=(char)('A'+i-1);
        //     // p=i;
        //     int j=1;
        //     while(j<=i){
                
        //         System.out.print(p);
        //         p=(char)(p+1);
        //         j=j+1;
        //     }
        //     System.out.println();
        //     i=i+1;
        // }
// ------------------------------------------------------------
            // int i=n+1;
            // // int p=1;
            // while(i>=1){
            //     char p=(char)('A'+i-1);
            //     // p=i;
            //     int j=i;
            //     while(j<=n){
            //         System.out.print(p);
            //         p=(char)(p+1);
            //         j=j+1;
            //     }
            //     System.out.println();
            //     i=i-1;
                
            // }
// ---------------------------------------------
            // int i=n-1;
            // while(i>=1){
            //     char p=(char)('A'+i-1);
            //     int j=i;
            //     while(j<=n){
            //         System.out.print(p);
            //         p=(char)(p+1);
            //         j++;
            //     }
            //     i--;
            //     System.out.print("\n");
            // }


            // int i=1;
            // int p=1;
            // while(i<=n){
            //     // char p=(char)('A'+i-1);
            //     p=i;
            //     int j=1;
            //     while(j<=i){
                    
            //         System.out.print(p);
            //         p=p-1;
            //         // p=(char)(p-1);
            //         j=j+1;
            //     }
            //     System.out.println();
            //     i=i+1;
            // }

    }
    
}
