import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int flag=0;
        int mid=-1;
        System.out.print("Enter the size of array : ");
        int n= scn.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements for the array : ");
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        System.out.print("Enter key element : ");
        int key = scn.nextInt();
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Elements in array after sorting are : ");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        
            int low=0;
            int high=n-1;
            mid = (low+high)/2;
            while(low<=high){
                if(key<a[mid])
                    high = mid-1;
                else if(key>a[mid])
                    low = mid+1;
                else{
                    flag=1;
                    break;
                }
                mid = (low+high)/2;
            }

            if(flag==1)
                System.out.println("The element is found at index : "+mid);
            else
                System.out.println("Element not found");
        scn.close();
    }
}
