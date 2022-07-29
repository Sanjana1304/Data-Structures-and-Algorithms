//To reverse the array using stack methods
import java.util.Scanner;

public class StackApplication_ReverseArray {
    int[] arr;
    int top,size;
    StackApplication_ReverseArray(int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    public void push(int item){
        top++;
        arr[top]=item;
    }

    public int pop(){
        int val = arr[top];
        top--;
        return val;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        int mainArr[] =new int[n];
        
        StackApplication_ReverseArray obj = new StackApplication_ReverseArray(n);
        for(int i=0;i<n;i++){
            System.out.printf("Enter mainArr[%d] : ",i);
            mainArr[i]=scn.nextInt();
        }
        System.out.print("Array before reversing : ");
        for(int i=0;i<n;i++)
            System.out.print(mainArr[i]+"  ");
        System.out.println();

        for(int i=0;i<n;i++)
            obj.push(mainArr[i]);
        
        for(int i=0;i<n;i++)
            mainArr[i] = obj.pop();
        
        System.out.print("Array after reversing : ");
        for(int i=0;i<n;i++)
            System.out.print(mainArr[i]+"  ");
        System.out.println();
        scn.close();
    }
}

