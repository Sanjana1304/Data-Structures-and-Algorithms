//Program to find Second Smallest Number in an Array

public class secondSmallestNum {
    public static void main(String[] args) {
        int arr[]={23,65,12,98,4,88};
        int len=arr.length;
        int min=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        int sec_min=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]<sec_min && arr[i]>min)
                sec_min=arr[i];
        }
        System.out.println("Second smallest number : "+sec_min);
    }
}
