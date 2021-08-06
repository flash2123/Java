import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {

        char ch;
        
        Scanner s = new Scanner(System.in);

        ch = s.next().charAt(0);

        // ch=charAt(0);
        // ans=s.nextInt();

        if(ch>=65 && ch<=90){
            System.out.println(1);
            
        }else if(ch>=97 && ch<=122){
            System.out.println(0);
            
        }else{
            System.out.println(-1);
            
        }
        // public static void main (String[] args) {
            // int x=5;
            // int y=5;
            // while((x=5)==y)
            // {
            //     System.out.println("Hello");
            //     x++;
            //     y++;
            // }
        
        
    }
}
