import java.util.Scanner;

public class StackImplementation_Array{
    int[] arr;
    int size,top;
    public StackImplementation_Array(int size){
        top=-1;
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(top==size-1)
            return true;
        return false;
    }

    public int StackSize(){
        int res = top+1;
        return res;
    }

    public void push(int data){
        if(isFull())
            System.out.println("Stack is full, elements cannot be added");
        else{
            top++;
            arr[top]=data;
        }
    }

    public void pop(){
        if(isEmpty())
            System.out.println("Stack is empty, nothing to pop");
        else{
            System.out.println("Deleted element is: "+arr[top]);
            top--;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty,nothing to display");
            return;
        }
        System.out.println("Elemets of the stack are : ");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void peek(){
        if(isEmpty())
            System.out.println("Stack is empty,nothing to peek");
        else{
            System.out.print("Peek of the stack is: "+arr[top]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the stack : ");
        int n = scn.nextInt();
        StackImplementation_Array obj = new StackImplementation_Array(n);
        String choice = "yes";
        while(choice.equals("yes")){ 
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
                int ans = obj.StackSize();
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