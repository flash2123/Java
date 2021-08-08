import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] a= new int[n];
        for (int i =0; i<n;i++){
            a[i]= s.nextInt();
        }
        int [] A= new int [n-1];
        for ( int i =0;i<n-1;i++){
            if ( a[i]==a[i+1])
            {
                System.out.println("false");
                return ;
            }
            A[i]= a[i] -a[i+1];
        }
        int i =0;
        while (i<n-2){
            if (A[i]<0 && A[i+1]>0)
            {
                System.out.println("false");
                return ;
            }
            i++;
        }
        System.out.println("true");
    }
}

  
