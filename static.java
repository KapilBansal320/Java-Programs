class Static
{
    static int num;
    static String str;
    // Static Block
    static{
       num = 100;
       str = "Static";
    }
    // Static Member
    static void myMethod()
    {
        System.out.println("Printed by static member");
    }
    public static void main(String[] args)
    {
        System.out.println("Kapil Bansal"+ "\n"+ "Program 2.9" + "\n");
        myMethod();
        System.out.println("Value of number initialized by static block: " + num);
        System.out.println("Value of string initialized by static block: " + str);
    }
}
