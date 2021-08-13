import java.util.Scanner;
public class ReturnArray {
    public static int[] takeInput(){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static int sum(int[] arr) {

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        int sol = sum(arr);
        System.out.println(sol);
    }
        
        
		

    
}
