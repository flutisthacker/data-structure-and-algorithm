  import java.util.*;
public class Update {
    public LL first;
    Update(){
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
     public void update(int num,int pos){

          LL temp;
          temp=first;
          int count=1;

         if(temp!=null){
             while(count==pos){
                 LL temp1=temp;
                 temp.data=num;
                 temp.next=temp1.next;
                 temp1=null;
                 break;
             }
             temp=temp.next;
         }
	 }
         public void display(){
		          LL temp2=first;
		          System.out.println("\n");
		          while(temp2!=null){
		              System.out.println(temp2.data+"->");
		              temp2=temp2.next;
		          }
		          System.out.println("null\n");

     }
   public static void main(String[] args) {
           Scanner inp=new Scanner(System.in);
        	Update s=new Update();
        	System.out.println("***MENU***");
        	System.out.println("Press 1 to create linked list");
        	System.out.println("Press 2 to search the position");
        	System.out.println("Press 3 to display");
        	System.out.println("Enter your choice:");
        	int choice=inp.next().charAt(0);
        	while(true){
        	if(choice==1){

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
	                	choice=inp.nextInt();
	             }//end of else
	 }//end of while
	          do{

	          	System.out.println("***MENU***");
			        	System.out.println("Press 1 to create linked list");
			        	System.out.println("Press 2 to update the element using the position");
			        	System.out.println("Press 3 to display");
			        	System.out.println("Enter your choice:");
        	int choice1=inp.nextInt();



         	switch(choice1){
         	case 2:
         		System.out.println("Enter position of element to update the element::");
			 int n=inp.nextInt();
                         System.out.println("Enter the new element to insert in new position");
                         int num=inp.nextInt();
			s.update(num,n);
         		break;
         		case 3:
         		System.out.println("Displaying elements::");
         		s.display();
         		break;
         	default:
         		System.out.println("Wrong choice!!");
        	}
        	System.out.println("Do u want to continue with Linked list searching position operation:");
		            choice=inp.next().charAt(0);
        }while(choice=='Y'||choice=='y');
       }
    }






