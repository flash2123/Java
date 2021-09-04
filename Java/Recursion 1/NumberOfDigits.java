import java.util.Scanner;
public class NumberOfDigits {
    public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return 1 + smallAns;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num=count(n);
        System.out.println(num);
    }
    
}
