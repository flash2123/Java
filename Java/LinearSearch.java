import java.util.Scanner;
public class LinearSearch {

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
	
	
	public static  int linearSearch(int arr[],int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= takeInput();
		int Lin= linearSearch(arr, x);
		System.out.println(Lin);
	}

}

