import java.util.Scanner;
public class CheckNumber {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input,0,input.length-1,x);

    }
    private static boolean checkNumber(int[] input, int start, int end, int x) {
		// TODO Auto-generated method stub
		
		if(start > end) {
			return false;
		}
		if(input[start]==x) {
			return true;
		}
		return checkNumber(input, start+1, end, x);
	}
    public static void main(String[] args) {
        int[] input = takeInput();
        int x= input.length;
        boolean num=checkNumber(input, x);
        System.out.println(num);

    }
    
}
