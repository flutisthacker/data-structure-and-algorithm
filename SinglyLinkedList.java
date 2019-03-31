//linked list collection of node which is connected wwith address
//lesson6
import java.util.*;

 class SinglyLinkedList{
node start;
	public SinglyLinkedList(){
		start=null;
	}

	void insertFromFirst(int value){
		node nod=new node(value);
		if(start==null){
			start=nod;
			start.next=null;
			//obj.variable=null;
			//System.out.print();
		}

		else{
			nod.next=start;
			start=nod;
		}//els
	} //void insert from

	void insertFromBack(int value){
		node nod=new node(value);
		if(start==null){
			start=nod;
			start.next=null;
			//obj.variable=null;
			//System.out.print();
		}

		else{
			node temp=start;
			while(temp.next!=null){
			temp=temp.next;
			}//while
			temp.next=nod;
			nod.next=null;
		}//else
	} //void insert from


	void insertFromSpecificPosition(int value,int pos){
		node nod=new node(value);
		if(start==null){ //insertiing containig the
			start=nod;
			start.next=null;
			//obj.variable=null;
			//System.out.print();
		} //end if

		else{
			if(pos==1){
			nod.next=start;
			start=nod;
			} //if

			else{
				node temp=null;
				node temp1=start;
				int flag=0;
				for(int i =0 ; i<pos-1;i++){ //check
					if(temp1!=null){
						temp=temp1;
						temp1=temp1.next;
					}
					else{
						System.out.print("position beyond limit");
						flag=1;
						break;
					}
				}//for

				if(flag==0){
					temp.next=nod;
					nod.next=temp1;
				}
			} //else
		}
	} //void insert from insertFromSpecificPosition


	void deleteFromFirst(){
		if (start==null){
			System.out.print("LL is empty");
		}
		else{
			node temp=start;
			start=start.next;
			System.out.print(temp.data+" is going to be deleted");
			temp=null;
		}
	}

	void deleteFromLast(){
	if (start==null){
		System.out.print("LL is empty");
	}
	else{
		node temp1 = start;
		node temp = null;
			while(temp1.next!=null){
			temp=temp1;
			temp1=temp.next;
			}//while
			System.out.println(temp1.data+ " is going to be deleted");
			temp1=null;
			temp.next=null;
	}
}

	void deleteFromSpecificPosition(int pos){
		node nod = new node();
		if(start==null){ //insertiing containig the
			System.out.print("ll empty");
		} //end if

		else{
			if(pos==1){
			node temp=start;
			start=start.next;
			} //if

			else{
				node temp=null;
				node temp1=start;
				int flag=0;
				for(int i =1 ; i<pos;i++){ //check
					if(temp1!=null){
						temp=temp1;
						temp1=temp1.next;
					}
					else{
						System.out.print("position beyond limit");
						flag=1;
						break;
					}
				}//for

				if(flag==0){
					temp.next=temp1.next;
					System.out.print(temp.data+"is going to be deleted");
					temp1=null;
				}
			} //else
		}
	} //void delete from insertFromSpecificPosition


	  void display(){
		 if(start==null){
			 System.out.println("linklist is empty");
			 }
		else{
			node temp=start;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
				}//end of while
			}//end of else statement

		 }//end of display function

	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		SinglyLinkedList SLL =new SinglyLinkedList();
		int value,pos;
		char ch;
		do{

			System.out.println("*******menu*******");
			System.out.println("1.	insertFromFirst");
			System.out.println("2.	insertFromBack");
			System.out.println("3.	insertFromSpecificPosition");
			System.out.println("4.	display");
			System.out.println("5.	exit");
			System.out.println("6.	delete from first");
			System.out.println("7.	delete from last");
			System.out.println("8.	delete from positon");
			System.out.println("ENTER THE CHOICE FROM 1 TO 8");
			int choice = in.nextInt();

			switch(choice){
				case 1:
					System.out.println("Enter a value");
					value=in.nextInt();
					SLL.insertFromFirst(value);
					break;

				case 2:
					System.out.println("Enter a value");
					value=in.nextInt();
					SLL.insertFromBack(value);
					break;

				case 3:
					System.out.println("Enter a value");
					value=in.nextInt();
					System.out.println("Enter a position");
					pos = in.nextInt();
					SLL.insertFromSpecificPosition( value, pos);
					break;

				case 4:

					SLL.display();
					break;

				case 5:
					System.exit(0);
					break;

				case 6:
					SLL.deleteFromFirst();
					break;

				case 7:
					SLL.deleteFromLast();
					break;

				case 8:
					System.out.println("Enter a position");
					pos = in.nextInt();
					SLL.deleteFromSpecificPosition(pos);
					break;
				default:
					System.out.println(" INVALID CHOICE");
			}
			ch ='x';
		}while(ch!='Y');
	}
}



