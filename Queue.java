//lesson3 ,4 and 5 circular queue
//stack is  LIFO 123456789<-
//queue ->123456789
//initializing front=0 |rear=-1

/*doubly ended queue[DEqueue]
insert from rear=enque--add from first
delete from front-deque--delete from first
insert from front--after deque insert again in front
delete from rear--delete from last

1 insertion from rear end
2insertion from front end
3 deletion from rear end
4deletion from front end
circular queue
*/

import java.util.*;
public class Queue{

int front,rear,max,count;
int []a; //array initialization

public Queue(int size){
	max=size;
	front=0;
	rear=-1;
	count=0;
	a=new int[max]; //a as the array with size max
	}//queue constructor

public void enque(int num){
	if(rear==max-1){
	System.out.println("Queue is full");
	}

	else{
	rear++;
	a[rear]=num;
	System.out.println("Enque is sucessfull");
	}//else
}//enque

public void deque(){
	if(front>rear){
	System.out.println("Queue is empty");
	}

	else{
	System.out.println(a[front]+" is deleted");
	front++;
	if (front>rear){
		front=0;
		rear=-1;
		}//if
	}//else
}//deque

public void InsertFromFront(int numm){
if(front==0&&rear==-1){
	a[front]=numm;
	rear++;
}
else if(front!=0){
	front--;
	a[front]=numm;
}
else{
	System.out.print("insertion cannot be done.");
}
}

public void DeleteFromRear(){
if(front>rear){
	System.out.print("Queue is empty");
	}
else{
	System.out.print("a["+rear+"]="+a[rear]);
	rear--;
}
	if(front>rear){
	front=0;
	rear=-1;
	}
}

public void CircularEnque(int numb){
	if(count==max){
		System.out.println("Queue is full");
	}

	else{
		rear=(rear+1)%max;
		a[rear]=numb;
		count++;
		System.out.println("Enque is sucessfull");
		}//else
}//enque


public void CircularDeque(){
		if(count ==0){
			System.out.println("Queue empty");
		}

		else{
			System.out.println("a[front]is going to be deleted");
			front=(front+1)%max;
			count--;
			}

		}

public void display(){
	if(front>rear){
	System.out.println("Queue is empty");
	}

	else{
		System.out.println("values in queue are->");
		for(int i=front;i<=rear;i++){
			System.out.println(a[i]+"\t");
		}
	}
}//display

public void DisplayCircle(){
	int k,j=front;
	for(k=1;k<=count;k++){
		System.out.println("values in queue are->");
			System.out.println(a[j]+"\t");
		j=(j+1)%max;
		}

}//display circle

public static void main(String []arg){
			Scanner in=new Scanner(System.in);
			System.out.println("enter size of queue->");
			int size=in.nextInt();
			Queue q=new Queue(size);
			char ch;
			do{
			System.out.println("|_______menu_______|");
			System.out.println("|0|exit            |");
			System.out.println("|1|enque from rear |");
			System.out.println("|2|deque from front|");
			System.out.println("|3|display         |");
			System.out.println("|4|enque from front|");
			System.out.println("|5|deque from rear |");
			System.out.println("|6|circular enque  |");
			System.out.println("|7|circular deque  |");
			System.out.println("|8|circular display|");
			System.out.println("|------------------|");
			System.out.println("\nEnter your choice;");
			int choice=in.nextInt();

				switch(choice){

					case 0:
					System.exit(0);
					break;

					case 1:
					System.out.println("\nEnter number;");
					int num=in.nextInt();
					q.enque(num);
					break;

					case 2:
					q.deque();
					break;

					case 3:
					q.display();
					break;

					case 4:
					System.out.println("\nEnter number;");
					int numm=in.nextInt();
					q.InsertFromFront(numm);
					break;

					case 5:
					q.DeleteFromRear();
					break;

					case 6:
					System.out.println("\nEnter number;");
					int numb=in.nextInt();
					q.CircularEnque(numb);
					//q.DisplayCircle();
					break;


					case 7:
					q.CircularDeque();
					break;

					case 8:
					q.DisplayCircle();
					break;

					default:
					System.out.println("wrong choice");

				}//switch
			ch='o';
		}while(ch!='Y');
}//main method
}//class
//finished