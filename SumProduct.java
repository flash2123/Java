import java.util.Scanner;
public class SumProduct {
    public static void main(String[] args) {
        int n,n1;
        Scanner s =new Scanner (System.in);
        n=s.nextInt();
        n1=s.nextInt();
        int sum=0, pro=1;
        if(n1==1){
            for(int i=1; i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }else if(n1==2){
            for(int i=1; i<=n;i++){
                pro=pro*i;
            }
            System.err.println(pro);

        }else{
            System.out.println(-1);
        }
        

        
    
    }
}
