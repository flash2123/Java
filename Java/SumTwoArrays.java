import java.util.Scanner;

// import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;
public class SumTwoArrays {


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
	
	
	
	
	public static int[] sumOfArrays(int[] arr1,int[] arr2, int output[]) {
		
		int[] arr=new int[Math.max(arr1.length,arr2.length)+1]; 
		int carry=0,i=arr1.length-1,j=arr2.length-1,k=arr.length-1;
		while(i>=0 && j>=0) {
			
			int sum=arr1[i--]+arr2[j--] + carry;
			arr[k--]=sum%10;
			carry=sum/10;
			
		}
		while(i>=0) {
			int sum=arr1[i--]+carry;
			arr[k--]=sum%10;
			carry=sum/10;
		}
		while(j>=0) {
			int sum=arr2[j--]+carry;
			arr[k--]=sum%10;
			carry=sum/10;
		}
		arr[0]=carry;
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr1= takeInput();
		int[] arr2=takeInput();
		int output=arr1.length;
	
		int[] arr=sumOfArrays(arr1, arr2, output);
		printArray(arr);
		
	}

}
