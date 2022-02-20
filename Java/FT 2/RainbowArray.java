public class RainbowArray{
    public static void israinbow(int [] arr){
        int N = arr.length;
        if(N<13){
            System.out.println("no");
            return;
        }
        int start = 0;
        int end = N-1;
        boolean isValid = true;
        int cur = 0;
        while(start!=end && start < end){
            if(arr[start]!=arr[end]){
                isValid = false;
                break;
            }
            if(arr[start]<1||arr[start]>7){
                isValid = false;
                break;
            }
            if(arr[start]!=cur){
                if(arr[start]!=cur+1){
                    isValid = false;
                    break;
                }else{
                    cur = arr[start];
                }
            }
            start++;
            end--;
        }
        if((arr[start]==7||cur==7)&&isValid){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        // Write your code here
    }
}