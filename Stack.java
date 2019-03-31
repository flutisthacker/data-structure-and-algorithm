//lesson1
import java.util.*;
public class Stack{
private int max;
private int top;
private int[] stack;

public Stack(int m){ //constructor
max=m;
top=-1;
stack= new int[max];
}


	public void push(int num){
		if (top==max-1){
		System.out.println("Stack is full");
		}



	else {
	top++;
	stack[top]=num;
	System.out.println(num+"success insert");
	}
}

public void pop(){
		if (top==-1){
		System.out.println("Stack is empty");
		}

	else {
	System.out.println(stack[top]+"delete success ");
		top--;
	}
}

public void display(){
	if(top==-1)
	System.out.println("stack empty");
	else if(top==max-1)
	System.out.println("stack full");
	else{
		System.out.println("values in stacks are");
		for(int i=top;i>=0;i--){
		System.out.println(stack[i]+"\t");
		}
	}
}

public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of stack;");
		int size=in.nextInt();
		Stack s=new Stack(size);
		char ch;
		do{
		System.out.println("menu");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		System.out.println("4.exit");
		System.out.print("\nEnter your choice;");
		int choice=in.nextInt();
			switch(choice){
				case 1:
				System.out.println("\nEnter number;");
				int num=in.nextInt();
				s.push(num);
				break;

				case 2:
				s.pop();
				break;

				case 3:
				s.display();
				break;

				case 4:
				System.exit(0);
				break;

			}
					System.out.println("continue(Y/N)");
					 ch=in.next().charAt(0);
					}while(ch=='Y' || ch=='y');
}

}