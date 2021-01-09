import java.util.*;

class Distance {
	int x;

	Distance(int a){
		x = a;
	}

	void add(Distance d){
		this.x = this.x + d.x;
	}

	void show(){
		System.out.println("Distance is "+x);
	}
}


class Dis{  
  public static void main(String[] args) {
  	int dis1, dis2;
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Enter first distance ");
  	dis1 = sc.nextInt();
  	System.out.print("Enter second distance ");
  	dis2 = sc.nextInt();
  	Distance d1 = new Distance(dis1);     
  	Distance d2 = new Distance(dis2);  
  	d1.show();
  	d2.show();
  	d1.add(d2);
  	d1.show();
  }
}
