import java .util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;
public class Square {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner (System.in);
        n=s.nextInt();
        int output=0;
        while(output*output<=n){
            output=output+1;

        }
        output=output-1;
        System.out.println(output);
    }
    
}
