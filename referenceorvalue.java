class Call{
   public static void main(String[] args){
      System.out.println("Kapil Bansal"+ "\n"+ "Program 2.8" + "\n");
      int a = 30;
      int b = 45;
      IntWrapper c = new IntWrapper(20);
      IntWrapper d = new IntWrapper(65);
      CallByValue(a, b);
      CallByRefrence(c, d);
   }
   public static void CallByValue(int a, int b) {
      System.out.println("Before swapping(CallByValue), a = " + a + " b = " + b);
      int c = a;
      a = b;
      b = c;
      System.out.println("After swapping using CallByValue, a = " + a + " b = " + b);
   }
   public static void CallByRefrence(IntWrapper a, IntWrapper b) {
      System.out.println("Before swapping(CallByRefrence), a = " + a.a + " b = " + b.a);
      IntWrapper c = new IntWrapper(a.a);
      a.a = b.a;
      b.a = c.a;
      System.out.println("After swapping using CallByRefrence, a = " + a.a + " b = " + b.a);
   }
}
class IntWrapper {
   public int a;
   public IntWrapper(int a){ this.a = a;}
}
