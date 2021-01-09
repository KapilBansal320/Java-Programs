import java.util.Scanner;
public class Stack{
	int size;
	int arr[];
	int top;
 
	Stack(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push(int pushedElement) {
		if (!isFull()){
			top++;
			arr[top] = pushedElement;
			System.out.println(" Pushed element:" + pushedElement);
		} 
		else {
			System.out.println(" Stack is full !");
		}
	}
 
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println(" Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
		} 
		else {
			System.out.println(" Stack is empty !");
			return -1;
		}
	}
 
	public void display(){
		if(!isEmpty()){
			int x = top;
			System.out.print(" Stack is :");
			while(x>=0){
				System.out.print(" "+arr[x]);
				x--;
			}
		}
		else{
			System.out.println(" Stack is empty !");
		}
	}
 
	public boolean isEmpty(){
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter size of stack ");
		int s = sc.nextInt();
		Stack STA = new Stack(s);
		System.out.print("\n Select the option ");
		System.out.print("\t 1.Add Element  \t 2.Remove Element  \t 3.Display Stack \n\n");
		char ch = 'y';

		while(ch == 'y' || ch == 'Y')
		{
			System.out.print(" Enter you choice ");
			int choice = sc.nextInt();	
			System.out.print("\n");
			switch (choice)
			{
				case 1: {
							System.out.print(" Enter the element to add ");
							int val = sc.nextInt();
							STA.push(val);
						}
						break;
				case 2: {
							STA.pop();
						}
						break;
				case 3: {
							STA.display();
						}
						break;	
				default:{
							System.out.print("Wrong choice ");
						}
						break;	
			}
			System.out.print("\n Do you want to continue? (Y/N) ");
			ch = sc.next().charAt(0);		
			System.out.print("\n");
		}
	}
}