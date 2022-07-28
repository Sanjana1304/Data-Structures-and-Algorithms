import java.util.Scanner;

class circ_Node{
    int data;
    circ_Node next;
}
public class Circular_SLL {
    circ_Node head;
    circ_Node tail;
    Circular_SLL(){
        head=null;
        tail=null;
    }

    public boolean isEmpty(){
        return(head==null);
    }

    public void insertNode(int item){
        circ_Node newNode = new circ_Node();
        newNode.data= item;
        if(isEmpty())
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
        tail.next=head;
    }

    public void deleteNode(int item){
        boolean flag = false;
        if(isEmpty()){
            System.out.println("Nthng to delete");
            return;
        }
        circ_Node temp=head;
        do{
            circ_Node trav= temp.next;
            if(trav.data==item){
                if(head==tail){
                    head=null;
                    tail=null;
                }
                else{
                    temp.next=trav.next;
                    if(head==trav)
                        head=head.next;
                    if(tail==trav)
                        tail=temp;
                }
                flag = true;
                break;
            }
            temp = trav;
        }
        while(temp!=head);
        if(flag==false)
            System.out.println("Data not present");
            
    }

    public void searchElement(int item){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        circ_Node temp = head;
        do{
            if(temp.data==item){
                System.out.println("Item found!");
                break;
            }
            else{
                temp=temp.next;
            }
        }
        while(temp!=head);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        System.out.println("List is : ");
        circ_Node temp = head;
        do{
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        Circular_SLL obj = new Circular_SLL();
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("1. Insert \n2. Delete\n3. Search\n4.Display\n5.Exit");
            System.out.print("Enter your choice : ");
            int ch = scn.nextInt();
            switch(ch){
                case 1: 
                System.out.print("Enter the item to be added: ");
                int item = scn.nextInt();
                obj.insertNode(item);
                break;

                case 2: 
                System.out.print("Enter the item to be deleted: ");
                int delitem = scn.nextInt();
                obj.deleteNode(delitem);
                break;

                case 3: 
                System.out.print("Enter the item to be searched: ");
                int searchitem = scn.nextInt();
                obj.searchElement(searchitem);
                break;

                case 4: 
                obj.display();
                break;

                case 5:
                    return;
            }
            //scn.close();
        }
        
    }
}
