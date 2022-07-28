import java.util.Scanner;

public class CircularQueueImpl_Array {
    int[] arr;
    int front,rear;
    int size;
    CircularQueueImpl_Array(int size){
        this.size = size;
        front=-1;
        rear=-1;
        arr = new int[size];
    }

    public boolean isEmpty(){
        if(front==-1 && rear==-1)
            return true;
        return false;
    }
    public boolean isFull(){
        if(front==0 && rear==size-1 || front==rear+1)
            return true;
        return false;
    }
    public void enqueue(int item){
        if(isFull())
            System.out.println("Queue is full,item cannot be added");
        else{
            if(front==-1)
                front=0;
            rear++;
            arr[rear]=item;
            System.out.println(item+" added");
        }
    }

    public void dequeue(){
        if(isEmpty())
            System.out.println("queue is empty,nothing to dlete");
        else{
            System.out.println("Deleted element is: "+arr[front]);
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else
                front=(front+1)%size;
        }
    }
    public void display(){
        if(isEmpty())
            System.out.println("queue is empty,nothing to show");
        else{
            if(front<=rear){
                for(int i=front;i<=rear;i++)
                    System.out.println(arr[i]+" ");
            }
            else if(front>rear){
                for(int i=front;i<size;i++)
                    System.out.println(arr[i]+" ");
                for(int i=0;i<=rear;i++)
                    System.out.println(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the queue : ");
        int n = scn.nextInt();
        CircularQueueImpl_Array obj = new CircularQueueImpl_Array(n);
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
