import java.util.Scanner;
public class FindDuplicate {

	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	
	public static int findDuplicate(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
		
	}
	//best
	public static int findDuplicate2(int[] arr) {
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return sum-(arr.length-2)*(arr.length-1)/2;
	}

	public static void main(String[] args) {
		
		int[] arr=takeInput();
		System.out.println(findDuplicate2(arr));
		
	}

}
