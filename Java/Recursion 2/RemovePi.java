import java.util.Scanner;
public class RemovePi {
    public static String replacePi(String input){
        if(input.length()<=1 ){
            return input;
        }
        if(input.charAt(0)=='p' && input.charAt(1) == 'i'){
            // call recursion on string of length n-2
            String smallOutput = replacePi(input.substring(2));
            return "3.14" + smallOutput;
        }else{
            // call recursion on string of length n-1
            String smallOutput = replacePi(input.substring(1));
            return input.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String input= s.nextLine();
        System.out.println(replacePi(input));
    }
    
}
