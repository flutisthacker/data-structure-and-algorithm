
package Link;
import java.util.*;
public class Search{
    public LL first;
    Search(){
        first=null;
    }
    public void insertFirst(int id){
        LL node=new LL(id);
        if(first==null){
            first=node;
            first.next=null;
        }//end of if
        else{
            node.next=first;
            first=node;
        }
    }
    void insertLast(int id){
            LL node=new LL(id);
            if(first==null){
                first=node;
                first.next=null;
            }//end of if
            else{
                LL temp=first;
                while(temp.next!=null){
                    temp=temp.next;
                }//end of while
                temp.next=node;
                node.next=null;
            }//end of else
    }//end of insertLast()
    void insert_spc_position(int id, int pos){
        LL node=new LL(id);
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
                LL temp1, temp=null;
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
    }//end of insert_spc_position()*/
     public boolean search(int element){
      LL temp;
      temp=first;
      while(temp!=null){
          if(temp.data==element){
              return true;
        }
          temp=temp.next;
      }
              return false;
    }
     public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Search s=new Search();
        int choice;
         System.out.println("Menu");
         System.out.println("1.Create");
         System.out.println("2.Insert at first");
         System.out.println("3.Insert at specificposition");
         System.out.println("4.Insert at last");
         System.out.println("Enter your choice");
         int ch=inp.nextInt();
         while(true){
             if(ch==1){
                 char cho;
                    System.out.println("Linked list created");
                    do{
                        System.out.println("Enter elements to be stored");
                        int id=inp.nextInt();
                        s.insertLast(id);
                        System.out.println("Do u want to insert more elements??(Y/y)");
                        cho=inp.next().charAt(0);
                    }while(cho=='y'||cho=='Y');
                    break;
             }//end of if
             else{
                 System.out.println("Make sure you created the linked list first");
                 System.out.println("enter your choice:");
                 ch=inp.nextInt();
             }//end of else
         }//end of wzhile
        do{
                     System.out.println("Menu");
         System.out.println("1.Create");
         System.out.println("2.Insert at first");
         System.out.println("3.Insert at specificposition");
         System.out.println("4.Insert at last");
         System.out.println("Enter your choice");
         int ch1=inp.nextInt();
         switch(ch1){
             case 2:
                 System.out.println("Enter the elements to be inserted at first::");
                 int id=inp.nextInt();
                 s.insertFirst(id);
                 break;
             case 3:  
                 System.out.println("Enter the elements to be inserted at specific position::");
                 id=inp.nextInt();
                 System.out.println("Enter position:");
                 int pos=inp.nextInt();
                 while(pos<=0){
                     System.out.println("Invalid position");
                 }
                 s.insert_spc_position(id,pos);
                 break;
                 case 4:
                 System.out.println("Enter the elements to be inserted at last::");
                  id=inp.nextInt();
                 s.insertLast(id);
                 break;
                 default:
                     System.out.println("Invalid choice");
         }//end of switch
         System.out.println("Enter elements to search and display its position::");
             int n=inp.nextInt();
             
             
             
             
             
          
             
             boolean r=s.search(n);
             if(r==true){
                 System.out.println("True");
             }
             else
                 System.out.println("False");
            System.out.println("Do u want to continue with Linked list searching position operation:");
            choice=inp.next().charAt(0);
        }while(choice=='Y'||choice=='y');
     }
}
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
          
  
  
  
  
  