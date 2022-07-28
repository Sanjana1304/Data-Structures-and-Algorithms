import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class StackImplementation_LL {
    Node top;
    StackImplementation_LL(){
        top=null;
    }
    public boolean isEmpty(){
        return (top==null);
    }

    public void push(int item){ //insertFirst function
        Node newNode = new Node();
        newNode.data = item;
        newNode.next=top;
        top=newNode;
        System.out.println("Item added");
    }

    public void pop(){ //deleteFirst function
        if(isEmpty()){
            System.out.println("Stack is empty, nothing to delete");
            return;
        }
        top=top.next;
        System.out.println("Item deleted!");
    }

    public void display(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void peek(){
        System.out.println("Peek of the stack is : "+top.data);
    }
    public void stackSize(){
        Node temp=top;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Size of the stack is: "+count);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StackImplementation_LL obj = new StackImplementation_LL();
        String choice = "y";
        while(choice.equals("y")){ 
            System.out.println("1. Insert \n 2. Delete \n 3. Peek \n 4. Display \n 5. Find Stack Size");
            System.out.print("Enter your choice : ");
            int ch = scn.nextInt();
            if(ch==1){
                System.out.print("Enter the element to be inserted : ");
                int item = scn.nextInt();
                obj.push(item);
            }
            else if(ch==2){
                obj.pop();
            }
            else if(ch==3){
                obj.peek();
            }
            else if(ch==4){
                obj.display();
            }
            else if(ch==5){
                obj.stackSize();
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
