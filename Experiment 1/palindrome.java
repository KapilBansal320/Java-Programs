import java.util.Scanner;

class Palindrome
{
  static int palindrome(String s){
      String rev = "";
      int len=s.length();
      for(int i=len-1;i>=0;i--){
        rev+=s.charAt(i);
      }
      if(s.equals(rev))
        return 1;
      return 0;
   }
   public static void main(String args[])
   {
       String str;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a string or number to be check if it is palindrome or not");
       str = sc.nextLine();
       if(palindrome(str)==1)
           System.out.println(str+" is a palindrome");
       else
           System.out.println(str+" is not a palindrome");
   }
}
