import java.util.Scanner;
public class StringToInt {
    public static int convertStringToInt(String input){
        if(input.length()==0){
            return 0;
        }
        return (input.charAt(0)-'0')* (int)Math.pow(10, input.length()-1) + convertStringToInt(input.substring(1));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = convertStringToInt(input);
        System.out.println(result);
    }
}
