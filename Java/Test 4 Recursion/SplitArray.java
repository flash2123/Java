import java.util.Scanner;
public class SplitArray {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    public static boolean splitArray(int input[]) {
        int n = input.length;
        return splitArray(input, n, 0, 0, 0);

    }

    public static boolean splitArray(int input[], int n, int start, int lsum, int rsum) {
        if (start == n){
            return lsum == rsum;
        }
        if (input[start] % 5 == 0){
            lsum += input[start];
        }else if(input[start] % 3 == 0){
            rsum += input[start];
        }else{
            return splitArray(input, n, start + 1, lsum + input[start], rsum) || splitArray(input, n, start + 1, lsum, rsum + input[start]);
        }
        return splitArray(input, n, start + 1, lsum, rsum);
    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        int[] input = takeInput();
        System.out.println(splitArray(input));
    }
    
}
