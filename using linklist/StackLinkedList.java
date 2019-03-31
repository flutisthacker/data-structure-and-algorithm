import java.util.*;

public class StackLinkedList{
Node start;
StackLinkedList(){
	start=null;
}
	void push(int value){
		Node nod=new Node(value);
		if(start==null){
			start=nod;
			start.next=null;
			//obj.variable=null;
			//System.out.print();
		}

		else{
			Node temp=start;
			while(temp.next!=null){
			temp=temp.next;
			}//while
			temp.next=nod;
			nod.next=null;
		}//else
	} //void insert from

	void pop(){
	if (start==null){
		System.out.print("LL is empty");
	}
	else if(start.next==null){
		System.out.print(start.data+"deleted");
		start=null;
	}
	else{
		Node temp1 = start;
		Node temp = null;
			while(temp1.next!=null){
			temp=temp1;
			temp1=temp.next;
			}//while
			System.out.println(temp1.data+ " is going to be deleted");
			temp1=null;
			temp.next=null;
	}
}

	  void display(){
		 if(start==null){
			 System.out.println("linklist is empty");
			 }
		else{
			Node temp=start;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
				}//end of while
			}//end of else statement

		 }//end of display function

public void menu(){
	Scanner in=new Scanner(System.in);
			StackLinkedList SLL =new StackLinkedList();
			int value,pos;
			char ch;
			do{

				System.out.println("*******menu*******");
				System.out.println("1.	push");
				System.out.println("2.	pop0");
				System.out.println("3.	display");
				System.out.println("4. exit");
				System.out.println("ENTER THE CHOICE FROM 1 TO 3");
				int choice = in.nextInt();

				switch(choice){
					case 1:
						System.out.println("Enter a value");
						value=in.nextInt();
						SLL.push(value);
						break;

					case 2:
						SLL.pop();
						break;

					case 3:
						SLL.display();
						break;

					case 4:
						System.exit(0);
						break;

					default:
						System.out.println(" INVALID CHOICE");
				}
				ch ='x';
		}while(ch!='Y');
}

	public static void main(String []args){
	StackLinkedList SLL =new StackLinkedList();
		SLL.menu();
	}
}



