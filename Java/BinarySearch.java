import java.util.Scanner;
public class BinarySearch {
    public static int[] takeInput(){
        Scanner s =  new Scanner(System.in);
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
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
    public static int binarySearch(int[] arr, int ele){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>ele){
                end=mid-1;
            }else if(arr[mid]<ele){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int[] arr= takeInput();
        int ele = arr.length;
        int index= binarySearch(arr, ele);
        System.out.println(index);

        
    }
    
}
