import java.util.Scanner;
class Prime
{
	static boolean isPrime(int n){
		if(n<2)
			return false;
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	static void print(int n) 
	{ 
		for(int i = 2; i <= n; i++)
			if(isPrime(i))
				System.out.print(i + " ");
		System.out.println("\n");
	}
	public static void main(String[] args)  
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number up to which prime numbers need to be printed:");
		n = sc.nextInt(); 
		print(n); 
	}
	 
} 
