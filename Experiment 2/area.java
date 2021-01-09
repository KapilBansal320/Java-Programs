class ComputeArea {
  public float area (float s) {
       return s*s  ;
   }
   public float area (float l, float b) {
       return l*b  ;
   }
   public double area (double l, double h ,double b) {
      double s=(l+b+h)/2;
      return Math.sqrt(s*(s-l)*(s-b)*(s-h));
   }
}

class Area {
   public static void main(String[ ] args) {
       System.out.println("Kapil Bansal"+ "\n"+ "Program 2.3" + "\n");
       ComputeArea a=new ComputeArea();
       System.out.println("Area of the square with side 2 is "+a.area(2));
       System.out.println("Area of the rectangle with length 10 and width 15 is "+a.area(10, 15));
       System.out.println("Area of the triangle with sides 4, 2 and 3 is "+a.area(4,2,3));

   }
}
