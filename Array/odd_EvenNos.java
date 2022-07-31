//Program to print Odd and Even Numbers from an Array

public class odd_EvenNos {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int len=arr.length;
        System.out.print("Even nos are : ");
        for(int i=0;i<len;i++){
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Odd nos are : ");
        for(int i=0;i<len;i++){
            if(arr[i]%2!=0)
                System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
