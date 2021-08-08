import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int rev=0, rem;
        int originalNums=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(originalNums==rev){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
