import java.util.*;
public class BinarySearchTree{
Tree root;
		BinarySearchTree(){
		root=null;
		}

public void insert(int value){
            Tree node = new Tree(value);
            if(root==null){
                root = node;
                    System.out.println(value+"inserting as root");
            }
            else{
                Tree cur = root;
                 Tree par=null;

				while(cur!=null){
				par=cur;
					if(value < cur.data){
						cur=cur.lchild;
					}else{
						cur=cur.rchild;
					}
				}
					if(value<par.data){
						System.out.println("inserting "+value+" as a left child of "+par.data);
						par.lchild=cur;
					}else{
						System.out.println("inserting "+value+" as a right child of "+par.data);
						par.rchild=cur;
					}
			}//else
}//void

public void search(int key){
	Tree cur=root;
	int lvl=0;
	if( cur == null)
		System.out.println("tree nai chaina k khojxa");
	else{
	  if( key == root.data){
			System.out.println(key+" found at level "+lvl);
  		}else{
	  while(true){
             if( key<cur.data){
		         lvl++;
	             cur = cur.lchild ;
			if(cur == null){
			   	System.out.println(" paudaina key vanne");
			  break;
                            }else if( key == cur.data ){
							System.out.println( key+"found at level"+lvl );
                            break;
                     }   else{  //if
                  	lvl++;
				cur=cur.rchild;
		}
					if( cur == null ){
						 System.out.println(" paudaina key vanne");
					  break;
                            }else if( key == cur.data ){
							System.out.println( key+"found at level"+lvl );
                            break;
                        }//else if
				}//if
			}//while
		}  //else
	} //else
} //VOID

 void pre_order(){
                    preOrder(root);
                }
                void preOrder(Tree root){
                    if(root!=null){
                        System.out.print(root.data+";");
                        preOrder(root.lchild);
                        preOrder(root.rchild);
                    }
                }

				void in_order(){
		                    inOrder(root);
				                }
                void inOrder(Tree root){
					if(root!=null){
						inOrder(root.lchild);
						System.out.print(root.data+";");
						inOrder(root.rchild);
				                    }
                }

                   void post_order(){
				                    postOrder(root);
					                }
	                void postOrder(Tree root){
				                    if(root!=null){
				                        postOrder(root.lchild);
										postOrder(root.rchild);
										System.out.print(root.data+";");
								                    }
                }

public void delete(int value){
Tree del=null;

	if( value == null )
		System.out.println( " tree is not there no tree found" );
	else{
		if( value == root )
			root=null;
		else{

		}

	} //if
}//delete

public int input(){
	Scanner in=new Scanner(System.in);
	System.out.print("enter a value=");
	int value=in.nextInt();
	return value;
}

public static void menu(){
	System.out.println(" 1 insert");
	System.out.println(" 2 search");
	System.out.println(" 3 display");
	System.out.println(" 0 exit");
	}


public static void main(String[] args){
BinarySearchTree bst=new BinarySearchTree();
int x=1;
do{
	bst.menu();
System.out.print("choice ");
int choice=bst.input();

switch( choice ){
	case 0:
		System.exit(0);
		break;
	case 1:
		int n=bst.input();
		bst.insert(n);
		break;
	case 2:
		int s=bst.input();
		bst.search(s);
		break;
	case 3:
		int order=bst.input();
        if(order==1)
        	bst.pre_order();

        else if(order==2)
           bst.in_order();

         else
            bst.post_order(); System.out.println();

		break;
	default:
		System.out.print("wrong");
		}
	}while(x!=0);
}//main
}//class


/*
public void keyPressed(KeyEvent k) {
	   if (k.getKeyCode() == KeyEvent.VK_UP) {...}
	   else if (k.getKeyCode() == KeyEvent.VK_DOWN) {...}
	   else if (k.getKeyCode() == KeyEvent.VK_LEFT) {...}
	   else if (k.getKeyCode() == KeyEvent.VK_RIGHT) {...}
}
*/