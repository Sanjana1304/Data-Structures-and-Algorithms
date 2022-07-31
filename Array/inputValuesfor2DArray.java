//pgm to input array elements from the user and display.

import java.util.Scanner;

public class inputValuesfor2DArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the no. of rows : ");
        int row=scn.nextInt();
        System.out.print("Enter the no. of columns : ");
        int column=scn.nextInt();

        int arr[][]=new int[row][column];

        System.out.println("Enter the elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                arr[i][j]=scn.nextInt();
        }
        System.out.println("Array is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
        scn.close();
        
    }
}
