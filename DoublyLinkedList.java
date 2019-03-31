
import java.util.*;
class DoublyLinkedList{
	node start=null;

	void insertFromFirst(int value){
	node nod=new node(value);
		if(start==null){ //khali
			start=nod; // node lai start  
			start.next=null; //start ko next le null
			start.prev=null; //start ko previous le null
		}
		else{
			nod.next=start; //node ko next le start 
			start.prev=nod; 
			start=nod;
			start.prev=null;
			}

	}//void insert form first


	void insertFromLast(int values){
	node nod=new node(values);
		if(start==null){
			start=nod;
			start.next=null;
			start.prev=null;
		}
		else{
			node temp=start;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=nod;
				nod.next=null;
				nod.prev=temp;

			}
	}//void insert form last

		void deleteFromFirst(){

			if(start==null){
				System.out.println("Linklist is empty");
			}
		   else if (start.next == null) {
						System.out.println(start.data + " is deleted");
						start = null;
			}
			else{

				node temp=start;
				start=start.next;
				start.prev=null;
				System.out.print(temp.data+"deleting");
				temp=null;
				}
		}//void delete form first


		void deleteFromLast(){

			if(start==null){
			System.out.println("Linklist is empty");
			}
			else if (start.next == null) {
			            System.out.println(start.data + " is deleted");
            start= null;
		}
			else{
				node temp1=start;
				node temp=null;
				while(temp1.next!=null){
				temp=temp1;
				temp1=temp.next;
				}
				temp.next=null;
				System.out.print(temp1.data+"deleting");
				temp1 = null;
				}
		}//void delete form last


	void insertspecificposition(int value,int pos){
node nod =new node(value);
		if(start==null){ //insertiing containig the
			start=nod;
			start.next=null;
			start.prev=null;
			} //end if

		else{
			if(pos==1){
			nod.next=start;
			start.prev=nod;
			start=nod;
			nod.prev=null;
			//System.out.print(temp.data+"deleted");
			//temp=null;
			} //if

			else{
				node temp=null;
				node temp1=start;
				int flag=0;
				for(int i =0 ; i<pos-1;i++){ //check
					if(temp1!=null){
						temp=temp1;
						temp1=temp.next;
					}
					else{
						System.out.print("position beyond limit");
						flag=1;
						break;
					}
				}//for

				if(flag==0){
					if(temp.next==null){
					temp.next=nod;
					nod.prev=temp;
				}
				else{
						temp.next = nod;
						nod.next = temp1;
						nod.prev = temp;
						temp1.prev = nod;
                }
			}
			} //else
		}
	} //void insert from insertspecificposition



	void deletespecificposition(int pos){
		node nod=new node();
		if(start==null){ //insertiing containig the
			System.out.println("LinkedList is Empty");
            		} //end if

		else{
			if(pos==1){
				if(start.next==null){
				System.out.print(start.data +"deleted");
				}else{
				node temp=start;
				start=start.next;
				start.prev=null;
				System.out.print(temp.data+"deleting");
				temp = null;
			} //if
}
			else{
				node temp=null;
				node temp1=start;
				int flag=0;
				for(int i =0 ; i<pos-1;i++){ //check
					if(temp1.next!=null){
						temp=temp1;
						temp1=temp.next;
					}
					else{
						System.out.print("position beyond limit");
						flag=1;
						break;
					}
				}//for

				if(flag==0){
					temp.next=temp1.next;
					temp1.next.prev=temp;
					System.out.print(temp1.data+"deleting");
					temp1=null;
				}
			} //else
		}
	} //void insert from deletespecificposition


		   void display(char n) {
				if(n=='f'){
			        if (start == null) {
			            System.out.println("LinkedList is empty");
			        } else {
			            node temp = start ;
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
	            node temp = start ;

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

	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		DoublyLinkedList cll =new DoublyLinkedList();
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
					cll.insertFromFirst(value);
					break;

				case 2:
					System.out.println("Enter a value");
					value=in.nextInt();
					cll.insertFromLast(value);
					break;

				case 3:
					System.out.println("Enter a value");
					value=in.nextInt();
					System.out.println("Enter a position");
					pos = in.nextInt();
					cll.insertspecificposition( value, pos);
					break;

				case 4:
					System.out.println("display front/back");
					 char n =in.next().charAt(0);
					cll.display(n);
					break;

				case 5:
					System.exit(0);
					break;

				case 6:
					cll.deleteFromLast();
					break;

				case 7:
					cll.deleteFromFirst();
					break;

				case 8:
					System.out.println("Enter a position");
						pos = in.nextInt();
					cll.deletespecificposition(pos);
					break;
				default:
					System.out.println(" INVALID CHOICE");
			}
			ch ='x';
		}while(ch!='Y');
	}
}