/*we need to rotate the elements of an array towards the left 
by the specified number of times. In the left rotation, each 
element of the array will be shifted to its left by one position 
and the first element of the array will be added to end of the list
*/

public class leftRotateElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int len=arr.length;
        int frst_ele=arr[0]; //preserving the frst element as it will get modified.
        for(int i=0;i<len-1;i++){ //using len-1 cuz arr[i+1] in the last will be arr[5] which is list index out of range.
            arr[i]=arr[i+1];
        }
        arr[len-1]=frst_ele; //finally modifying the last element as frst element.
        for(int i=0;i<len;i++)
            System.out.println(arr[i]);
    }
}
