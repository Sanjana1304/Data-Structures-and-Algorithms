//Program to sort the elements of an array in descending order

public class sortDescending {
    public static void main(String[] args) {
        int arr[]={3,71,9,43,2,10};
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("In descending order is : ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
