class Box {
   double width, length, height;
    Box( double h,double w, double l) {
       this.length=l;
       this.height=h;
       this.width=w;
    }
    double volume() {
       return width*height*length;
    }
}

class Volume {
   public static void main(String[] args) {
       System.out.println("Kapil Bansal"+ "\n"+ "Program 2.6" + "\n");
       Box obj1= new Box(2,4,3);
       Box obj2=new Box(3,4.5,5);

       System.out.println("Volume of the box1 is "+obj1.volume());
       System.out.println("Volume of the box2 is "+obj2.volume());
   }
}
