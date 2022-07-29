import java.util.Scanner;

public class StackApplication_factorial {
    final static int size = 30;
    long arr[] = new long[size];
    int top;
    StackApplication_factorial(){
        top=-1;
    }
    public void push(long item){
        top++;
        arr[top]=item;
    }
    public long pop(){
        long val = arr[top];
        top--;
        return val;
    }
    public long factorial(long n){
        if(n<=1)
            return 1;
        else{
            push(n*factorial(n-1));
        }
        return pop();

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StackApplication_factorial obj = new StackApplication_factorial();
        System.out.print("Enter a number : ");
        long n = scn.nextLong();
        if(n<=0)
            System.out.println("Number should be greater than 0");
        else{
            System.out.println("Factorial is : "+obj.factorial(n)); 
        }
        scn.close();
    }
}