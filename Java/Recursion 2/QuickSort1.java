import java.util.Scanner;
public class QuickSort1 {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void quickSort(int[] input) {
		quickSort(input,0,input.length-1);
	}

    public static void quickSort(int[] input, int si, int ei) {
        if(si>=ei){
            return;
        }
        int pivotIndex=partition(input, si, ei);
        quickSort(input, si, pivotIndex-1);
        quickSort(input, pivotIndex+1, ei);

    }

    public static int partition(int[] input, int si, int ei) {
        int pivotElement=input[si];
        int smallerNumCount=0;
        for(int i=si+1; i<=ei; i++){
            if(input[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=input[si+smallerNumCount];
        input[smallerNumCount]=pivotElement;
        input[si]=temp;
        int i = si;
        int j = ei;
        while(i<j){
            if(input[i]<pivotElement){
                i++;
            }else if(input[j]>=pivotElement){
                j--;
            }else{
                temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }
    public static void main(String[] args) {
        // int[] input={2, 6, 8, 5, 4, 3};
        int[] input=takeInput();
        // int si=0;
        // int ei=input.length-1;
        quickSort(input);
        // quickSort(input, si, ei);
        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
        
    }
	
    
}
