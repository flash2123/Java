import java.util.Scanner;
public class Prob1 {
    public static int probability(int n,int x){
        if (n % 2 == 1) {
            // If the number chosen by Misha is odd.
            int median = (n + 1) / 2;

            if (x < median) {
                return x + 1;
            } else {
                return x - 1;
            }
        } else {
            // If the number chosen by Misha is even.
            int median = (n + 1) / 2;

            if (x <= median) {
                return x + 1;
            } else {
                return x - 1;
            }
        }
    }
    public static void main(String[] args) {
        int n,x;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        x=s.nextInt();
        System.out.println(probability(n, x));
    }
    
}
