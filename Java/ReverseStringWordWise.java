import java.util.Scanner;
public class ReverseStringWordWise {
	
	public static String reverseStringWordWise(String str) {
		
		String ans="";
		int space=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			
			if(i==0) {
				ans=ans+str.substring(0,space);
			}
			
			else if(str.charAt(i)==' ') {
				ans=ans+str.substring(i+1,space)+" ";
				space=i;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		// String str="Welcome To Coding Ninjas";
		System.out.println(reverseStringWordWise(str));
	}

}
