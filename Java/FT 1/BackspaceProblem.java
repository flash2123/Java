public class BackspaceProblem{
    public static String backspace(String s){
        Stack<Character> q = new Stack<Character>();

      for (int i = 0; i < s.length(); ++i)
      {
          if (s.charAt(i) != '#')
              q.push(s.charAt(i));
          else if (!q.isEmpty())
              q.pop();
      }

      // build final string
      String ans = "";

      while (!q.isEmpty())
      {
          ans += q.pop();
      }

      // return final string
      String answer = "";
      for(int j = ans.length() - 1; j >= 0; j--)
      {
          answer += ans.charAt(j);
      }
      return answer;
  }
}