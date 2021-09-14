import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator){
        if(denominator==0){
            denominator=1;
        }
        this.numerator = numerator;
        this.denominator=denominator;
        simplify();
    }
    public void setNumerator(int num){
        this.numerator=num;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int num){
        if(num==0){
            return;
        }
        this.denominator=num;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }
    public void add(Fraction f2){
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
    public static Fraction add(Fraction f1, Fraction f2){
        int newNum=f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newdeno=f1.denominator * f2.denominator;
        Fraction f3= new Fraction(newNum, newdeno);
        return f3;
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
    public void print(){
        System.out.println(numerator + "/" + denominator);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int d= s.nextInt();
        Fraction f1=new Fraction(n,d);
        f1.print();
        // f1.increament();
        // f1.print();
        int n1=s.nextInt();
        int d1= s.nextInt();
        Fraction f2=new Fraction(n1,d1);
        // f1.add(f2);
        // f1.print();
        Fraction f3= Fraction.add(f1, f2);
        f3.print();
    }
    
}
