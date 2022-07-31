//Program to print the duplicate elements of an array

public class duplicateElements {
    public static void main(String[] args) {
        int arr[]={1,9,9,2,1,7,2,5,6,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
