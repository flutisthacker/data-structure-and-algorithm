import java.util.*;
public class DCLL{
	node start;
	node last;

public DCLL(){
	start=null;
	last=null;
}


public void insertFirst(int value){
	node nod =new node(value);
if(start==null){
	start=last=nod;
	last.next=start;
	start.prev=last;
}
else{
	nod.next=start;
	start.prev=nod;
	start=nod;
	start.prev=last;
	last.next=start;
}
}

public void insertLast(int value){
	node nod =new node(value);
	if(start==null){
		start=last=nod;
		last.next=start;
		start.prev=last;
	}
	else{
		nod.prev=last;
		last.next=nod;
		last=nod;
		last.next=start;
		start.prev=last;
	}
}

public void insertSpecific(int value, int pos){
	node nod =new node(value);
	if(start==null){
		start=last=nod;
		last.next=start;
		start.prev=last;
	}
	else if(pos==1){
		nod.next=start;
		start.prev=nod;
		start=nod;
		start.prev=last;
		last.next=start;
	}
	else{
		node temp= start;
		node temp1= start.next;
		int flag=0;
		for(int i=1;i<pos-1;i++){
			if(temp1!=start){
			temp=temp1;
			temp1=temp.next;
			}
			else{
			flag=1;
			System.out.print("position beyond limit");
			break;
			}
		}
	if(flag==0){
		temp.next=nod;
		nod.prev=temp;
		nod.next=temp1;
		temp1.prev=nod;
	}

	}
}

public void deleteFirst(){
	//node nod =new node();
if(	start == null){
System.out.print("empty");
}

else if( start == last){
	System.out.println("deleting");
	start=last=null;
}
else{
	node temp=start;
	start=start.next;
	start.prev = last;
	last.next=start;
	System.out.println(temp.data+"deleting");
	temp=null;
}
}

public void deleteLast(){
	//node nod =new node();
if(start==null){
System.out.print("empty");
}

else if(start==last){
	System.out.println("deleting");
	start=last=null;
}
else{
	/*
	node temp=last.prev;
	start.prev=temp;
	last=temp;
	*/
	node temp=last.prev;
	temp.next=start;
	start.prev=temp;
	System.out.println(last.data+"deleting");
	last=null;
	last=temp;
}
}//method

public void deleteSpecific(int pos){
	//node nod =new node();
	if(start==null){
System.out.print("empty");
	}//if
	else if(start==last){
		System.out.print(start.data+"deleted");
		start=last=null;
	}
	else if(pos==1){
		node temp=start;
			start=start.next;
			start.prev=last;
			last.next=start;
			System.out.println(temp.data+"deleting");
			temp=null;
	} //else if
	else{
		node temp= start;
		node temp1= start.next;
		int flag=0;
		for(int i=1;i<pos-1;i++){
			if(temp1!= start){
			temp=temp1;
			temp1=temp.next;
			} //if
			else{
			flag=1;
			System.out.print("position beyond limit");
			break;
			} //else
		} //for
	if(flag==0){
            temp.next = temp1.next;
            temp1.next.prev = temp;
            System.out.println(temp1.data+" is deleting");
            temp1 = null;
	} //if

	} //else
} //method

    void display(int b) {

   if(b==1&&start!=null){
   node temp = start;
		do{
             System.out.print(temp.data + "\t");
             temp = temp.next;
           }while(temp != start);
           System.out.println();
      }
	else if(b==2&&start!=null) {
       node temp1 = last;
          do{
              System.out.print(temp1.data+"\t");
              temp1 = temp1.prev;
           }while(temp1 != last);
           System.out.println();
       }

 if(start==null){
	  	System.out.println("LinkedList is empty");

	}
    }

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
       DCLL dl = new DCLL();
        int value, pos;
        char y;
        do {
            System.out.println("Choice   MENU			 ");
            System.out.println("  1 -> 	INSERT FROM FIRST");
            System.out.println("  2 -> 	INSERT FROM LAST");
            System.out.println("  3 -> 	INSERT FROM SPECIFIC POSITION");
            System.out.println("  4 -> 	DELETE FROM FIRST");
            System.out.println("  5 -> 	DELETE FROM LAST");
            System.out.println("  6 -> 	DELETE FROM SPECIFIC POSITION");
            System.out.println("  7 -> 	DISPLAY");
            System.out.println("  8 -> 	EXIT");
            System.out.print("Choice [1 - 8]: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Insert Value: ");
                    value = in.nextInt();
                    dl.insertFirst(value);
                    break;
                case 2:
                    System.out.print("Insert Value: ");
                    value = in.nextInt();
                    dl.insertLast(value);
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    value = in.nextInt();
                    System.out.print("Enter Position: ");
                    pos = in.nextInt();
                    dl.insertSpecific(value, pos);
                    break;
                case 4:
                    dl.deleteFirst();
                    break;
                case 5:
                    dl.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter Position: ");
                    pos = in.nextInt();
                    dl.deleteSpecific(pos);
                    break;
                case 7:
                System.out.println("type 1-front/2-back:");
                   int b=in.nextInt();
                    System.out.println("Elements are:");
                    dl.display(b);
                    break;
                case 8:
                    System.exit(100);
                   	Thread.sleep(1000);
                   break;
                default:
                    System.out.println("Invalid Choice !!!");
            }
            y = '*';
        } while (y != 'x');

    } //main
}//class
