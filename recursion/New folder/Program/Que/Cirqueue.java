
package cqueue;
import java.util.*;
public class Cirqueue {
    private int front;
    private int rear;
    private int CQ[];
    private int max;
    Cirqueue(int m){
        front=-1;
        rear=-1;
        max=m;
        CQ=new int[max];
    }
    void enqueue(int item){
            if(front==(rear+1)%max){
                   System.out.println("Queue is full, Cannot insert");
            }
            else{
                    if(front==-1){
                        front=0;
                        rear=0;
                    }
                    else{
                        rear=(rear+1)%max;
                        CQ[rear]=item;
                        System.out.println("Inserted item is:"+CQ[rear]);
                    }
            }
    }
    void dequeue(){
        if(front==-1)
              
            }
        
    }
}
