import java.util.Scanner;
public class Ap { 
    public static void main (String[] args) 
    { 
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int prev=s.nextInt();
        int curr=s.nextInt();
        int count =3;
        int d= curr-prev;
        prev=curr;
        while(count<=n){
            curr=s.nextInt();
            int temp=curr-prev;
            if(temp!=d){
                System.out.println("false");
                return;
            }
            count++;
            prev=curr;
        }
        System.out.println("true");

    }
}
        



    

