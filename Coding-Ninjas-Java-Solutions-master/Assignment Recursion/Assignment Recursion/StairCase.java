import java.util.Scanner;
public class StairCase {
    public static int staircase(int n){
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }else{
            return staircase(n-1)+staircase(n-2)+staircase(n-3);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(staircase(n));
    }
    
}
