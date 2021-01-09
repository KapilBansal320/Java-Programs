import java.util.Scanner;
class Grade
{
   public static void main(String[] args)
   {
       int  n;
       char grade;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a percentage");
       n = sc.nextInt();
       if (n >= 95)
        grade ='O';
       else if(n>=90)
        grade = 'A';
       else if (n >= 70)
        grade = 'B';
       else if (n >= 55)
        grade = 'C';
       else if(n >= 50)
           grade = 'D';
       else
           grade = 'F';
       System.out.println("Your grade is: " + grade);
   }
}
