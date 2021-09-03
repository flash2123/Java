import java.util.Scanner;
public class LeadersInArray {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void leaders(int[] arr) {
        int size=arr.length;
        int max_from_right =  arr[size-1];
  
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");
      
        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {          
            max_from_right = arr[i];
            System.out.print(max_from_right + " ");
            }
        }   
    }


        // int[] arr=new int[];
    //     for (int i = 0; i < arr.length; i++)
	// 	{
	// 		int j;
	// 		for (j = i + 1; j < arr.length; j++)
	// 		{
	// 			if (arr[i] <= arr[j])
	// 				break;
	// 		}
	// 		if (j==arr.length) // the loop didn't break
	// 			System.out.print(arr[i] + " ");
	// 	}
	// }
    public static void main(String[] args){
		// LeadersInArray lead = new LeadersInArray();
        int arr[]=takeInput();
		// int arr[] = new int[]{3, 12, 34, 2, 0, -1};
		// int n = arr.length;
		leaders(arr);

    }
    
}
