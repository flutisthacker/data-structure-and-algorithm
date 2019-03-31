import java.util.*;

 class circularcll{
	node start;
	node last;
	circularcll(){
	start=null;
	last=null;
	}
	void insertfirst(int value){
		node nod =new node(value);
		if(start==null){
			start=nod;
			last=nod;
			last.next=start;
		}
		else{
			nod.next=start;
			start=nod;
			last.next=start;
		}
	}//void
	void insertlast(int value){
		node nod =new node(value);
		if(start==null){
			start=nod;
			last=nod;
			last.next=start;
		}
		else{
			last.next=nod;
			last=nod;
			last.next=start;
		}
	}//void


	void insertspecificposition(int value,int pos){
		node nod=new node(value);
		if(start==null){ //insertiing containig the
			start=nod;
			last=nod;
			last.next=start;

			//obj.variable=null;
			//System.out.print();
		} //end if

		else{
			if(pos==1){
			nod.next=start;
			start=nod;
			last.next=start;
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
	} //void insert from insertspecificposition


	void deletefirst(){
		if (start==null){
			System.out.print("LL is empty");
		}
		else{
			node temp=start;
			start=start.next;
			last.next=start;
			System.out.print(temp.data+" deleting");
			temp=null;
		}
	}


	void deletelast(){
	if (start==null){
		System.out.print("LL is empty");
	} //same as ll
else if (start == last) {
            System.out.println(start.data + "is deleted");
            start= last = null;
        }
	else{
		node temp = start;
			while(temp.next!=last){
			temp=temp.next;
			}//while
			System.out.print(last.data+ " deleted");
			last=temp;
			last.next=start;
	}
}

	void deletespecificposition(int pos){

		if(start==null){ //insertiing containig the
			System.out.print("ll empty");
		} //end if

		else{
			if(pos==1){
			node temp=start;
			start=start.next;
			last.next=start;
			System.out.print(temp.data+"deleteing");
			temp=null;
			last.next=start;
			} //if

			else{
				node temp=null;
				node temp1=start;
				int flag=0;
				for(int i =1 ; i<pos;i++){ //check
					if(temp1.next!=start){
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
					System.out.print(temp1.data+"is going to be deleted");
					temp1=null;
				}
			} //else
		}
	} //void delete from insertFromSpecificPosition

void display() {
	node temp=start;
	if(start==null){
		System.out.println("cll empty");

	}

	else{
		do {
			System.out.println(temp.data+"\t");
			temp =temp.next;
		}while(temp!=start);
	}
}

	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		circularcll cll =new circularcll();
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
					System.out.print("Enter a value");
					value=in.nextInt();
					cll.insertfirst(value);
					break;

				case 2:
					System.out.print("Enter a value");
					value=in.nextInt();
					cll.insertlast(value);
					break;

				case 3:
					System.out.print("Enter a value");
					value=in.nextInt();
					System.out.print("Enter a position");
					pos = in.nextInt();
					cll.insertspecificposition( value, pos);
					break;

				case 4:

					cll.display();
					break;

				case 5:
					System.exit(0);
					break;

				case 6:
					cll.deletefirst();
					break;

				case 7:
					cll.deletelast();
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
