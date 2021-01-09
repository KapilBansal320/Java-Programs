class Box {
   double length, width, height;

   double volume() {
       return length*width*height;
   }
}

class Volume {
   public static void main(String[ ] args) {
       System.out.println("Kapil Bansal"+ "\n"+ "Program 2.2" + "\n");
       Box obj1= new Box();
       Box obj2= new Box();
       obj1.width=4.3;
       obj1.height=8;
       obj1.length=2;
       System.out.println("Volume of the box with width 4.3, height 8 and length is " +obj1.volume());
       obj2.width=3;
       obj2.height=4.5;
       obj2.length=5;
       System.out.println("Volume of the box with width 3, height 4.5 and length 5 is "+obj2.volume());
   }
}
