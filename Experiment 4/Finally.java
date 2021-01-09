import java.util.*;

class Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Division of numbers are "+a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("Something went wrong "+e);
		}
		finally{
			System.out.println("Successfully handled the error");
		}
	}
}
