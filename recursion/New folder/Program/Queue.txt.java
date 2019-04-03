

import java.util.*;
public class Queue {
    private int front;
    private int rear;
    private int max;
    private int Q[];
    Queue(int m){
        front=0;
        rear=-1;
        max=m;
        Q=new int[max];
    }//end of constructor
    void enqueue(int item){
        if(rear==max-1){
                System.out.println("Queue is full, Cannot insert");
        }//end of if
        else{
            rear++;
            Q[rear]=item;
            System.out.println("The item inserted is::"+item);
        }
    }//end of enqueue
    void dequeue(){
        if(front==-1){
            System.out.println("Queue is empty, cannot dequeue");
            front=0;
        }
        else{
            System.out.println("Itm being dequeued is:"+Q[front]);
            Q[front]=0;
            front++;
            if(front>rear){
                front=-1;
                rear=-1;
            }  
        }
    }//end of dequeue
      void display(){
          if(front==-1){
              System.out.println("Queue is empty, Nothing to display");
          }
          else{
              int i=front;
              System.out.println("Displaying element:");
              while(i<=rear){
                  System.out.println(Q[i]);
                  i++;
              }
          }
      }//end of display
      public static void main(String args[]){
          char cho;
          Scanner inp=new Scanner(System.in);
          System.out.println("Enter size of queue:");
          int s=inp.nextInt();
          Queue q=new Queue(s);
          System.out.println("****MENU****");
          System.out.println("-------------");
          System.out.println("Press1. Enqueue");
          System.out.println("Press2 .Dequeue");
          System.out.println("Press3. Display");
          System.out.println("Enter your choice");
          int ch=inp.nextInt();
          switch(ch){
              case 1:
                  do{
                      System.out.println("Enter the element to insert in queue");
                      int item=inp.nextInt();
                      q.enqueue(item);
                      System.out.println("Do u want ti ninsert again?");
                      cho=inp.next().charAt(0);
                  }while(cho=='y'||cho=='Y');
                  break;
              case 2:
                  do{
                      q.dequeue();
                      System.out.println("Do u want to dequeue?(y/Y)");
			cho=inp.next().charAt(0);
		}while(cho=='y'||cho=='Y');
		break;
	case 3:
		q.display();
		break;
	default:
		System.out.println("Invalid Input");
	}//end of switch
	System.out.println("Do u want to continue queue?(Y/y)");
	cho=inp.next().charAt(0);
	}while(cho=='y'||cho=='Y');
	}//end of main
}//end of stack

                  
                    
             
              
      
      
      
      }
            }
    }
        
    }
}
