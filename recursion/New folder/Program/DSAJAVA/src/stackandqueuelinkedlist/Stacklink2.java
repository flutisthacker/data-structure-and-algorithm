
package stackandqueuelinkedlist;

import java.util.*;
public class Stacklink2 {
   private LL top;
   int cnt;
   LL first;
   Stacklink2(){
        cnt=-1;
        top=null;
   }

void push(int id){
    LL node =new LL(id);
        if(top==null){
               // System.out.println("Stack is empty");
                top=node;
                System.out.println("the inserted item is::"+top.data);
                top.next=null;
                  
                
        }
        else{
               
              LL temp=top;
                 System.out.println("The inserted item is::"+node.data);
        while(temp.next!=null){
                temp=temp.next;
        }//end of while
            temp.next=node;
            node.next=null;
        }
    }
       
void pop(){
        if(top==null){
                System.out.println("Stack is empty");
        }
        else{
                LL temp1=top, temp2=top.next;
                while(temp2.next!=null){
                    
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
                System.out.println("The popped item is:"+temp2.data);
                temp2=null;
                temp1.next=null;
        }
                
        // System.out.println("Top::"+cnt);
}
void display(){
        System.out.println("Elements of stack::");
            if(top==null){
                System.out.println("stack is empty");
            }
            else{
                LL temp=top;
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
        Stacklink2 sl=new Stacklink2();
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
                break;
            default:
                    System.out.println("wrong input");
        }
            System.out.println("Do you want to continue the operation??");
            ch=inp.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
}
        
        
        
        
         
}
