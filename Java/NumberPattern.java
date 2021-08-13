import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int x=0;
        for (int i = n; i >= 1; i--, x += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int y = 1; y <= x; y++) {
                System.out.print('*');
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
             System.out.println();
        }
    }
}

