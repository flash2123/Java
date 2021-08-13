import java.util.Scanner;
public class LinearSearch1{

    public static int[] takeInput(){
        int n;
        // int x;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        // x=s.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }


    public static  int linearSearch(int[] arr,int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        int arr[]=takeInput();
        linearSearch(arr, x);
		// int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(linearSearch(arr, x));

	}

    // public static int[] takeInput(){
    //     int n;
    //     int x;
    //     Scanner s=new Scanner(System.in);
    //     n=s.nextInt();
    //     x=s.nextInt();
    //     int[] arr=new int[n];
    //     for(int i=0; i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     return arr;
    // }
    // public static int linearSearch(int arr[], int x){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==x){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int[] arr= takeInput();
    //     int Lin=linearSearch(arr, 10);
    //     System.out.println(Lin);
    // }
}
