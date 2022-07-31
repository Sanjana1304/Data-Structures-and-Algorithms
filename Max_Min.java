//Program to print the largest and smallest element in an array

public class Max_Min {
    public static void main(String[] args) {
        int arr[]={34,56,12,98,25};
        int len=arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Minimum element is : "+min);
        System.out.println("Maximum element is : "+max);
    }
}
