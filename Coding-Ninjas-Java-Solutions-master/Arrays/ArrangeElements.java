import java.util.Scanner;
public class ArrangeElements {

	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
	
	public static int[] arrange(int[] arr, int n) {
		
		// int[] arr=new int[n];
		int left=0,right=n-1,counter=1;
		while(left<=right) {
			if(counter%2==1) {
				arr[left++]=counter;
			}else {
				arr[right--]=counter;
			}
			counter++;
		}
		
	
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=takeInput();
		int n=arr.length;
		arrange(arr, n);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
