import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        int n, sumE=0, sumO=0;
        Scanner s =new Scanner(System.in);
        // System.out.print("Enter the number of elements in array:");
        n=s.nextInt();
        // System.out.println("Enter the elements of the array:");
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
        // }
        // System.out.println("no. of even " + sumE);
        // System.out.println("no. of odd " +sumO);

        while(n!=0){
            int temp=n%10;
            if(temp % 2==0){
                sumE += temp;
            }
            if(temp % 2 != 0){
                sumO += temp;
            }
            n=(int)(n/10);
        }
        System.out.println(sumE+" " + sumO);
        
    }
}