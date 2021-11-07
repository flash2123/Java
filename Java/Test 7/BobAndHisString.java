import java.util.Scanner;
import java.util.HashMap;

public class BobAndHisString{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
        while(t-- > 0){
        	String s=scn.next();
            int max=Integer.MIN_VALUE;
            HashMap<Character, Integer> map=new HashMap<>();
            for(int i=0; i<s.length(); i++){
            	if(map.containsKey(s.charAt(i))==false){
            		map.put(s.charAt(i), i);
            	}else{
            		int distance=i-map.get(s.charAt(i));
            		if(distance>max){
            			max=distance;
            		}
            	}
        	}
        	if(max==Integer.MIN_VALUE){
        		System.out.println(-1);
        	}else{
        		System.out.println(max-1);
            }
        }
        

	}

}