import java.util.Scanner;
public class ShiftZeroes {

	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	public static void printArray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
	
	public static void shiftZeroes(int[] arr) {
		
		int i=0,j=0;
		while(i<arr.length) {
			
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr= {2,6,0,0,1,9,0,8,0};
		int[] arr=takeInput();
		shiftZeroes(arr);
		printArray(arr);

	}

}
