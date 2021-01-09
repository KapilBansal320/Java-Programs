import java.util.Scanner;

class Reverse
{
  static int reverse(int n){
      if(n<10){
        return n;
      }
      int rev=0;
      while(n!=0){
        rev=rev*10+n%10;
        n=n/10;
      }
      return rev;
   }
   public static void main(String args[])
   {
       int num;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number to be reversed");
       num = sc.nextInt();
       System.out.println("Reverse of the number is "+reverse(num));
   }
}
