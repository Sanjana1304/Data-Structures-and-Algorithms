import java.util.Scanner;

public class QueueImplementation_Array {
    int[] arr;
    int front,rear,size;
    QueueImplementation_Array(int size){
        this.size=size;
        front=-1;
        rear=-1;
        arr = new int[size];
    }

    public boolean isEmpty(){
        if(front==-1 || rear==front-1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(rear==size-1)
            return true;
        return false;
    }

    public void enqueue(int item){
        if(isFull())
            System.out.println("Queue is full");
        else{
            if(front==-1)
                front++;
            rear++;
            arr[rear]=item;
        }
    }

    public void dequeue(){
        if(isEmpty())
            System.out.println("Queue is empty, nothing to dlete");
        else{
            System.out.println("Deleted element is: "+arr[front]);
            front++;
        }
    }

    public void display(){
        if(isEmpty())
            System.out.println("Queue is empty, nothing to display");
        else{
            System.out.println("Queue is : ");
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public void peek(){
        if(isEmpty())
            System.out.println("Nothing to peek");
        else{
            System.out.println("Peek of the queue is : "+arr[front]);
        }
    }

    public int QueueSize(){
        if(front==-1)
            return 0;
        else{
            int val = (rear-front)+1;
            return val;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int n = scn.nextInt();
        QueueImplementation_Array obj = new QueueImplementation_Array(n);
        String choice = "y";
        while(choice.equals("y")){
            System.out.println("1. Insert \n 2. Delete \n 3. Peek \n 4. Display \n 5. Find Queue Size");
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
                obj.peek();
            }
            else if(ch==4){
                obj.display();
            }
            else if(ch==5){
                int ans = obj.QueueSize();
                System.out.println("Size of the stack is : "+ans);
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
