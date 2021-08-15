import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Triplet {

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
            System.out.print(arr[i]+ " ");
        }
    }

	// static int arr[] = new int[]{1,2,3,4,5,6,7};
     
    static int countTriplets(int[] arr, int sum)
    {
        // Initialize result
        int ans = 0;
      
        // Fix the first element as A[i]
        for (int i = 0; i < arr.length-2; i++)
        {
           // Fix the second element as A[j]
           for (int j = i+1; j < arr.length-1; j++)
           {
               // Now look for the third number
               for (int k = j+1; k < arr.length; k++)
                   if (arr[i] + arr[j] + arr[k] == sum)
                       ans++;
           }
        }
      
        return ans;
    }
     
    // Driver method to test the above function
    public static void main(String[] args)
    {
		int[] arr=takeInput();
        int sum = arr.length;
        System.out.println(countTriplets(arr, sum));
    }
	

	// public static void printInOrder(int a,int b,int c) {

	// 	if(a>=b && a>=c && b>=c) {
	// 		System.out.println(c+" " +b+" "+a);
	// 	}else if(a>=b && a>=c && c>=b) {
	// 		System.out.println(b+" " +c+" "+a);
	// 	}else if(b>=a && b>=c && a>=c) {
	// 		System.out.println(c+" " +a+" "+b);
	// 	}else if(b>=a && b >=c && c>=a) {
	// 		System.out.println(a+" " +c+" "+b);
	// 	}else if(c>=a && c>=b && a>=b) {
	// 		System.out.println(b+" " +a+" "+c);
	// 	}else if(c>=a && c>=b && b>=a) {
	// 		System.out.println(a+" " +b+" "+c);
	// 	}


	// }
	

	// public static int tripletSum(int[] arr,int sum) {

	// 	// int n= arr.length;
		
	// 	int ans=0;

	// 	for(int i=0;i<arr.length-2;i++){
	// 		for(int j=i+1;j<arr.length-1;j++){
	// 			for(int k=j+1;k<arr.length;k++){
	// 				if(arr[i] + arr[j] +arr[k]<sum){
						
	// 					// System.out.println(arr[i] + " " + arr[j]+ " " + arr[k]);
	// 					// System.out.println(sum);
	// 				}
	// 				ans++;
	// 			}
	// 		}
	// 	}
	// 	return ans;
	// }
	
	// public static void main(String[] args) {
	// 	int[] arr=takeInput();
	// 	int sum=arr.length;
	// 	tripletSum(arr, sum);
	// 	printArray(arr);
	// }

		

	}
