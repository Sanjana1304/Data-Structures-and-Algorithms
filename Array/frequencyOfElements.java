//pgm to find frequency of elements in an array.

import java.util.Arrays;

public class frequencyOfElements {
    public static void main(String[] args) {
        int arr[]={1,1,2,4,5,6,6,6,8};
        boolean visited[]=new boolean[arr.length];
        Arrays.fill(visited, false);
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true)
                continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                    visited[j]=true;
                }
            }
            System.out.println("No of "+arr[i]+"'s are : "+count);
        }
    }
}
