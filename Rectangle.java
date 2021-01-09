import java.util.Scanner;

class Shape{
	float length, width;
	
	void get(){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Length of the Shape ");
		length = sc.nextFloat();
		System.out.print(" Enter the Width of Shape ");
		width = sc.nextFloat();
	}
	void print(){
		System.out.println("\nPrint From Shape Class");
		System.out.println("Length and Width of Shape is:: "+length+" units and "+width+" units");
	}	
}

public class Rectangle extends Shape{
	void print(){
		System.out.println("\nPrint From Rectangle Class");
		System.out.println("Length and Width of Rectangle is:: "+length+" units and "+width+" units");
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		rect.get();
		rect.print();
	}
}