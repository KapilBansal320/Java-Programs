public class Pattern{
   public static void main(String args[]) {
      int n=4;
      for(int i=1;i<4;i++){
         for(int j=0;j<3-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print(k);
         }
         for(int k=i-1;k>=1;k--){
            System.out.print(k);
         }
         System.out.print("\n");
      }
   }
}