import java.util.Scanner;
 

class AgeException extends Exception {
  public AgeException(String str){
    System.out.println(str);
  }
}

class InvalidAgeException extends AgeException{
  public InvalidAgeException(String str){
    super(str);
  }
}

class TooYoungException extends AgeException{
  public TooYoungException(String str){
    super(str);
  }
}

public class AgeExc{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your age :: ");
    int age = s.nextInt();

    try {
      if(age <0 )
        throw new InvalidAgeException("Invalid Age");
      if(age < 18)
        throw new TooYoungException("Too Young");
      else
        System.out.println("Valid age");
    }
    catch (AgeException a) {
      System.out.println(a);
    }
  }
}
