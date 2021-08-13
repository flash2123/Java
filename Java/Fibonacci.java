import java.util.Scanner;
public class Fibonacci {
    // public static  boolean isPerfectSquare(int x)
    // {
    //     int s = (int) Math.sqrt(x);
    //     return (s*s == x);
    // }
    public static boolean checkMember(int n){
        int fib1 = 0;
        int fib2 = 1;
        do {
            int saveFib1 = fib1;
            fib1 = fib2;
            fib2 = saveFib1 + fib2;
        }
        while (fib2 < n);
            if (fib2 == n){
                return true;
            } else{
                return false;
            }
        }
        public static void main(String[] args) {
            int n;
            Scanner s = new Scanner(System.in);
            n=s.nextInt();
            System.out.println(checkMember(n));
        }
        
        
    }
    

