import java.util.Scanner;
public class LargestArr {
    public static int[] takeInput(){
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element of : " + i + "th value of number");
            arr[i]=s.nextInt();

        }
        return arr;
    }
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
         int lar=largest(arr);
         System.out.println(lar);
        
    }     
}
