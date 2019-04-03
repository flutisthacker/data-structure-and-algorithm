import java.util.*;
public class queueLL {
    public int data;
    public queueLL next;
    queueLL(){}//empty constructor
    queueLL(int id)
    {
        this.data=id;
    }
}
class LLqueue{
    queueLL first;
    LLqueue(){
    first=null;
    }
    
    void enqueue(int id){
        
        queueLL node=new queueLL(id);
        if(first==null){
            first=node;
            first.next=null;
        }
        else{
            queueLL temp=first;
           while(temp.next!=null){
               temp=temp.next;
           }                                                                                                                                                                                                                                                                                                                       
           temp.next=node;
           node.next=null;
        }
    }
   void dequeue(){
           queueLL temp=first;
        if(first==null){
                System.out.println("Queue is edmpty");
        }
        else if(first.next==null){
                
                System.out.println("Element dequeued is::"+first.data);
                first=null;
        }
        else{
            first=first.next;
             System.out.println("Element dequeued is::"+temp.data);
               
                temp=null;
        }
        
    }
         
   void traversal(){
       if(first==null){
           System.out.println("Linked list as queue empty,nothing to display.");       
       }
       else{
           System.out.println("Item being displayed:"); 
           queueLL temp=first;
           do{
               System.out.println(temp.data);
               temp=temp.next;
           }while(temp!=null);
       }
   }
   public static void main(String args[]){
            LLqueue q=new LLqueue();
            Scanner inp=new Scanner(System.in);
            int ch; 
            char choice;
               do{
        System.out.println("Menu");
        System.out.println("----");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.TRAVERSAL");
        System.out.println("4.EXIT");            
        System.out.print("Enter your choice:");
                 ch=inp.nextInt();
                switch(ch)
                {
                case 1:
                do{
                System.out.print("Enter the number to insert:");
                int id=inp.nextInt();
                q.enqueue(id);
                System.out.print("Do you want to insert more(Y/N)?: ");
                choice=inp.next().charAt(0);
                }while(choice=='Y'||choice=='y');
                break;
               
                case 2:
                    do{
                q.dequeue();
                System.out.print("Do you want to dequeue more(Y/N)?: ");
                choice=inp.next().charAt(0);
                    }while(choice=='Y'||choice=='y');
                break;
                    
                case 3:
                    //System.out.println("Items being display:");                    
                 q.traversal();
                 break;
                    
                case 4:
                    break;
                    
                default:
                System.out.println("Invalid Choice");
                    break;
                        
                }
                if(ch==4)
                {
                    break;
                }
        }while(true);
   }
} 
