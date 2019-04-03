
package stackandqueuelinkedlist;

import java.util.*;
public class Queuelink {
    LL front, rear;
    Queuelink(){
            front=rear=null;
    }
    void enqueue(int id){
            LL node=new LL(id);
            System.out.println("Element enqueued is::"+node.data);
            if(front==null && rear==null){
                    
                    node.next=null;
                    front=rear=node;
            }
            else{
                    rear.next=node;
                    rear=node;
    }
                    
    }
    void dequeue(){
        LL temp=front;
        if(front==null){
                System.out.println("Queue is edmpty");
        }
        else if(front==rear){
                
                System.out.println("Element dequeued is::"+front.data);
                front=rear=null;
        }
        else{
             System.out.println("Element dequeued is::"+front.data);
                front=front.next;
        }
        temp=null;
    }
    void display(){
        System.out.println("Element in Queue link list are::");
        LL temp1=front;
        while(temp1!=null){
                System.out.print(temp1.data+" ->");
                temp1=temp1.next;
        }                                                                                                                        
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        char ch;
        Queuelink ql=new Queuelink();
        do{
        System.out.println("***MENU***");
        System.out.println("1.Enqueue \n 2. Dequeue \n 3.Display");
        System.out.println("Enter choice::");
        int choice=inp.nextInt();
        
        switch(choice){
            case 1:
        
                     do{
                         System.out.println("Enter the element to enqueue");
                            int item=inp.nextInt();
                           ql.enqueue(item);
                             System.out.println("Do you want to insert more element??");
                             ch=inp.next().charAt(0);
                     }while(ch=='y'||ch=='Y');
                       break;
            case 2:
                   do{
                            ql.dequeue();
                            System.out.println("Do you want to dequeue more element??");
                              ch=inp.next().charAt(0);
                        }while(ch=='y'||ch=='Y');
                         break;
            case 3:
                    ql.display();
                    break;
            default:
                    System.out.println("wrong input");
        }
            System.out.println("Do you want to continue the operation??");
            ch=inp.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
}
        
        
        
        
        
    
