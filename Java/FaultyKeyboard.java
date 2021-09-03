import java.util.Scanner;
public class FaultyKeyboard {
    public static boolean isPossible(String name, String typed) {
        int j=0;
        if(name.equals(typed))
        {
            return true;
        }
        if(typed.length()<name.length()||typed.charAt(0)!=name.charAt(0))
        {
            return false;
        }
        for(int i=0;i<typed.length();i++)
        {
            if(j<name.length() && name.charAt(j)==typed.charAt(i))
            {
                j++;
            }
            else if(typed.charAt(i)!=typed.charAt(i-1))
            {
                return false;
            }
        }
        
        
        return j==name.length();
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
          String name= s.next();
        String typed=s.next();

       
      
        boolean res = isPossible(name, typed);

        System.out.println(res);
        }
        
    }
}

