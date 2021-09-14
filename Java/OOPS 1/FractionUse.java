import java.util.Scanner;

// package classesandobjects;
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator=denominator;
        simplify();
    }
    public void simplify(){
        int gcd=1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i<= smaller; i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    // increment function
    public void increament(){
        numerator=numerator+denominator;
        simplify();
    }
    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int d= s.nextInt();
        Fraction f1=new Fraction(n,d);
        f1.print();
        f1.increament();
        f1.print();
    }
    
}

// public class FractionUse {
//     public static void main(String[] args) {
//         Fraction f1=new Fraction(4,6);
//         f1.print();
//     }
    
// }
