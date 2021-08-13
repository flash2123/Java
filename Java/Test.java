import java.util.Scanner;
public class Test {
    // public static void main(String[] args) {
    //     int p = 100;
    //     if(p > 20) {
    //         if(p < 20) {
    //             System.out.print("coding");
    //         }
    //     } else {
    //         System.out.print("ninjas");
    //     }
    // }
    // _________2 test_______________
    
    // public static void main(String args[]) 
    // {    
    //      int x , y = 1;
    //      x = 10;
    //      if (x != 10 && x / 0 == 0)
    //          System.out.println(y);
    //      else
    //          System.out.println(++y);
    // } 
    // _______________3 test__________________
    public static void main(String[] args) {
        // int n;
        // Scanner s = new Scanner(System.in);
        // n=s.nextInt();
        // int x = 10;
        // while(x >= 0) {
        //     x = x - 1;
        //     System.out.print(x);
        //     x--;
        // }
        // int x=1;
        // x+=1;
        // while(x<=10){
        //     System.out.println("Coding Ninjas");
            
            
        // }
        
        // int a = 10, b = 20, c = 100;

        // if(a <= b && b != 20) {
        //     System.out.println("hello");
        // }
        // else if(c >= a && c >= b) {
        //     System.out.println("hi");
        // }
        // else {
        //     System.out.println("hey");
        // }
        // _____________________-4 test_______________________
        // if(a <= b || c <= b) {
        //     System.out.println("hello");
        // }
        // else if(a <= b || a <= c) {
        //     System.out.println("hi");
        // }
        // else {
        //     System.out.println("hey");
        // }

        // ---------------------5 test----------------------
        // int a = 6;
        // int b = 12;
        // while (a < b) {
        //     System.out.print("In the loop");
        //     a += 2;
        //     b -= 2;
        // }



        // _______________________AP_____________________________-
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        // int count=0;
        int a =s.nextInt();
        int d =s.nextInt();
        int AP=a;
        for(int i=1; i<=n; i++){
            System.out.println(AP+ " ");
            AP=AP+d;
           

        //     int AP=3*i+2;
        //     if(AP==0){
        //         System.out.print(AP + "true");
        //         // count++;
        //     }else{
        //         System.out.println(AP + "false");
        //     }
        }

    }
}
