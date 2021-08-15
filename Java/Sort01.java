import java.util.Scanner;
public class Sort01 {

	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	
	public static void sort01(int arr[]) {
		int count0=0;
		for(int i : arr) {
			if(i==0) {
				count0++;
			}
		}
		for(int i=0;i<count0;i++) {
		arr[i]=0;	
		}
		for(int i=count0;i<arr.length;i++) {
			arr[i]=1;
		}
		
	}
	public static void main(String[] args) {
		// int[] arr=new int[n]
		int[] arr=takeInput();
		int so=sort01(arr);
		// sort01(arr);
		System.out.println(so);
		
	}
	
}
