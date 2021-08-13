public class ReverseArray {

    static void reverseArray1(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] =temp;
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        reverseArray1(arr);
        System.out.println("Array in reverse order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}