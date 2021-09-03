import java.util.Scanner;

public class ArrayEquilibrium{
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	
	public static int arrayEquilibrium(int[] arr){  
        int rightSum=0;
        for(int i=0;i< arr.length;i++){
            rightSum+=arr[i];
        }
        //full array total sum
        
        int leftSum=0;
        
        for(int i=0;i<arr.length;i++){
            
            rightSum-=arr[i];               // totalsum-arr[i]
            if(leftSum==rightSum){           // check leftSum==rightSum
                return i;
            }
            
            leftSum+=arr[i];            // next element leftSum
             
        }
        return -1;
        
        
	}
    public static void main(String[] args) {
        int[] arr=takeInput();
        int ans=arrayEquilibrium(arr);
        System.out.println(ans);
        
    }
}