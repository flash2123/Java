public class Palindrome{
   public static void main(String[] args) { 
       int nums = 3553  , reverse = 0 , remainder;
       int originalNums=nums;
       while(nums!=0){
       remainder = nums%10;
       reverse = reverse * 10 + remainder;
       nums /= 10;   
    }
    if(originalNums == reverse){
        System.out.println(originalNums + "This is Palindrome");
    }
    else{
        System.out.println(originalNums + "This is not Palindrome");
    }
    
   }
}