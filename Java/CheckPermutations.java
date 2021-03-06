import java.util.HashMap;
import java.util.Scanner;

public class CheckPermutations {
	
	
	public static boolean isPermuatation(String str1,String str2) {
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1 );
			}else {
				map.put(str1.charAt(i), 1);
			}
		}
		
		for(int i=0;i<str2.length();i++) {
			if(!map.containsKey(str2.charAt(i))) {
				return false;
			}
			if(map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i),map.get(str2.charAt(i)) -1);
			}
		}
		for(int i=0;i<str1.length();i++) {
			if(map.get(str1.charAt(i))!=0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
			// String str="Welcome To Coding Ninjas";
		System.out.println(isPermuatation(str1,str2));
		// TODO Auto-generated method stub

	}

}
