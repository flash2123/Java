public class SortAnArray{
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	public static void main(String[] args) 
	{ 
        
        int [] array = takeInput();   
        Arrays.sort(array);   
        for (int i = 0; i < array.length; i++){ 
            for (int j = i + 1; j < array.length; j++){
                int tmp = 0;  
				if (array[i] > array[j]){
                    tmp = array[i];  
                    array[i] = array[j];  
                    array[j] = tmp;  
                } 
            }  
        	System.out.print(array[i] + " ");   
        }   
	}
}