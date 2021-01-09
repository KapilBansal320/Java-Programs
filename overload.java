class Box {
    double width, length, height;

    Box( double h,double w, double l) {
       length=l;
       height=h;
       width=w;
    }

    Box( double s){
      height=width=length=s;
    }

    double volume() {
       double volume=width*height*length;
       return volume;
    }
}

class Volume {
   public static void main(String[ ] args) {
       System.out.println("Kapil Bansal"+ "\n"+ "Program 2.5" + "\n");
       Box obj1= new Box(10,6,4.2);
       Box obj2= new Box(3);

       System.out.println("Volume of rectangular box is "+obj1.volume());

       System.out.println("Volume of square box is "+obj2.volume());
   }
}
