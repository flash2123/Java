import java.util.Scanner;
public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        if(s.length()==1){
            return s;
        }
        String smallOutput=removeConsecutiveDuplicates(s.substring(1));
        if(smallOutput.charAt(0)==s.charAt(0)){
            return smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
