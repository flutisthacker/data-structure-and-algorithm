
//package LLstque;

import java.util.*;
public class STQUE {
    public int data;
    public STQUE  next;
     STQUE(){
         
     }//empty constructor
     STQUE(int id){
         this.data=id;
     }
}
class STQUE1{
    STQUE first;
    STQUE1(){
    first=null;
    }
    
    void push(int id){
            STQUE node=new STQUE(id);
        if(first==null){
            first=node;
            first.next=null;
        }
        else{
           STQUE temp=first;
           while(temp.next!=null){
               temp=temp.next;
           }                                                                                                                                                                                                                                                                                                                       
           temp.next=node;
           node.next=null;
        }
    }
    
    
    void pop(){
        if(first==null){
            System.out.println("Empty linked list,nothing to delete.");
        }
        else{
            STQUE temp1=first;
            STQUE temp2=first.next;
            while(temp2.next!=null){
                temp1=temp1.next;
                 temp2=temp2.next;
            }
            System.out.println("Item being popped is:"+temp2.data);
            temp2=null;
            temp1.next=null;
        }
    }
    
    
    void traversal(){
        int i=0;
        int a[]=new int[20];
        if(first==null){
            System.out.println("Nothing to delete");            
        }
        else{
            STQUE temp=first;
            while(temp!=null){
                a[i]=temp.data;
                i++;
                temp=temp.next;
            }
            for(int j=i-1;j>=0;j--){
                System.out.println(a[j]);                
            }
        }
     }
  
public static void main(String args[]){
            STQUE1 s=new STQUE1();
            Scanner inp=new Scanner(System.in);
            //int choice;
            char cho;
               do{
                System.out.println("***Menu***");
                System.out.println("----");
                System.out.println("1.PUSH");
                System.out.println("2.POP");
                System.out.println("3.TRAVERSAL");
                System.out.print("Enter your choice:");
                int ch=inp.nextInt();
                
                    switch(ch)
                    {
                        case 1:
                        
                        System.out.println("Linked list as stack");
                        do{
                            System.out.print("Enter a number to insert:");
                            int id=inp.nextInt();
                            s.push(id);
                            System.out.print("Do you want to insert more element?(Y/y): ");
                            cho=inp.next().charAt(0);
                        }while(cho=='Y'||cho=='y');
                        break;
                        case 2:
                            s.pop();
                            break;
                        case 3:
                            s.traversal();
                            break;
                        default:
                            System.out.println("Invalid Choice");
            
                    }   
                
                System.out.print("Do you want to continue operation?(Y/y): ");
                cho=inp.next().charAt(0);
               }while(cho=='Y'||cho=='y');
    }
}
