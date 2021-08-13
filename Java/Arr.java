import java.util.Scanner;
public class Arr{
    public static int sum(int[] arr){
        int n, t;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        t=s.nextInt();
        int sum=0;
        // int[] arr=new int[n];
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;


                                                                  
    }
    public static void main(String[] args) {
        int[] arr = sum();
        // int n, t;
        // Scanner s = new Scanner(System.in);
        // n=s.nextInt();
        
        
        //     System.out.println("Enter the element of " + i + "th number");
        //     arr[i]=s.nextInt();

        // }
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i]);
        // }
        
    }
}