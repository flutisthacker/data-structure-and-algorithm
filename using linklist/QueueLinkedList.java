
import java.util.*;
class QueueLinkedList{
	Node start=null;

	void enque(int values){
	Node nod=new Node(values);
		if(start==null){
			start=nod;
			start.next=null;
			start.prev=null;
		}
		else{
			Node temp=start;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=nod;
				nod.next=null;
				nod.prev=temp;

			}
	}//void insert form last

		void deque(){

			if(start==null){
				System.out.println("Linklist is empty");
			}
		   else if (start.next == null) {
						System.out.println(start.data + " is deleted");
						start = null;
			}
			else{

				Node temp=start;
				start=start.next;
				start.prev=null;
				System.out.print(temp.data+"deleting");
				temp=null;
				}
		}//void delete form first


		   void display(char n) {
				if(n=='f'){
			        if (start == null) {
			            System.out.println("LinkedList is empty");
			        } else {
			            Node temp = start ;
			            while (temp != null) {
			                System.out.print(temp.data + "\t");
			                temp = temp.next;
			            }
		        	}
			}
			else{
	        if (start == null) {
	            System.out.println("LinkedList is empty");
	        } else {
	            Node temp = start ;

				while(temp.next!=null){
					temp=temp.next;
					}
	            while (temp != null) {
	                System.out.print(temp.data + "\t");
	                temp = temp.prev;
	            }
	        }
		}
		}

public void menu(){
			Scanner in=new Scanner(System.in);
			QueueLinkedList cll =new QueueLinkedList();
			int value,pos;
			char ch;
			do{

				System.out.println("*******menu*******");
				System.out.println("1.	enque");
				System.out.println("2.	deque");
				System.out.println("3.	display");
				System.out.println("4.	exit");
				System.out.println("ENTER THE CHOICE FROM 1 TO 8");
				int choice = in.nextInt();

				switch(choice){
					case 1:
						System.out.println("Enter a value");
						value=in.nextInt();
						cll.enque(value);
						break;

					case 2:
						cll.deque();
						break;

					case 3:
						System.out.println("display front/back");
						 char n =in.next().charAt(0);
						cll.display(n);
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

	QueueLinkedList SLL =new QueueLinkedList();
		SLL.menu();

	}
}