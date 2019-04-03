
package Circ;
import java.util.*;
public class Cirqueue {
   private int front;
   private int rear;
   private int cq[];
   private int max;
Cirqueue(int m){
        max=m;
        front=-1;
        rear=-1;
        cq=new int[max];
}
public void enqueue(int n){
    if(front==(rear+1)%max){
        System.out.println("Queue is full");
    }
    else if(front==-1){
            front=rear=0;
               cq[rear]=n;
               System.out.println("The entered item is:"+cq[rear]);
        }
        else{
            rear=(rear+1)%max;
            cq[rear]=n;
            System.out.println("The entered item is:"+cq[rear]);
        }
        
        //System.out.println("Front:"+front+" Rear"+rear);

  }
public void dequeue(){
    if(front==-1){
        System.out.println("qUEUE IS EMPTY");
    }
    else{
        if(front==rear){
                System.out.println("Number being dequeued:"+cq[front]);
                cq[front]=0;
                front=rear=-1;
        }
        else{
            System.out.println("Number being dequeued::"+cq[front]);
            cq[front]=0;
            front=(front+1)%max;
        }
     }
    //System.out.println("Front:"+front+" Rear"+rear);
}
 public void show(){
	 //System.out.println("Front:"+front+" Rear"+rear);
     if(front==-1&&rear==-1){
         System.out.println("Queue is empty");
     }
     else if(front>rear){
         for(int i=0; i<=rear;i++){
			 System.out.println(cq[i]);
		}
		for(int j=front;j<=max-1;j++){
			System.out.println(cq[j]);

         }
}
else{
		for(int i=front;i<=rear;i++){
			System.out.println(cq[i]);
		}
     }
 }
    public static void main(String[] args) {
        char co;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter size:");
        int m=inp.nextInt();
        Cirqueue c=new Cirqueue(m);
          do{
        System.out.println("***MENU***");
        System.out.println("Press 1: Enqueue");
        System.out.println("Press 2: Dequeue");
        System.out.println("Press 3: Display");
        System.out.println("Enter choice:");
        int ch=inp.nextInt();

        switch(ch){
            case 1:
                    do{
                    System.out.println("Enter a number");
                    int num=inp.nextInt();
                    c.enqueue(num);
                        System.out.println("Do u want to enqueue again??[Y/y]");
                        co=inp.next().charAt(0);
                    }while(co=='Y'||co=='y');
                    break;
            case 2:
                    do{
                        c.dequeue();
                        System.out.println("Do u want to dequeue again??[Y/y]");
                        co=inp.next().charAt(0);
                    }while(co=='y'||co=='y');
                    break;
            case 3:

                    c.show();
                    break;
            default:
                System.out.println("Invalid input ");
        }

            System.out.println("Do u want to continue cirqueue??");

               co=inp.next().charAt(0);
    }while(co=='y'||co=='Y');



}


}
