import java.util.Scanner;
public class GeomatricSum {
    public static double findGeometricSum(int k){
        if(k==0){
            return 1;
        }
        double ans = 1/(double)Math.pow(2, k) + findGeometricSum(k-1);
        return ans;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k= s.nextInt();
        System.out.println(findGeometricSum(k));
    }
    
}
