import java.util.Scanner;
public class SelectionSort {
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
    public static void selectionSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex= -1;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        // int arr[]={1,4,6,8,0,3};
        int[] arr=takeInput();
        selectionSort(arr);
        printArray(arr);
        
    }
    
}
