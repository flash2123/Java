
import java.util.Scanner;
public class Solution {
    public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
}

	public static int[] merge(int arr1[], int arr2[]){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int i = 0,j = 0,k = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		while(i < arr1.length && j < arr2.length ) {
			if(arr1[i] <= arr2[j]) {
				arr3[k++] = arr1[i++];
			}
			else {
			   arr3[k++] = arr2[j++];
			   }
		    }
		for(;i < arr1.length;)
			arr3[k++] = arr1[i++];
		for(;j < arr2.length;)
			arr3[k++] = arr2[j++];	
		return arr3;
	}

	public static void main(String[] args) {
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		int arr3[] = merge(arr1,arr2);
printArray(arr3);

    

	}
	
}
