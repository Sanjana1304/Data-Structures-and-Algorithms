import java.util.Scanner;

class DLL_Node{
    int data;
    DLL_Node next;
    DLL_Node prev;
    DLL_Node(int data){
        this.data=data;
    }
}
public class DoublyLL {
    DLL_Node head;

    public boolean isEmpty(){
        return (head==null);
    }

    public int listSize(){
        DLL_Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void insertFirst(int item){
        DLL_Node newNode = new DLL_Node(item);
        newNode.prev = null;
        newNode.next = head;
        if(head!=null)
            head.prev = newNode;
        head=newNode;

    }

    public void insertLast(int item){
        DLL_Node newNode = new DLL_Node(item);
        newNode.next=null;
        DLL_Node temp=head;
        if(head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void insertAtPosition(int position,int item){
        int size = listSize();
        DLL_Node newNode = new DLL_Node(item);
        if(position>0 && position<=size){
            if(position==1)
                insertFirst(item);
            else if(position==size+1)
                insertLast(item);
            else{
                DLL_Node temp = head;
                for(int i=1;i<position && temp.next!=null;i++)
                    temp=temp.next;
                newNode.prev = temp.prev;
                temp.prev.next = newNode;
                newNode.next=temp;
                temp.prev = newNode;
            }
        }
        else{
            System.out.println("Invalid position. ");
        }
    }
    
    public void deleteFirst(){
        if(isEmpty())
            System.out.println("list is empty");
        else{
            if(head.next==null){
                head=head.next;
                return;
            }
            head=head.next;
            head.prev=null;

        }
    }

    public void deleteLast(){
        if(isEmpty())
            System.out.println("list s empty,nothing to delete");
        else{
            if(head.next==null)
                deleteFirst();
            else{
                DLL_Node temp = head;
                while(temp.next!=null)
                    temp=temp.next;
                temp.prev.next=null;
            }
            
                
        }
    }

    public void deleteAtPosition(int position){
        if(isEmpty())
            System.out.println("List is empty");
        else{
            int size=listSize();
            if(position>0 && position<=size){
                if(position==1)
                deleteFirst();
                else if(position==size)
                    deleteLast();
                else{
                    DLL_Node temp=head;
                    for(int i=1;i<position && temp.next!=null;i++)
                        temp=temp.next;
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
            else
                System.out.println("Invalid position");
            
        }
    }

    public void display(){
        if(isEmpty())
            System.out.println("List is empty");
        else{
            DLL_Node last = null;
            DLL_Node temp = head;
            System.out.println("Forward traversal : ");
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                last=temp;
                temp=temp.next;
            }
            System.out.println();
            System.out.println("Reverse traversal : ");
            while(last!=null){
                System.out.print(last.data+" <- ");
                last=last.prev;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DoublyLL obj = new DoublyLL();
        String choice="y";
        while(choice.equals("y")){
            System.out.println("1. Insert in the first \n 2. Insert in the Last \n 3. Insert at position \n 4. Delete first \n 5. Delete Last \n 6. Delete at position \n 7. Display \n");
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
                System.out.print("Enter the position : ");
                int position = scn.nextInt();
                obj.insertAtPosition(position, item);
            }
            else if(ch==4){
                obj.deleteFirst();
            }
            else if(ch==5){
                obj.deleteLast();
            }
            else if(ch==6){
                System.out.print("Enter the position : ");
                int position = scn.nextInt();
                obj.deleteAtPosition(position);
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
