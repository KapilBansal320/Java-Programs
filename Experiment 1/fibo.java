import java.util.Scanner;
class FibonacciSeries { 
    static int fib(int n) 
    { 
        // Base Case 
        if (n <= 1) 
            return n; 
  
        // Recursive call 
        return fib(n - 1) + fib(n - 2); 
    } 
    public static void main(String args[]) 
    { 
        System.out.println("Name: Kapil Bansal"+ "\n"+ "This is Program 1.2" + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int N;
        N = sc.nextInt();
        for (int i = 0; i < N; i++) { 
            System.out.print(fib(i) + " "); 
        } 
        System.out.print("\n");
    } 
} 
