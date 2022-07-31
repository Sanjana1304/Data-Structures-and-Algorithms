//pgm to print the elements of a 2d array

public class twoD_Array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        int row=arr.length;
        int column=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
