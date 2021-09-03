import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayIntersection {

	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
	
	//Best O(n)
	public static void arrayIntersection(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			
			if(map.containsKey(arr2[i]) && map.get(arr2[i])!=0) {
				System.out.println(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) -1 );
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1= takeInput();
		int[] arr2= takeInput();
		// int[] arr1= {2,6,1,2};
		// int[] arr2= {1,2,3,4,2};
		arrayIntersection(arr1, arr2);
	}

}
