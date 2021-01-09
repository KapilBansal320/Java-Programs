class Box {
   double width;
   double height;
   double depth;

   double volume() {
       double volume=width*height*depth;
       return volume;

   }
}

class MyClass {
   public static void main(String[ ] args) {
       System.out.println("Name: Archana Kumari"+ "\n"+ "This is Program 2.2" + "\n");
       Box obj1= new Box();
       Box obj2=new Box();
       obj1.width=12;
       obj1.height=45;
       obj1.depth=30;
       System.out.println("volume of the box 1:" + obj1.volume());
       obj2.width=13;
       obj2.height=12;
       obj2.depth=16;
       System.out.println("volume of the box 2:" + obj2.volume());
   }
}
