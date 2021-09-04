import java.util.Scanner;
public class PairStar {
    public static String addStars(String s) {
        if(s.length()==1){
            return s;
        }
        String smallOutput = addStars(s.substring(1));
        if(smallOutput.charAt(0)==s.charAt(0)){
            return s.charAt(0) + "*" + smallOutput;
        }else{
            return s.charAt(0) +  smallOutput;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String star=addStars(s);
        System.out.println(star);
    }
    
}
