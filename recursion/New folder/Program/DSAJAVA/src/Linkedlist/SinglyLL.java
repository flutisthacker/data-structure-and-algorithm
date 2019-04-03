
package Linkedlist;
import java.util.*;
public class SinglyLL {
    SLL first;
    SinglyLL(){
        first=null;
    }//end of constructor
    void insertFirst(int id){
        SLL node=new SLL(id);
        if(first==null){
            first=node;
            first.next=null;
        }//end of if
        else{
            node.next=first;
            first=node;
        }//end of else
    }//end of InsertFirst()
    void insertLast(int id){
            SLL node=new SLL(id);
            if(first==null){
                first=node;
                first.next=null;
            }//end of if
            else{
                SLL temp=first;
                while(temp.next!=null){
                    temp=temp.next;
                }//end of while
                temp.next=node;
                node.next=null;
            }//end of else
    }//end of insertLast()
    void insert_spc_position(int id, int pos){
        SLL node=new SLL(id);
        if(first==null){
            first=node;
            first.next=null;
        }//end of if
        else{
            if(pos==1){
                node.next=first;
                first=node;
            }//end of if
            else{
                SLL temp1, temp=null;
                temp1=first;
                int flag=0;
                int count;
                for(count=0;count<(pos-1);count++){//(pos-1) as we temp2=first.next, we already are in the 2nd position
                    if(temp1!=null){
                        temp=temp1;
                        temp1=temp1.next;
                    }//end of if
                    else{
                        System.out.println("POsition Beyond limit, Cannot insert");
                        flag=1;
                        break;
                    }//end of else
                }//end of for
                if(flag==0){
                    node.next=temp.next;
                    temp.next=node;
                }//end of if
            }//end of inner else
        }//end of outer else
    }//end of insert_spc_position()
    void deleteFirst(){
        if(first==null){
            System.out.println("Empty linked list, nothing to delete");
        }//end of if
        else{
            SLL temp=first;
            first=first.next;
            System.out.println("Item bing dleted is::"+temp.data);
            temp=null;
        }//end of else
    }//end of deleteFirst()
    void deleteLast(){
        if(first==null){
            System.out.println("Empty LinkedList, Nothing to delete");
        }//end of if
        else if(first.next==null){
            System.out.println("Item being deleted is:"+first.data);
            first=null;
        }
        else{
            SLL temp1=first;
            SLL temp2=first.next;
            while(temp2.next!=null){
	temp1=temp1.next;
	temp2=temp2.next;
}//end of while
System.out.println("Item being deleted is :"+temp2.data);
temp2=null;
temp1.next=null;
}//end of else
}//end of deleteLas()

void delete_spc_position(int pos){
try{
	if(first==null){
		System.out.println("Empty linked list, nothing to delete");
	}
	else if(pos==1){
		SLL temp;
		temp=first;
		first=first.next;
		System.out.println("element being deleted is::"+temp.data);
		temp=null;
	}//end of else if
	else{
		SLL temp1=first, temp2=first.next;
		for(int count=0; count<(pos-2);count++){
			temp1=temp1.next;
			temp2=temp2.next;
		}//end of for
		System.out.println("Element being deleted is:"+temp2.data);
		temp1.next=temp2.next;
		temp2=null;
	}//end of else
}//end of try
catch(Exception e){
	System.out.println("Invalid position");
}//end of catch
}//end of delete_spc_position()

void display(){
	if(first==null){
		System.out.println("Empty linked list");
	}//end of if
	else{
		SLL temp=first;
		System.out.println("\n");
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}//end of while
		System.out.println("null\n");
	}//end of else
}//end of display()
   public static void main(String args[]){
       SinglyLL SLLobj=new SinglyLL();
       Scanner inp=new Scanner(System.in);
       int choice;
       System.out.println("SinglyLinked List");
       System.out.println("-----------------");
       System.out.println("Menu");
       System.out.println("-----");
       System.out.println("1.Create");
       System.out.println("2. Insert at First");
       System.out.println("3. Insert at Last");
       System.out.println("4. Insert at specific position");
       System.out.println("5. Delete from first");
       System.out.println("6. Delete from last");
       System.out.println("7. Delete from specific position");
       System.out.println("8. Traversal");
       System.out.println("Make sure you create the Linked List first");
       System.out.println("Enter your choice");
       int ch=inp.nextInt();
       while(true){
           if(ch==1){
               char cho;
               System.out.println("Linked list created");
               do{
                    System.out.println("Enter the elements to be stored:");
                    int id=inp.nextInt();
                    SLLobj.insertLast(id);
                    System.out.println("Do you want to insert more elements??(Y/y)");
                    cho=inp.next().charAt(0);
               }while(cho=='y'||cho=='Y');
               break;
           }//end of if
           else{
               System.out.println("Make sure you create the linked list first");
               System.out.println("Enter your choice");
               ch=inp.nextInt();
           }//end of else
       }//end of while
       do{
       System.out.println("Menu");
       System.out.println("-----");
       System.out.println("2. Insert at First");
       System.out.println("3. Insert at Last");
       System.out.println("4. Insert at specific position");
       System.out.println("5. Delete from first");
       System.out.println("6. Delete from last");
       System.out.println("7. Delete from specific position");
       System.out.println("8. Traversal");
       System.out.println("Enter your choice");
          int ch1=inp.nextInt();
          switch(ch1){
              case 2:
                  System.out.println("Enter the element to be inserted at first::");
                  int id=inp.nextInt();
                  SLLobj.insertFirst(id);
                  break;
              case 3:
                  System.out.println("Enter the element to be inserted at last::");
                  id=inp.nextInt();
                  SLLobj.insertLast(id);
                  break;
              case 4:
                  System.out.println("Enter the elements to be inserted:");
                  id=inp.nextInt();
                  System.out.println("Enter the position:");
                  int pos;
                  while((pos=inp.nextInt())<=0){
                      System.out.println("Insert a valid position!!!");
                  }
                  SLLobj.insert_spc_position(id,pos);
                  break;
              case 5:
                  System.out.println("Deleting element from first::");
                  SLLobj.deleteFirst();
                  break;
              case 6:
                  System.out.println("Deleting from last::");
                  SLLobj.deleteLast();
                  break;
              case 7:
                  System.out.println("Enter the position from where you want to delete::");
                  while((pos=inp.nextInt())<=0){
                        System.out.println("Insert a valid position!!");
                  }//end of while
              SLLobj.delete_spc_position(pos);
                  break;
              case 8:
                  System.out.println("Traversal::");
                  SLLobj.display();
                  break;
              default:
                  System.out.println("Invalid position");
          }//end of switch
           System.out.println("Do you want to continue with this Linked List operation??(Y/y)");
           choice=inp.next().charAt(0);
       }while(choice=='y'||choice=='Y');
   }// end of main method
}//end of class
   
                  
            