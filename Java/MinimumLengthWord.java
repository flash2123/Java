import java.util.Scanner;
public class MinimumLengthWord {

    // public static int[] takeInput(){
    //     Scanner s = new Scanner(System.in);
    //     // String min
    //     int n = s.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0; i<n;i++){
    //         arr[i]=s.nextInt();
    //       }
    //     return arr;
    // }
    public static String minLengthWord(String input){
        int minStart=-1;
        int minLength=Integer.MAX_VALUE;
        int currStart=0;
        int i=0;
        for(i=0;i<input.length();i++){
            if(input.charAt(i)== ' '){
                int currWordLength=i-currStart;
                if(currWordLength<minLength){
                    minStart=currStart;
                    minLength=currWordLength;
                }
                currStart=i+1;
            }
        }
        if(minStart==-1){
            return input;
        }else{
            int currWordLength=i-currStart;
            minStart=currStart;
            minLength=currWordLength;
        }
        return input.substring(minStart, minStart+minLength);
    }
    public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);
        // String input= s.nextLine();
        
        String input="This is test String";
        String main=minLengthWord(input);
        System.out.println(main);
       

        
    }
    
}
