import java.util.Scanner;
public class LastIndex {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int lastIndex(int input[], int x) {
        if(input.length==0){
            return -1;
        }
        int smallArray[]= new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallArray[i-1]=input[i];
        }
        int k = lastIndex(smallArray, x);
        if(k!=-1){
            return k+1;
        }else{
            if(input[0]==x){
                return 0;
            }else{
                return -1;
            }
        }

    }
    public static void main(String[] args) {
        int[] input=takeInput();
        int x=input.length;
        int val=lastIndex(input, x);
        System.out.println(val);
    }
    
}
