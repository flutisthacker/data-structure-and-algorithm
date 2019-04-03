
package doublelinkedlist;
import doublelinkedlist.DLL;
import java.util.*;
public class doubleLL {
    DLL first;
         
    
    doubleLL(){
        first=null;
        
    }
    void insertfirst(int id){
            DLL node=new DLL(id);
            if(first==null){
                    first=node;
                    first.next=null;
                    first.prev=null;
            }
            else{
                
                node.next=first;
                first=node;
                 first.prev=null;
            }
    }
    void insertlast(int id){
        DLL node=new DLL(id);
        if(first==null){
            first=node;
            first.next=null;
            first.prev=null;
        }
        else{
                DLL temp=first;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=node;
                node.next=null;
                node.prev=temp;//check the condition
        }
    }
    void insert_spc_position(int id,int pos){
            DLL node=new DLL(id);
            if(first==null){
                first=node;
                first.next=null;
                first.prev=null;
            }
            else{
                if(pos==1){
                        node.next=first;
                        first.prev=node;
                        first=node;
                }
                else{
                    DLL temp1,temp=null;
                    temp1=first;
                    int flag=0;
                    int count;
                    for(count=0; count<(pos-1);count++){
                        if(temp1!=null){
                            temp=temp1;
                            temp1=temp1.next;
                        }
                        else{
                                System.out.println("pOSITION bEYOND LIMIT, CANNOT INSERT");
                                flag=1;
                                break;
                        }
                    }
                    if(flag==0){
                        node.prev=temp1.prev;
                        node.next=temp.next;
                        temp.next=node;
                        temp1.prev=node;
                    }
                }
            }
    }
    void deletefirst(){
        if(first==null){
            System.out.println("Empty linked list, Nothing to delete");
        }
        else{
            DLL temp=first;
            first=first.next;
            System.out.println("Itembeing deleted is::"+temp.data);
            first.prev=null;
            temp=null;
        }
        
        }
    void deletelast(){
        if(first==null){
                System.out.println("Nothing to delete");
        }
        else if(first.next==null){
            System.out.println("Itembeing deleted is:" +first.data);
            first=null;
        }
        else{
                DLL temp1=first;
                DLL temp2=first.next;
                while(temp2.next!=null){
                        temp1=temp1.next;
                        temp2=temp2.next;
                }//end of while
                System.out.println("Item being deletedis"+temp2.data);
              
                temp1.next=null;
                  temp2=null;
                
        }
    }
    void delete_spc_position(int pos){
            try{
                if(first==null){
                        System.out.println("Emptylink list, nothing to delete");
            }
            else if(pos==1){
                    DLL temp;
                    temp=first;
                    first=first.next;
                    System.out.println("Item being deleted is"+temp.data);
                    temp=null;
                    first.prev=null;
                }
                else{
                        DLL temp1=first, temp2=first.next;
                        for(int count=0;count<(pos-2);count++){
                                temp1=temp1.next;
                                
                               
                                    temp2=temp2.next;
                                    
                        }
                        System.out.println("Element being deleted::"+temp2.data);
                       DLL temp3=temp2.next;
                        temp1.next=temp3;
                         temp3.prev=temp1;
                         temp2=null;
                                    
                }
            }
                catch(NullPointerException e){
                            System.out.println("Invalid position");
                            
                        }
    }
    void displayfirst(){
            if(first==null){
            System.out.println("Empty Linked List");
        }
        
        else{
            DLL temp=first;
            System.out.println("\n");
            
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
                
            }
            
            }
    }
   void displaylast(){
              if(first==null){
            System.out.println("Empty Linked List");
        }
        
        else{
            DLL temp=first;
            System.out.println("\n");
            
            while(temp.next!=null){
                temp=temp.next;
                
            }
                while(temp.prev!=null){
                  System.out.println(temp.data+"->");
                  temp=temp.prev;
                }
            
            }
   } 
    public static void main(String[] args) {
         doubleLL dll=new doubleLL();
        
        Scanner inp=new Scanner(System.in);
        int choice;
        
        System.out.println("Double Linked List");
        System.out.println("-----------");
        System.out.println("***MENU***");
        System.out.println("1. Create");
        System.out.println("2. Insert At First");
        System.out.println("3. Insert At Last");
        System.out.println("4. Insert At Specific Position");
        System.out.println("5. Delete From First");
        System.out.println("6. Delete From Last");
        System.out.println("7. Delete From specific position");
        System.out.println("8. Display From First");
        System.out.println("9. Display From Last");

        
        System.out.println("Enter your choice");
        int ch=inp.nextInt();
        
        while(true){
            if(ch==1){
                char cho;
                System.out.println("Linked List Created");
                
                do{
                    System.out.println("Enter element to be stored");
                    int id=inp.nextInt();
                    dll.insertlast(id);
                    
                    System.out.println("Do you want to insert again");
                    cho=inp.next().charAt(0);
                }while(cho=='Y' || cho=='y');
                break;
            }
            
            else{
                System.out.println("Make sure you created the Linked List first");
                System.out.println("Enter your choice");
                ch=inp.nextInt();
            }
        }
        
        do{
          System.out.println("***MENU***");
    
          System.out.println("2. Insert At First");
          System.out.println("3. Insert At Last");
          System.out.println("4. Insert At Specific Position");
          System.out.println("5. Delete From First");
          System.out.println("6. Delete From Last");
          System.out.println("7. Delete From specific position");
            System.out.println("8.Display From First");
            System.out.println("9. Display From Last");
         
          System.out.println("Enter your choice");
          int ch1=inp.nextInt();
          
          switch(ch1){
                case 2:
                    System.out.println("Enter the element you want to insert at first");
                    int id=inp.nextInt();
                    dll.insertfirst(id);
                    break;
               
                case 3:
                    System.out.println("Enter the element you want to insert at last");
                    id=inp.nextInt();
                    dll.insertlast(id);
                    break;
                  
                case 4:
                    System.out.println("Enter the element you want to insert");
                    id=inp.nextInt();
                
                    System.out.println("Enter the position you want to insert");
                    int pos=inp.nextInt();
                
                    while(pos<=0){
                        System.out.println("Insert valid position");
                    }
                    dll.insert_spc_position(id, pos);
                    break;
                
                case 5:
                    System.out.println("Deleting element from first");
                    dll.deletefirst();
                    break;
                
                case 6:
                    System.out.println("Deleting element from last:");
                    dll.deletelast();
                    break;
                
                case 7:
                    System.out.println("Enter the posistion where you want to delete:");
                    pos=inp.nextInt();
                    while(pos<0){
                        System.out.println("Insert valid position");
                    }
                    dll.delete_specific_position(pos);
                    break;
              
                case 8:
                    System.out.println("Traversal");
                    dll.displayfirst();
                    break;
                case 9:
                    System.out.println("Traversal");
                    dll.displaylast();
                    break;
              
                
                default:
                    System.out.println("Invalid Input");  
            }
            System.out.println("Do you want to continue operations again(Y/N)");
            choice=inp.next().charAt(0);
        }while(choice=='Y'|| choice=='y');        
    }
}




    

                   
                      