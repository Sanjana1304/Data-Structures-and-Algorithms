import java.util.Scanner;

class QNode{
    int data;
    QNode next;
}
public class QueueImplementation_LL {
    QNode front;
    QNode rear;
    QueueImplementation_LL(){
        front=null;
        rear=null; //rear is like head here
    }
    public boolean isEmpty(){
        if(front==null)
            return true;
        return false;
    }
    public void enqueue(int item){ //insertFirst
        QNode oldRear = rear;
        rear = new QNode();
        rear.data = item;
        rear.next = null;
        if(isEmpty())
            front=rear;
        else
            oldRear.next=rear;
        System.out.println("Item added!");

    }
    public void dequeue(){ //deleteLast
        if(isEmpty()){
            System.out.println("Queue is empty");
            rear=null;
            return;
        }
        else{
            int data = front.data;
            System.out.println(data+" deleted");
            front=front.next;
        }
    }

    public void display(){
        if(isEmpty())
            System.out.println("queue is empty, nothing to show");
        else{
            QNode temp=front;
            System.out.println("Queue is : ");
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        QueueImplementation_LL obj = new QueueImplementation_LL();
        String choice = "y";
        while(choice.equals("y")){ 
            System.out.println("1. Insert \n 2. Delete \n 3. Display \n");
            System.out.print("Enter your choice : ");
            int ch = scn.nextInt();
            if(ch==1){
                System.out.print("Enter the element to be inserted : ");
                int item = scn.nextInt();
                obj.enqueue(item);
            }
            else if(ch==2){
                obj.dequeue();
            }
            else if(ch==3){
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
