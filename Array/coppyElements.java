//pgm to copy elements from one array to another

public class coppyElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int new_arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }
        System.out.println("Elements of the new array after copying are : ");
        for(int i=0;i<new_arr.length;i++){
            System.out.println(new_arr[i]);
        }
    }
}
