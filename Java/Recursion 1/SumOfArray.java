import java.util.Scanner;
public class SumOfArray {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int sum(int input[]) {
        int sum=0;
        for(int i=0; i<input.length;i++){
            sum=sum+input[i];
        }
        return sum;


    }
    public static void main(String[] args) {
        int[] input = takeInput();
        // int[] input = new int[input];
        int sol=sum(input);
        System.out.println(sol);


        
    }
    
}
