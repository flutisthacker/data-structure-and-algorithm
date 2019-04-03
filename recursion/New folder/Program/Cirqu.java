
package Cirq;
import java.util.*;
public class Cirqu {
    int front;
    int rear;
    int max;
    int cq[];
        Cirqu(int m){
            front=-1;
            rear=-1;
            max=m;
            cq=new int[m];
        }
        void enqueue(int item){
            if(front==(rear+1)%max){
                System.out.println("Queue is full.");
                }
            else if(front==-1){
                    front=rear=0;
                }
             else{
                    rear=(rear+1)%max;
                   
                }
                cq[rear]=item;
                 System.out.println("The Entered item is::"+cq[rear]);
            
            }
        void dequeue(){
            if(front==-1){
                System.out.println("Queue is empty.");
            }
            else{
                if(front==rear){
                System.out.println("Item being dequeued is::"+cq[front]);
                cq[front]=0;
                front=rear=-1;
            }
            else{
                System.out.println("Item being Dequeued is::"+cq[front]);
                cq[front]=0;
                front=(front+1)%max;
            }
        }
        }
        void display(){
                System.out.println("Displaying queue");
            if(front==-1){
                System.out.println("Queue is Empty.");
            }
           
                  
     else {
                for(int i=front;i<=rear;i++)
                      
                    System.out.println(cq[i]);
                
            
     }
        }       
public static void main(String[] args){
    char cho;
    Scanner inp=new Scanner(System.in);
      System.out.println("Enter the size of queue::");
      int m=inp.nextInt();
       Cirqu cir=new Cirqu(m);
       do{
           System.out.println("***Menu***");
           System.out.println("Press1.Enqueue.");
           System.out.println("press2.Dequeue.");
           System.out.println("press3.Traversal");
           int ch=inp.nextInt();
       switch(ch){
           
           case 1:
        do{
        System.out.println("Enter the elements to insert in Queues::");
        int item=inp.nextInt();
        cir.enqueue(item);
        System.out.println("Do you want to insert again::(y||Y)");
        cho=inp.next().charAt(0);
        }while(cho=='y'||cho=='Y'); 
        break;
           case 2:
        do{
         cir.dequeue();
            System.out.println("Do you want to dequeue again::(y||Y)");
            cho=inp.next().charAt(0);
        }while(cho=='y'||cho=='Y');
        break;
           case 3:
               cir.display();
               break;
           default:
               System.out.println("Invalid choise!!");
       }
           System.out.println("Do you want to continue operation on Queue::(y||Y)");
           cho=inp.next().charAt(0);
       }while(cho=='y'||cho=='Y');
}
}

















    

