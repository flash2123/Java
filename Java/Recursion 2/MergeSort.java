import java.util.Scanner;
public class MergeSort {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void merge(int[] s1, int[] s2, int[] d){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                k++;
                j++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                k++;
                j++;
            }
        }
    }
    public static void mergeSort(int[] input){
        if(input.length<=1){
            return;
        }
        int[] input2=new int[input.length/2];
        int[] input3=new int[input.length-input2.length];
        for(int i = 0; i<input.length/2; i++){
            input2[i]=input[i];
        }
        for(int i=input.length/2; i<input.length; i++){
            input3[i-input.length/2]=input[i];
        }
        mergeSort(input2);
        mergeSort(input3);
        merge(input2, input3, input);

    }
    public static void main(String[] args) {
        // int[] input={2, 6, 8, 5, 4, 3};
        int[] input=takeInput();
        mergeSort(input);
        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
        
    }
}
