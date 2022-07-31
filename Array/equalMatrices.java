//pgm to input two matrices and check whether they are equal

import java.util.Scanner;

public class equalMatrices {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //matrix 1
        System.out.print("Enter the no of rows for matrix 1: ");
        int row1=scn.nextInt();
        System.out.print("Enter the no of columns for matrix 1: ");
        int column1=scn.nextInt();
        int arr1[][]=new int[row1][column1];

        //matrix 2
        System.out.print("Enter the no of rows for matrix 2: ");
        int row2=scn.nextInt();
        System.out.print("Enter the no of columns for matrix 2: ");
        int column2=scn.nextInt();
        int arr2[][]=new int[row2][column2];

        //frst step : check if both matrices has same no of rows n columns
        if(row1==row2 && column1==column2){
            System.out.println("No of rows n columns of the 2 matrices are equal. \n Therefore, condition 1 satisfied");
            
            //getting elements of matrix 1
            System.out.println("Enter the elements of matrix 1 : ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++)
                    arr1[i][j]=scn.nextInt();
            }

            //getting elements of matrix 2
            System.out.println("Enter the elements of matrix 2 : ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++)
                    arr2[i][j]=scn.nextInt();
            }

            //printing elements of matrix 1
            System.out.println("Array1 is :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++)
                    System.out.print(arr1[i][j]+ " ");
                System.out.println();
            }

            //printing elements of matrix 2
            System.out.println("Array2 is :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++)
                    System.out.print(arr2[i][j]+ " ");
                System.out.println();
            }
            //checking if the elements are equal
            int count=0;
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++){
                    if(arr1[i][j]==arr2[i][j])
                        count++;
                }
            }
            
            if(count==row1*column1)
                System.out.println("The two matrices are equal");
            else
                System.out.println("The two matrices are not equal");

        }
        else{
            System.out.println("No of rows n columns of the 2 matrices are not equal.\n so its not a equal matrix ");
        }
        scn.close();

    }
}
