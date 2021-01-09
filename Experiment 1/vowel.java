import java.util.Scanner;

class Vowel
{
  static boolean isVowel(char c){
    switch(c){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U' : return true;
    }
    return false;
  }
  public static void main(String[ ] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a character : ");
    char ch=sc.next().charAt(0);
    if(isVowel(ch) == true)
      System.out.println("The character "+ ch +" is a Vowel");
    else
      System.out.println("The character "+ ch +" is a Consonant");
   }
}
