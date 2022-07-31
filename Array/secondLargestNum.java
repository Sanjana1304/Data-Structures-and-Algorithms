// Program to find Second Largest Number in an Array

public class secondLargestNum {
    public static void main(String[] args) {
        int arr[]={3,6,1,8,2};
        int len=arr.length;

        //frst we'll find the largest num
        int max=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        //now we'll find the 2nd largest num
        int second_max=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>second_max){
                if(arr[i]<max)
                    second_max=arr[i];
            }
        }
        System.out.println("2nd Largest number is : "+second_max);
    }
}
