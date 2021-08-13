public class InputArr {
    public static void mul(int [] arr){
        for(int i=0;i<5;i++)
            arr[i]*=i;

    }
    public static void main (String[] args) {
        int arr[]={1,2,3,4,5};
        mul(arr);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }
    }
    // public static void increment(int i){
    //     i++;
    // }
    // public static void printArray(int[] arr){
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void incrementArray(int[] input){
    //     // System.out.println(input);
    //     // for(int i=0;i<arr.length;i++){
    //         input = new int[7];
    //     for(int i=0;i<input.length;i++){
    //         // arr[i]=arr[i]+1;
    //         input[i]=input[i]+1;
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5};
    //     // System.out.println(arr);
    //     incrementArray(arr);
    //     printArray(arr);
    // }
}
