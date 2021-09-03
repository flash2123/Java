import java.util.Scanner;

public class RemoveAllOccurrencesOfChar {
	
	public static String removeAllOccurrencesOfChar(String str,char c) {
		
		String x="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				x+=str.charAt(i);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		char c=s.next().charAt(0);
		// String str="aabccbaa";
		System.out.println(removeAllOccurrencesOfChar(str, c));

	}

}
