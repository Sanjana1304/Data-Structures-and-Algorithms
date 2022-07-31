//remove duplicate elements from an array

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[]={10,20,20,30,30,40,50,50};
        int new_arr[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                new_arr[j++]=arr[i];
            }
        }
        new_arr[j++]=arr[arr.length-1];
        for(int i=0;i<new_arr.length;i++)
            System.out.println(new_arr[i]);
    }
}
