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
		while(n!=0){
			for(int j=2;j>=2;j++){
				if(isPrime(j)){
					System.out.print(j+" ");
					n=n-1;
					if(n==0){
						System.out.println();
						return;
					}
				}
			}
		}
	}
	public static void main(String[] args)  
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many primes do you need?");
		n = sc.nextInt();
		System.out.print("First n prime numbers are ");
		print(n);
	}
	 
}