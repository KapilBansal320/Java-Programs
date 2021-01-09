import java.util.Scanner;

class Rectangle{
	float l = 20;
	float b = 8;
	float area;
	
	public void area()
	{
		area=l*b;
		System.out.println("  Area of rectangle: "+ area +" square units");
	}
}

class Triangle extends Rectangle{
 
	public void area(){
		area=(b*l)/2;
		System.out.println("  Area of triangle: "+ area +" square units");
	}
}

public class Dynamic{
	public static void main(String args[]){
		Rectangle rect1 = new Rectangle();
		rect1.area();
		Triangle rect2 = new Triangle();
		rect2.area();
		Rectangle rect3 = new Triangle();
		rect3.area();
		                     
	}
}
 