import java.util.Scanner;
public class TwoSum {
    public static int sum(int a, int b) {
        int ans=a+b;
        return ans;
        
    }
    public static void main(String[] args) {
        int c,d;
        System.out.println("Enter the value of c : ");
        
        Scanner s= new Scanner(System.in);
        // n=s.nextInt();
        c=s.nextInt();
        System.out.println("Enter the value of d : ");
        d=s.nextInt();
        // int c=10;
        // int d=29;
        // int ans=sum(c, d);
        
        int ans=c+d;
        System.out.println("The result is: " + ans);

    }
    
}
