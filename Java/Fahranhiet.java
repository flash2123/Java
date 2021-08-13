import java.util.Scanner;
public class Fahranhiet {
    public static void printFahrenheitTable(int S, int E, int W){
        int fah;
        while(S<=E){
            fah=((5*(S-32))/9);
            System.out.println(S+ " " + fah);
            S +=W;
            
        } 
        

    }
    public static void main(String[] args) {
        int S,E,W;
        Scanner s =new Scanner(System.in);
        S=s.nextInt();
        E=s.nextInt();
        W=s.nextInt();
        printFahrenheitTable(S, E, W);
        
    }
    
}
