public class Arithmetic {

   double addition( double a, double b) {
       return a+b;
   }
   double subtraction( double a, double b) {
       return a-b;
   }
   double multiplication( double a, double b) {
       return a*b;
   }
   double division( double a, double b) {
       return a/b;
   }
}

class Maths {
   public static void main(String[ ] args) {
       System.out.println("Kapil Bansal"+ "\n"+ "Program 2.7" + "\n");
       Arithmetic obj= new Arithmetic();


       System.out.println("The addition of 15 and 7 is " + obj.addition(15,7));
       System.out.println("The subtraction of 10 and 5 is " + obj.subtraction(10,5));
       System.out.println("The multiplication of 4 and 6 is " + obj.multiplication(4,6));
       System.out.println("The division of 12 and 3 is " + obj.division(12,3));


   }
}
