import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
                if(j!=i)
                   System.out.print(j); 
                else
                    System.out.print("*");
            }

                System.out.println("");
            
            
        }
    
  
  
}
    
}
