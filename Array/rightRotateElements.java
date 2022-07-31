//Program to right rotate the elements of an array

public class rightRotateElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int len=arr.length;
        int last_ele=arr[len-1]; //preserving the last element as it will get modified
        for(int i=len-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last_ele;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}
