import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class SinglyLL {
    Node head;
    SinglyLL(){
        head=null;
    }
    public boolean isEmpty(){
        return(head==null);
    }

    public void insertFirst(int item){
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int item){
        if(isEmpty()){
            insertFirst(item);
            return;
        }
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;
        Node temp = head; // to make the second last element's link to newnode
        while(temp.next!=null)
            temp=temp.next;
        temp.next = newNode;
    }

    public void insertAfterData(int dataAfter, int item){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node();
        
        Node temp=head;
        while(temp.next!=null && temp.data!=dataAfter){
            temp=temp.next;
        }
        if(temp.next!=null){
            newNode.data = item;
            newNode.next = temp.next;
            temp.next=newNode;
        }
        else if(temp.data!=dataAfter)
            System.out.println("The dataAfter value given is not there in the linked list");
        else{
            newNode.data=item;
            newNode.next=null;
            temp.next=newNode;
        }
    }

    public void deleteFirst(){
        if(isEmpty())
            System.out.println("Nothing to delete");
        else{
            System.out.println("Deleted data is : "+head.data);
            head=head.next;
        }
    }

    public void deleteLast(){
        if(isEmpty())
            System.out.println("Nothing to delete");
        else{
            if(head.next==null){
                head=null;
                return;
            }
            Node prev=null;
            Node temp=head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            
        }
    }

    public void deleteAfterData(int dataAfter){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.data!=dataAfter){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
        else if(temp.data!=dataAfter)
            System.out.println("List does not contain the given value");
        else{
            System.out.println("Deletion not possible, this is the last node");
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty,nothing to display");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SinglyLL obj = new SinglyLL();
        String choice = "y";
        while(choice.equals("y")){
            System.out.println("1. Insert in the first \n 2. Insert in the Last \n 3. Insert after data \n 4. Delete first \n 5. Delete Last \n 6. Delete after Data \n 7. Display \n");
            System.out.print("Enter your choice : ");
            int ch = scn.nextInt();
            if(ch==1){
                System.out.print("Enter the element to be inserted : ");
                int item = scn.nextInt();
                obj.insertFirst(item);
            }
            else if(ch==2){
                System.out.print("Enter the element to be inserted : ");
                int item = scn.nextInt();
                obj.insertLast(item);
            }
            else if(ch==3){
                System.out.print("Enter the element to be inserted : ");
                int item = scn.nextInt();
                System.out.print("Enter the element after which it should be inserted : ");
                int dataAfter = scn.nextInt();
                obj.insertAfterData(dataAfter, item);
            }
            else if(ch==4){
                obj.deleteFirst();
            }
            else if(ch==5){
                obj.deleteLast();
            }
            else if(ch==6){
                System.out.print("Enter the element after which it should be deleted : ");
                int dataAfter = scn.nextInt();
                obj.deleteAfterData(dataAfter);
            }
            else if(ch==7){
                obj.display();
            }
            else{
                System.out.println("Enter the right choice");
            }
            System.out.print("Do you want to continue? : ");
            choice = scn.next();
        }
        scn.close();

    }
}
