import java.util.Scanner;
public class Mutipilication {


	public static void main(String[] args) {
        // int n, sumE=0, sumO=0;
        int S,E,W;
       
        Scanner s =new Scanner(System.in);
        S=s.nextInt();
        E=s.nextInt();
        W=s.nextInt();
        int fah;
        while(S<=E){
            fah=((5*(S-32))/9);
            System.out.println(S+ " " + fah);
            S +=W;
        }

        
// -----------------------------------
        // long result =1;
        // while(x!=0){
        //     result *= n;
        //     --x;
        // }
        // // b=s.nextInt();
        // System.out.println(result);
    //  --------------------------------------   
        // int i = 2;
        // while (i < n) {
        //     if(n % i == 0) 
        //     System.out.print(i+"\t");
        //     i++;
        // }
    }
        // for(int i=2; i<n; i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }else {
        //         System.out.println(n);
        //     }
        // }
        // s.close();
        // int[] a = new int[n];
        // for(int i = 0; i<n; i++){
        //     a[i]=s.nextInt();
        // }
        // for(int i =0; i<n; i++){
        //     if(a[i]%2==0){
        //         sumE=sumE+a[i];
        //     }else{
        //         sumO=sumO+a[i];
        //     }
        //     System.out.println(sumE);
        //     System.out.println(sumO);
            
        // }


		
    }
