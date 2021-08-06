import java.util.Scanner;
public class Paralellogram {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        // int i=1;
        // while(i<=n){
        //     int j=1;
        //     while(j<=i-1){
        //         System.out.print(" ");
        //         j=j+1;

        //     }

        // // ------decreasing part-----------------
        //     int k=i-1;
        //     while(k>=i-n){
        //         System.out.print("*");
        //         k=k-1;
        //     }
        //     System.out.println();
        //     i=i+1;

        // }

        // ---------------------------------------------
    
// ------------------------------------------------------
        // int i=1;
        // // int p=1;
        // while(i<=n){
        //     int p=(i*2)-1;
        //     int j=i;
        //     while(j<=n){
        //         System.out.print(p);
        //         p=p+2;
        //         j=j+1;
        //     }
        //     int k=(i * 2) - 3;
        //     while(k>=1){
        //         System.out.print(k);
        //         k=k-2;
        //     }
        //     System.out.println();
        //     i=i+1;
        // }

        // ----------------------------------------------------
        // int i=0;
        // // int p=1;
        // while(i<n){
            
        //     int j=1;
        //     while(j<=n){
        //         int p=((i+j)*2-1)%(2*n);
        //         System.out.print(p);
                
                
        //         j=j+1;
                
        //     }
        //     System.out.println();
        //     i=i+1;
        // }

        // ----------------------------------------------------------
        int i=1;
        while(i<=n){
            int sum=0;
            int j=1;
            while(j<=i){
                sum=sum+j;
                System.out.print(j);
                if(j<i)
                    System.out.print("+");
                j=j+1;
            }
            System.out.println("=" +sum);
            i=i+1;
        }
        
    }
}
    

