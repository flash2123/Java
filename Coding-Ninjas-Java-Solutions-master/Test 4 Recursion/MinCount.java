import java.util.Scanner;
public class MinCount {
    public static int minCount(int n){
        if(n<=3){
            return n;
        }
        int res = n;
        for (int x = 1; x <= n; x++){
            int temp = x * x;
            if (temp > n){
                break;
            }else{
                res = Math.min(res, 1 + minCount(n - temp));
            } 
                 
        }
        return res; 

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(minCount(n));
    }
    
}
