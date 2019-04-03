import java.util.*;

public class Search{
    public LL first;
    Search(){
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
     public void search(int element){
          LL temp;
          temp=first;
          int count=1;
          int flag=0;
          while(temp!=null){
              if(temp.data==element){
                 System.out.println("Position is:"+count);
                 flag=1;
            }//end of if
              temp=temp.next;
              count++;
          }//end of while
          if(flag==0){
          	System.out.println("The element that you entered is not available in lined list");
         }

   }//end of search
   public static void main(String[] args) {
           Scanner inp=new Scanner(System.in);
        	Search s=new Search();
        	System.out.println("***MENU***");
        	System.out.println("Press 1 to create linked list");
        	System.out.println("Press 2 to search the position");
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
			        	System.out.println("Press 2 to search the position");
			        	System.out.println("Enter your choice:");
        	int choice1=inp.nextInt();



         	switch(choice1){
         	case 2:
         		System.out.println("Enter elements to search and display its position::");
			 int n=inp.nextInt();
			s.search(n);
         		break;
         	default:
         		System.out.println("Wrong choice!!");
        	}
        	System.out.println("Do u want to continue with Linked list searching position operation:");
		            choice=inp.next().charAt(0);
        }while(choice=='Y'||choice=='y');
       }
    }




