import java.util.Scanner;

public class Max {
   static int maximum(int n1, int n2, int n3){
      if(n2>n1)
         n1=n2;
      if(n3>n1)
         n1=n3;
      return n1;
   }
   public static void main(String args[]) {
      int n1,n2,n3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter three numbers");
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      System.out.println(maximum(n1,n2,n3));
   }
}