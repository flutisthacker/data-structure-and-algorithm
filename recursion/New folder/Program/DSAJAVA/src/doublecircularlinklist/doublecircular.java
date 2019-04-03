
package doublecircularlinklist;

import java.util.*;

public class doublecircular {
   
    DCLL first,last;
         
    
    doublecircular(){
        first=null;
            last=null;
        
    }
    void insertfirst(int id){
            DCLL node=new DCLL(id);
            if(first==null){
                    first=last=node;
                    first.next=last;
                    first.prev=last;
                    last.next=first;
            }
            else{
                
                node.next=first;
                node.prev=last;
                first.prev=node;
                first=node;
                 last.next=first;
            }
    }
    void insertlast(int id){
        DCLL node=new DCLL(id);
         if(first==null){
                    first=last=node;
                    first.next=last;
                    first.prev=last;
                    last.next=first;
            }
        else{
                last.next=node;
                node.prev=last;
                last=node;
                last.next=first;
                first.prev=last;
        }
    }
    void insert_spc_position(int id,int pos){
            DCLL node=new DCLL(id);
             if(first==null){
                    first=last=node;
                    first.next=last;
                    first.prev=last;
                    last.next=first;
            }
            else{
                if(pos==1){
                        node.next=first;
                node.prev=last;
                first.prev=node;
                first=node;
                 last.next=first;
                }
                else{
                    DCLL temp1,temp=null;
                    temp1=first;
                    int flag=0;
                    int count;
                    for(count=0; count<(pos-1);count++){
                        if(temp1.next!=first){
                            temp=temp1;
                            temp1=temp1.next;
                            
                        }
                        
                   
                        else{
                                
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
                    else {
                            if(pos==(count+2)){
                                    last.next=node;
                node.prev=last;
                last=node;
                last.next=first;
                first.prev=last;
                            }
                            else{
                                    System.out.println("Invalid position");
                            }
                    }
                }
            }
    }
    void deletefirst(){
        if(first==null){
            System.out.println("Empty linked list, Nothing to delete");
        }
        else{
            DCLL temp=first;
            first=first.next;
            System.out.println("Itembeing deleted is::"+temp.data);
            first.prev=last;
            last.next=first;
            temp=null;
        }
        
        }
    void deletelast(){
        if(first==null){
                System.out.println("Nothing to delete");
        }
        else{
                if(first.next==last){
            System.out.println("Itembeing deleted is:" +first.data);
            first=last=null;
          }
        else{
                DCLL temp=last;
                System.out.println("Item being deleted is::"+temp.data);
                last=last.prev;
                last.next=first;
                first.prev=last;
                temp=null;
                
        }
        }
    }
    void delete_spc_position(int pos){
            
                if(first==null){
                        System.out.println("Emptylink list, nothing to delete");
            }
            else if(pos==1){
                   DCLL temp=first;
            first=first.next;
            System.out.println("Itembeing deleted is::"+temp.data);
            first.prev=last;
            last.next=first;
            temp=null;
                }
                else{
                        DCLL temp1=first, temp2=first.next;
                        for(int count=0;count<(pos-2);count++){
                                temp1=temp1.next;
                                
                               
                                    temp2=temp2.next;
                                    
                        }
                        if(temp2==first){
                                System.out.println("Invalid position");
                        }
                        else{
                        System.out.println("Element being deleted::"+temp2.data);
                       DCLL  temp3=temp2.next;
                        temp3.prev=temp2.prev;
                        temp1.next=temp2.next;
                         //temp3.prev=temp1;
                         temp2=null;
                        }        
                }
            }
                
    
    void displayfirst(){
            if(first==null){
            System.out.println("Empty Linked List");
        }
        
        else{
            DCLL temp=first;
            System.out.println("\n");
            
            while(temp.next!=first){
                System.out.print(temp.data+"->");
                temp=temp.next;
                
            }
            if(temp.next==first)
            {
                System.out.println(temp.data);
            }
            
            }
    }
   void displaylast(){
              if(first==null){
            System.out.println("Empty Linked List");
        }
        
        else{
            DCLL temp=last;
            System.out.println("\n");
            
            while(temp.prev!=last){
                System.out.print(temp.data+"->");
                temp=temp.prev;
                
            }
            if(temp.prev==last){
                    System.out.print(temp.data+"\n");
            }
               
                 
               
            
            }
   } 
    public static void main(String[] args) {
         doublecircular dll=new doublecircular();
        
        Scanner inp=new Scanner(System.in);
        int choice;
        
        System.out.println("Double Circular Linked List");
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
                    if(pos<=0){
                        System.out.println("Insert valid position");
                    }
                    else{
                    dll.delete_spc_position(pos);
                    }
                    break;
              
                case 8:
                    System.out.println("Traversal from first");
                    dll.displayfirst();
                    break;
                case 9:
                    System.out.println("Traversal from last");
                    dll.displaylast();
                    break;
              
                
                default:
                    System.out.println("Invalid Input");  
            }
            System.out.println("Do you want to continue operations again?(Y/N)");
            choice=inp.next().charAt(0);
        }while(choice=='Y'|| choice=='y');        
    }
}




    

                   
                       

