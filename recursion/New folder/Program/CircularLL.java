
package Circular_linked_list;
import CLL.*;
import java.util.*;

public class CircularLL {
    
    CLL first;
    CLL last;
    
    CircularLL(){
        first=null;
        last=null;
    }
    
    void insertfirst(int id){
        CLL node=new CLL(id);
        
        if(first==null){
            first=node;
            last=node;
            last.next=first;
        }
        
        else{
            node.next=first;
            first=node;
            last.next=first;
        }  
    }
    
    void insertlast(int id){
        CLL node=new CLL(id);
        
         if(first==null){
            first=node;
            last=node;
            last.next=first;
        }
        else{
            CLL temp=first;
            while(temp.next!=first){
                temp=temp.next;
            }
            last.next=node;
            last=node;
            last.next=first;
        }
    }
    
 /* void insert_spc_position(int id,int pos)
	{
		CLL node=new CLL(id);
		if(first==null)
		{
			first=node;
			first.next=null;
		}

		else
		{
			if(pos==1)
			{
				node.next=first;
				first=node;
			}

			else
			{
				CLL temp1,temp=null;
				temp1=first;
				int flag=0;
				int count;
				for(count=0;count<(pos-1);count++)
				{
					if(temp1!=null)
					{
						temp=temp1;
						temp1=temp.next;
					}
	
					else
					{
						System.out.println("Position beyond limit,Cannot insert");
						flag=1;
						break;
					}
				}

				if(flag==0)
				{
					node.next=temp1;
					temp.next=node;
				}
			}
		}
	}


    */
    void deletefirst(){
        if(first==null){
            System.out.println("Empty Linked List,Nothing to display");
        }
        
        
        else
        {
            
            CLL temp=first;
            first=temp.next;
            last.next=first;
            System.out.println("Item being deleted is:"+temp.data);
            temp=null;
        }
    }
    
    /*void deletelast(){
        if(first==null){
            System.out.println("Empty Linked List,Nothing to display");
        }
        else if(first.next==null){
            System.out.println("Item deleted is:"+first.data);
            first=null;
        }
        
        else{
            CLL temp1=first;
            CLL temp2=first.next;
        
            while(temp2.next!=null){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            System.out.println("Item being deleted:"+temp2.data);
            temp2=null;
            temp1.next=null;
        }
    }
    
    void delete_specific_position(int pos){
        try{
            if(first==null){
                System.out.println("Empty Linked list,Nothing to display");
            }
            
            else if(pos==1){
                CLL temp;
                temp=first;
                first=first.next;
                System.out.println("ELement being deleted is:"+temp.data);
                temp=null;
            }
            
            else{
                CLL temp1=first,temp2=first.next;
                
                for(int count=0;count<(pos-2);count++){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
                System.out.println("Element being deleted is:"+temp2.data);
                temp1.next=temp2.next;
                temp2=null;
            }
        }
        
        catch(Exception e){
            System.out.println("Invalid position");
        }
    }
    */
    void display(){
        if(first==null){
            System.out.println("Empty Linked List");
        }
        
        else{
            CLL temp=first;
            System.out.println("");
            
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
    
    /*void update(int pos,int id){
        if(pos==1){
            first.data=id;
            System.out.println("Item updated!!");   
        }
        
        else{
            CLL temp=first;
            CLL temp1=temp.next;
            int flag=0;
            
            for(int i=1;i<pos-1;i++){
                if(temp!=null){
                    temp=temp1;
                    temp1=temp.next;
                }
            }
            if(temp1==null){
                flag=1;
            }
            
            if(flag==0){
                temp1.data=id;
            }
            else{
                System.out.println("Cannot update!!!Make sure you update in valid position");
            }
        }
    }
    
    void search(int id){
        int count=1, flag=0;
        CLL temp=first;
        
        if(first.next==null){
            if(id==first.data){
                System.out.println("Position=1");
            }
            
            else{
                System.out.println("Number not found.");
            }
        }
        
        else if(id==first.data)
             {
                    System.out.println("Position=1");
             }
             
         else
         {
      
             
            while(temp.next!=null){
                temp=temp.next;
                count++;
                
                
                if(temp.data==id){
                    flag=1;
                    break;
                }
                
                else{
                    flag=0;
                }
            }
        
        
        if(flag==1){
            System.out.println("Position:"+count);
        }
        
        else{
            System.out.println("Number not found!!");
        }
    }
    }

    
    
    void countnodes(){
        int count=1;
        CLL temp=first;
        
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("No of nodes:"+count);
    }*/
    public static void main(String args[]){
        CircularLL cll=new CircularLL();
        
        Scanner inp=new Scanner(System.in);
        int choice;
        
        System.out.println("Singly Linked List");
        System.out.println("-----------");
        System.out.println("***MENU***");
        System.out.println("1. Create");
        System.out.println("2. Insert At First");
        System.out.println("3. Insert At Last");
        System.out.println("4. Insert At Specific Position");
        System.out.println("5. Delete From First");
        System.out.println("6. Delete From Last");
        System.out.println("7. Delete From specific position");
        System.out.println("8. Display");
        System.out.println("9. Update");
        System.out.println("10. Search");
	System.out.println("11. Count nodes");
        
        System.out.println("Enter your choice");
        int ch=inp.nextInt();
        
        while(true){
            if(ch==1){
                char cho;
                System.out.println("Linked List Created");
                
                do{
                    System.out.println("Enter element to be stored");
                    int id=inp.nextInt();
                    cll.insertlast(id);
                    
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
          System.out.println("1. Create");
          System.out.println("2. Insert At First");
          System.out.println("3. Insert At Last");
          System.out.println("4. Insert At Specific Position");
          System.out.println("5. Delete From First");
          System.out.println("6. Delete From Last");
          System.out.println("7. Delete From specific position");
          System.out.println("8. Display");
          System.out.println("9. Update");
          System.out.println("10. Search");
          System.out.println("11. Count nodes");
          
          System.out.println("Enter your choice");
          int ch1=inp.nextInt();
          
          switch(ch1){
                case 2:
                    System.out.println("Enter the element you want to insert at first");
                    int id=inp.nextInt();
                    cll.insertfirst(id);
                    break;
               
                case 3:
                    System.out.println("Enter the element you want to insert at last");
                    id=inp.nextInt();
                    cll.insertlast(id);
                    break;
                  
               /* case 4:
                    System.out.println("Enter the element you want to insert");
                    id=inp.nextInt();
                
                    System.out.println("Enter the position you want to insert");
                    int pos=inp.nextInt();
                
                    while(pos<=0){
                        System.out.println("Insert valid position");
                    }
                    cll.insert_spc_position(id, pos);
                    break;
                */
                case 5:
                    System.out.println("Deleting element from first");
                    cll.deletefirst();
                    break;
                
                /*case 6:
                    System.out.println("Deleting element from last:");
                    cll.deletelast();
                    break;
                
                case 7:
                    System.out.println("Enter the posistion where you want to delete:");
                    pos=inp.nextInt();
                    while(pos<0){
                        System.out.println("Insert valid position");
                    }
                    cll.delete_specific_position(pos);
                    break;
              */
                case 8:
                    System.out.println("Traversal");
                    cll.display();
                    break;
                
                /*case 9:
                    System.out.println("Enter the element");
                    id=inp.nextInt();
                    System.out.println("Enter the position");
                    pos=inp.nextInt();
                    while(pos<0){
                        System.out.println("Enter valid position");
                    }
                    cll.update(pos, id);
                    break;
                    
                case 10:
                    System.out.println("Enter the data you want to search");
                    id=inp.nextInt();
                    cll.search(id);
                    break;
                
                case 11:
                    cll.countnodes();
                    break;*/
                
                default:
                    System.out.println("Invalid Input");  
            }
            System.out.println("Do you want to continue operations again(Y/N)");
            choice=inp.next().charAt(0);
        }while(choice=='Y'|| choice=='y');        
    }
}

