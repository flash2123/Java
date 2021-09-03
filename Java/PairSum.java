
import java.util.HashMap;
import java.util.Scanner;

public class PairSum {

	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	public static void pairSum2(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == sum) {
					// System.out.println(Math.min(arr[i], arr[j])  +" " + Math.max(arr[i], arr[j]) );
				}
			}
		}
	}
	// using HashMap
	//same time insertion and print algo
	public static void pairSumUsingHashMap(int[] arr,int sum) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i : arr) {
			
			if( map.containsKey(sum-i)) {
				for(int count=0;count<map.get(sum-i);count++){
					System.out.println(Math.min(i, sum-i) + " " + Math.max(i, sum-i) );

				}
					
			}
			if(map.containsKey(i)) {
				map.put(i,map.get(i) + 1);
			}else {
				map.put(i,1);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr=takeInput();
        int n = arr.length;
		pairSumUsingHashMap(arr, n);
	}

}
