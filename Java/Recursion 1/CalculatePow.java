import java.util.Scanner;
public class CalculatePow {
    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x= s.nextInt();
        int pow=power(n, x);
        System.out.println(pow);
        
    }
    
}
