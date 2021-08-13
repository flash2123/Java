import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        // _____________Decimal to Binary__________________
        System.out.println(Integer.toBinaryString(n));


        // _____________Binary to Decimal__________________
        // String binaryString = s.nextLine();
        // System.out.println(Integer.parseInt(2,binaryString));

        // ____________Terms of AP____________________________
        // int count=0;
        // for(int i=1; count<n; i++){
        //     int AP = 3*i+2;
        //     if(AP%4!=0){
        //         System.out.println(AP + " ");
        //         count++;
        //     }
        // }

        // _____________Reverse Number____________________________
        // int rev = 0;
        // while(n!=0){
        //     int rem = n%10;
        //     rev=rev*10+rem;
        //     n=n/10;

        // }
        // System.out.println(rev);


        // _________________Fibonacci Series___________________

        // int t1=0, t2=1, nextTerm=0;
        // if(n==0||n==1){
        //     System.out.println(n);
            
        // }else{
        //     nextTerm=t1+t2;
         
        // }
        
        // for(int i=2; i<=n; ++i){
        //         t1=t2;
        //         t2=nextTerm;
        //         nextTerm=t1+t2;
                
        //     }
        //     System.out.println(t2);








    //   __________All Prime Number____________________  
        // for (int i = 2; i <= n; i++){
        //     int counter=0;
        //     for(int num =i-1; num>1; num--){
        //         if(i%num==0){
        //             counter = counter + 1;
        //             break;
        //         }
        //     }
        //     if (counter == 0){
                
        //         System.out.println(i);
        //     }
            
        // }
        // ________________________________________________________________



        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print(n);
        //     }
        //     System.out.println();

        // }

// --------------------------------------------------------
            // for(int i=386;i>0;i=i%3){
            //     System.out.print("*");
            // }
        // _------------------------------------------------------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i==j){
        //             break;
        //         }
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Outside Loop");

    }
    
}
