import java.util.Scanner;

class Fact
{
	static int facorial(int n){
		int res=1;
		if(n<0){
			return 0;
		}
		if(n==0 || n==1){
			return 1;
		}
		while(n>1){
			res=res*n;
			n--;
		}
		return res;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter a number to find its factorial");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("factorial of number is "+facorial(n));
	}
}