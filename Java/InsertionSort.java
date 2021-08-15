import java.util.Scanner;
public class InsertionSort {
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

    public static void insertionSort(int[] arr) {
        int n =arr.length;
        for(int i=0; i<n; i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
     int[] arr=takeInput();
        insertionSort(arr);
        printArray(arr);
    	//Your code goes here
    }

    
}
