//Program to print the elements of an array in reverse order

public class reverseOrder {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 2, 7, 8, 8, 3};
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
