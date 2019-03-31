//package LinkedList;

import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int value){
        data = value;
    }
}

public class CircularDoubly{
    Node first;
    Node last;

    public CircularDoubly(){
        first = null;
        last = null;
    }

void insertFirst(int value){
    Node node = new Node(value);

    if(first == null){
        first = last = node;
        last.next = first;
        first.prev = last;
    }

    else{
    node.next = first;
    first.prev = node;
    first = node;
    first.prev = last;
    last.next = first;
    }
}

void insertLast(int value){
    Node node = new Node(value);

    if(first == null){
        first = last = node;
        last.next = first;
        first.prev = last;
    }

    else{
        last.next = node;
        node.prev = last;
        last = node;
        last.next = first;
        first.prev = last;
    }
}

void deleteFirst(){
    if(first == null){
     System.out.println("Linked list is empty");
    }

    else if(first == last){
    System.out.println(first.data+" is deleting");
    first = last = null;
    }

    else{
        Node temp = first;
        first = first.next;
        first.prev = last;
        last.next = first;
        System.out.println(temp.data+" is deleting");
        temp = null;
    }
}

void deleteLast(){
    if(first == null){
    System.out.println("Linkedlist os empty");
    }

    else if(first == last){
    System.out.println(first.data+" is deleting");
    first = last = null;
    }

    else{
    Node temp = last.prev;
    System.out.println(last.data+" is deleting");
    last = temp;
    last.next = first;
    first.prev = last;
    }
}

void insertSpecific(int pos, int value){
    Node node = new Node(value);
    if(first == null){
        first = last = node;
        last.next = first;
        first.prev = last;
    }

    else{
        if(pos == 1){
            node.next = first;
            first.prev = node;
            first = node;
            first.prev = last;
            last.next = first;
        }

        else{
            Node temp = first;
            Node temp1 = first.next;
            int flag=0;
            for(int i = 1; i<pos-1; i++){

                if(temp1 != first){
                    temp = temp1;
                    temp1 = temp1.next;
                }

                else{

                    System.out.println("Beyond position");
                    flag=0;
                    break;
                }
            }

            if(flag == 0){
                temp.next = node;
                node.prev = temp;
                node.next = temp1;
                temp1.prev = node;
            }
        }
    }
}

void deleteSpecific(int pos){
    if(first == null){
        System.out.println("Linkedlist is empty");
    }
	else if(first==last){
		System.out.print(first.data+"deleted");
		first=last=null;
		}
   else if(pos ==1){
        Node temp = first;
        first = first.next;
        first.prev = last;
        last.next = first;
        System.out.println(temp.data+" is deleting");
        temp = null;
    }

    else{
    Node temp = first;
    Node temp1 = first.next;
    int flag = 0;
        for(int i=1;i<pos-1;i++){
            if(temp1 != first){
                temp = temp1;
                temp1 = temp1.next;
            }

            else{
                System.out.println("Postion Beyond");
                flag=0;
                break;
            }
        }
        if(flag ==0){
            temp.next = temp1.next;
            temp1.next.prev = temp;
            System.out.println(temp1.data+" is deleting");
            temp1 = null;
    }
}
}

void traversalFront() {
Node temp = first;
   if (first == null) {
       System.out.println("LinkedList is empty");
   }
   else {
       do{
          System.out.print(temp.data + "\t");
          temp = temp.next;
        }while(temp != first);
        System.out.println();
   }
}

void traversalBack(){
    Node temp = last;
    if (first == null) {
       System.out.println("LinkedList is empty");
   }
   else {
       do{
           System.out.print(temp.data+"\t");
           temp = temp.prev;
        }while(temp != last);
        System.out.println();
    }
}

 public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        CircularDoubly ls = new CircularDoubly();
        int value, pos;
        char y;
        do {
            System.out.println("Choice   MENU            ");
            System.out.println("  1 ->  INSERT FROM FIRST");
            System.out.println("  2 ->  INSERT FROM LAST");
            System.out.println("  3 ->  INSERT FROM SPECIFIC POSITION");
            System.out.println("  4 ->  DELETE FROM FIRST");
            System.out.println("  5 ->  DELETE FROM LAST");
            System.out.println("  6 ->  DELETE FROM SPECIFIC POSITION");
            System.out.println("  7 ->  TRAVERSAL FRONTWARD");
            System.out.println("  8 ->  TRAVERSAL BACKWARD");
            System.out.println("  9 -> 	EXIT");
            System.out.print("Choice [1 - 9]: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Insert Value: ");
                    value = in.nextInt();
                    ls.insertFirst(value);
                    break;
                case 2:
                    System.out.print("Insert Value: ");
                    value = in.nextInt();
                    ls.insertLast(value);
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    value = in.nextInt();
                    System.out.print("Enter Position: ");
                    pos = in.nextInt();
                    ls.insertSpecific(value, pos);
                    break;
                case 4:
                    ls.deleteFirst();
                    break;
                case 5:
                    ls.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter Position: ");
                    pos = in.nextInt();
                    ls.deleteSpecific(pos);
                    break;
                case 7:
                    System.out.println("Elements are:");
                    ls.traversalFront();
                    break;
                case 8:
                    System.out.println("Elements are:");
                    ls.traversalBack();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice !!!");
            }
            y = '*';
        } while (y != 'x');
    }
//}