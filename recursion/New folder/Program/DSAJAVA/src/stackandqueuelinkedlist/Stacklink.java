
package stackandqueuelinkedlist;
import java.util.*;
public class Stacklink {
   private int top;
   LL first;
   Stacklink(){
        top=-1;
        first=null;
   }

void push(int id){
    LL node =new LL(id);
        if(top==-1){
               // System.out.println("Stack is empty");
                first=node;
                System.out.println("the inserted item is::"+first.data);
                first.next=null;
                    top++;
                
        }
        else{
               
                LL temp=node;
                 System.out.println("The inserted item is::"+temp.data);
                temp.next=first;
                first=node;
                top++;
        }
        System.out.println("Top::"+top);
}    
void pop(){
        if(top==-1){
                System.out.println("Stack is empty");
        }
        else{
                LL temp1=first, temp2=first.next;
                while(temp2.next!=null){
                    
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
                System.out.println("The popped item is:"+temp2.data);
                temp2=null;
                temp1.next=null;
                top--;
        }
         System.out.println("Top::"+top);
}
void display(){
        System.out.println("Elements of stack::");
            if(top==-1){
                System.out.println("stack is empty");
            }
            else{
                LL temp=first;
                while(temp!=null){
                        System.out.print(temp.data+"->");
                        temp=temp.next;
                }
                System.out.println("null");
            }
        }

                
        
        
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        char ch;
        Stacklink sl=new Stacklink();
        do{
        System.out.println("***MENU***");
        System.out.println("1.Push \n 2.Pop \n 3.Display");
        System.out.println("Enter choice::");
        int choice=inp.nextInt();
        
        switch(choice){
            case 1:
        
                     do{
                         System.out.println("Enter the element");
                            int item=inp.nextInt();
                           sl.push(item);
                             System.out.println("Do you want to insert more element??");
                             ch=inp.next().charAt(0);
                     }while(ch=='y'||ch=='Y');
                       break;
            case 2:
                   do{
                            sl.pop();
                            System.out.println("Do you want to ipop more element??");
                              ch=inp.next().charAt(0);
                        }while(ch=='y'||ch=='Y');
                         break;
            case 3:
                    sl.display();
            default:
                    System.out.println("wrong input");
        }
            System.out.println("Do you want to continue the operation??");
            ch=inp.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
}
        
        
        
        
        