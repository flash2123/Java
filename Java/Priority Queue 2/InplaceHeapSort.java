public class InplaceHeapSort{
    public static void placeIntoHeap(int[] arr , int i) {
		
		int childIndex = i;
		
		while(childIndex>0) {
			int parentIndex = (childIndex-1)/2;
			if(arr[childIndex] > arr[parentIndex] ) {
				int temp = arr[childIndex];
				arr[childIndex]= arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex  = parentIndex;
			}
			else {
				break;
			}
		}
		
		
	}
	public static int removeMaxFromHeap(int[] input,int size) {
		
		int temp = input[0];
		input[0] = input[size-1];
		
		int parentIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2* parentIndex + 2;
		
		while(leftChildIndex < size) {
			
			int maxIndex = parentIndex;
			if(input[leftChildIndex] > input[maxIndex] ) {
				maxIndex = leftChildIndex;
			}
			if( rightChildIndex < size &&  input[rightChildIndex] > input[maxIndex]) {
				maxIndex = rightChildIndex;
			}
			if(maxIndex!=parentIndex) {
				int temp2 = input[maxIndex];
				input[maxIndex] = input[parentIndex];
				input[parentIndex] = temp2;
				parentIndex = maxIndex;
				leftChildIndex = 2 * parentIndex + 1;
				rightChildIndex = 2* parentIndex + 2;
			}
			else {
				break;
			}
			
		}
		
		return temp;	
	}

	public static void inplaceHeapSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
			placeIntoHeap(arr, i);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-i-1] = removeMaxFromHeap(arr, arr.length - i); 
		}
		 for(int i=0;i<arr.length/2;i++){
	            int temp = arr[i];
	            arr[i] = arr[arr.length - i -1];
	            arr[arr.length - i -1 ] = temp;
	        }
    }
}