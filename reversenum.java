import java.util.Scanner;
class RecursionReverse
{
   public static void reverseMethod(int number) {
       if (number < 10) {
	   System.out.println(number);
	   return;
       }
       else {
           System.out.print(number % 10);
           reverseMethod(number/10);
       }
   }
   public static void main(String args[])
   {
      System.out.println("Name: Kapil Bansal"+ "\n"+ "This is Program 1.8" + "\n"); 
    	int num=0;
    	System.out.print("Enter your number: ");
    	Scanner in = new Scanner(System.in);
    	num = in.nextInt();
    	System.out.print("Reverse of the input number is:");
    	reverseMethod(num);
    	System.out.println();
   }
}
