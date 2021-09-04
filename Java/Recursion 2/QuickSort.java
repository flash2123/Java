import java.util.Scanner;
public class QuickSort {

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
	
	public static void quickSort(int[] input,int start,int end) {
		
		if(start>=end) {
			return ;
		}
		int pivotPos=partition(input,start,end);
		quickSort(input, start, pivotPos-1);
		quickSort(input, pivotPos+1, end);
		
	}
	public static int partition(int[] input,int start,int end) {
		
		int pivot=input[start];
		int count=0;
		for(int i=start+1;i<=end;i++) {
			if(input[i] <= pivot) {
				count++;
			}
		}
		
		int pivotPos=start+count;
		int temp=input[pivotPos];
		input[pivotPos]=input[start];
		input[start]=temp;
		
		int i=start,j=end;
		while(i < pivotPos && j> pivotPos) {
			if(input[i] <= pivot) {
				i++;
			}
			else if(input[j] > pivot) {
				j--;
			}
			else {
				int temp2=input[i];
				input[i]=input[j];
				input[j]=temp2;
				i++;
				j--;
				
			}
		}
		return pivotPos;
		
	}
	
	public static void main(String[] args) {
        int[] input=takeInput();
        // int si=0;
        // int ei=input.length-1;
        quickSort(input);
        // quickSort(input, si, ei);
        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }

		// int[] input= {2, 6, 8, 5, 4, 3};
		// quickSort(input);
		// for(int i : input) {
		// 	System.out.print(i+" ");
		// }
	}
        
    
}
