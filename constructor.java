class Box {
   double width, height, length;


   Box( double h,double w, double l) {
       length=l;
       height=h;
       width=w;
   }

   double volume() {
       return width*height*length;
   }
}

class Volume {
   public static void main(String[ ] args) {
       System.out.println("Kapil Bansal"+ "\n"+ "Program 2.4" + "\n");
       Box obj1= new Box(5,3,2);
       Box obj2=new Box(12,4,7.68);

       System.out.println("Volume of the box1 is"+obj1.volume());

       System.out.println("Volume of the box2 is"+obj2.volume());
   }
}

