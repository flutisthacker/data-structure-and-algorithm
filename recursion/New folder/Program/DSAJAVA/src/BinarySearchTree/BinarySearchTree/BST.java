
package BinarySearchTree;

import java.util.*;
public class BST {
   Tree root;
   BST(){
        root=null;
   }
   void insert(int id){
       Tree node=new Tree(id);
       
       if(root==null){
           root=node;
           root.lchild=null;
           root.rchild=null;
       }
       else {
           Tree current=root;
       Tree parent=null;
       parent=current;
      
               if(id<current.data){
                   current=current.lchild;
                   if(current==null){
                       parent.lchild=node;
                   }
               }
               else{
                   current=current.rchild;
                   if(current==null){
                       parent.rchild=node;
                   }
               }
        }
   }
   void search(int num){
       Tree current=root;
       if(current==null){
            System.out.println("There is no any tree");
       }
       else{
       while(current!=null){
       if(current.data==num){
           System.out.println("Item found::"+current.data);
           break;
       }
       else if(current.data>num){
           current=current.lchild;
       }
       else if(current.data<num){
           current=current.rchild;
       }
       else{
           System.out.println("Item not Found!!");
       }
       }
       
   }
   }
   void display(Tree root){
       if(root!=null){
           display(root.lchild);
            System.out.println(root.data);
            display(root.rchild);
       }
       }
   
   public static void main(String args[]){
       BST b=new BST();
       int ch;
       char c,cho;
       Scanner inp=new Scanner(System.in);
       do{
       System.out.println("Binary Search Tree");
       System.out.println("***MENU***");
       System.out.println("1.Insert");
       System.out.println("2.Search");
       System.out.println("3.Delete");
       System.out.println("4.display");
       System.out.println("Enter your choice::");
       ch=inp.nextInt();
     
       switch(ch){
           case 1:
               do{
               System.out.println("Enter element::");
               int n=inp.nextInt();
                b.insert(n);
                System.out.println("Do you want to insert again?");
                    c=inp.next().charAt(0);
                }while(c=='Y' || c=='y');
               break;
           case 2:
               System.out.println("Enter element::");
               int a=inp.nextInt();
                b.search(a);
               break;
           case 3:
               System.out.println("Displaying Tree");
               b.display(b.root);
               break;
           default:
               System.out.println("Wrong choice");
       }
               System.out.println("Do you want to continue operation??"); 
               cho=inp.next().charAt(0);
               
       }while(cho=='y'||cho=='Y');
       }
   }
   
   
   
                   
              
              
  