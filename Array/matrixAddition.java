//Program to add two matrices

public class matrixAddition {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{10,20,30},{40,50,60},{70,80,90}};
        int row=arr1.length;
        int column=arr1[0].length;
        int arr3[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                arr3[i][j]=arr1[i][j]+arr2[i][j];
        }
        System.out.println("Resultant array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(arr3[i][j]+" ");
            System.out.println();
        }
    }
}
