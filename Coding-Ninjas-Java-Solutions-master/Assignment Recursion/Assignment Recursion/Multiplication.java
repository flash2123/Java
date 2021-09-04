import java.util.Scanner;
public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n){
        if(m<n){
            return multiplyTwoIntegers(n, m);
        }else if(n!=0){
            return (m + multiplyTwoIntegers(m, n-1));
        }else{
            return 0;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }
}
