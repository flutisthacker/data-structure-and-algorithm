import java.util.*;
public class update1{
    public LL first;
    update1(){
        first=null;
    }
    void insertLast(int id){
            LL node=new LL(id);
            if(first==null){
                first=node;
                first.next=null;
            }//end of if
            else{
                LL temp=first;
                while(temp.next!=null){
                    temp=temp.next;
                }//end of while
                temp.next=node;
                node.next=null;
            }//end of else
    }//end of insertLast()
    void up(int num,int pos){
		try{
    	if(first==null){
    			System.out.println("Nothing to update");
    	}
    	else if(pos==1){
    		first.data=num;
    		System.out.println("Updated value:"+first.data);
    	}
    	else{
    		//LL temp1=first;
    		LL temp2=first.next;
    		for(int count=2;count<=pos;count++){
    			if(count==pos){
					temp2.data=num;
				}
				else{

    			temp2=temp2.next;
			}
    		}
    		System.out.println("Updated value::"+temp2.data);
    		//temp2=temp2.next;
		}
	}
	catch(NullPointerException e){
			System.out.println("Invalid position");
}
   }
   void display(){
   	if(first==null){
			System.out.println("Empty linked list");
		}//end of if
		else{
			LL temp3=first;
			System.out.println("\n");
			while(temp3!=null){
				System.out.print(temp3.data+"->");
				temp3=temp3.next;
			}//end of while
			System.out.println("null\n");
		}//end of else
}//end of display()

	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		int choice;
		update1 s=new update1();
			System.out.println("Menu");
			System.out.println("1. Create link");
			System.out.println("2. Update");
			System.out.println("3.display");
			System.out.println("Enter choice:");

			        	int ch=inp.nextInt();
			        	while(true){
			        	if(ch==1){

			        			char cho;

				                    System.out.println("Linked list created");
				                    do{
				                        System.out.println("Enter elements to be stored");
				                        int id=inp.nextInt();
				                        s.insertLast(id);
				                        System.out.println("Do u want to insert more elements??(Y/y)");
				                        cho=inp.next().charAt(0);
				                    }while(cho=='y'||cho=='Y');//end of do while()
				                    break;
						}//end of if

				      		  else{
				                 System.out.println("Make sure you created the linked list first");
				                 System.out.println("enter your choice:");
				                	ch=inp.nextInt();
				            		 }//end of else
				 }//end of while
				 do{
				 	System.out.println("2. Update");
					System.out.println("3.display");
					System.out.println("Enter choice:");
					int choice1=inp.nextInt();
					switch(choice1){
						case 2:
							System.out.println("Enter position you want to update::");
							int n=inp.nextInt();
							System.out.println("Enter new element::");
							int num=inp.nextInt();
							s.up(num,n);
							break;
						case 3:
							System.out.println("Traversal::");
							s.display();
							break;
						default:
							System.out.println("Invalid input");
					}
					System.out.println("Do u want to continue linked list??::[Y/y]");
				choice=inp.next().charAt(0);
				}while(choice=='y'||choice=='Y');
			}
		}



