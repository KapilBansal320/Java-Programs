import java.util.Scanner;

class Box{
	float width, depth, height, volume;
	
	Box(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter dimensions of box:\n");
		System.out.print(" Enter the Width: ");
		width = sc.nextFloat();
		System.out.print(" Enter the Depth: ");
		depth = sc.nextFloat();
		System.out.print(" Enter the Height: ");
		height = sc.nextFloat();
	}
	void volume() {
		volume = width*depth*height;
	}
	void print(){
		System.out.println("\nPrint from Box Class ");
		System.out.println("Height, Width, Depth and Volume of the box are"+height+width+depth+volume);
	}
}

public class ColoredBox extends Box{
	String color;

	ColoredBox(){
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Color:: ");
		color = sc.nextLine();
	}
	void print(){
		System.out.println("\nPrint from ColoredBox Class ");
		System.out.println("Height, Width, Depth, Volume and Color of the box are\n"+height+" "+width+" "+depth+" "+volume+" "+color+" respectively");
	}
	public static void main(String[] args) {
		ColoredBox cb = new ColoredBox();
		cb.volume();
		cb.print();
	}
}