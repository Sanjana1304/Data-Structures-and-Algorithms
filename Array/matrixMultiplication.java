public class matrixMultiplication {
    public static void main(String[] args) {
        int A[][]={{4,5,7},{2,1,2}};
        int B[][]={{2,3},{8,9},{1,1}};
        int m1=A.length;
        int n1=A[0].length;
        int m2=B.length;
        int n2=B[0].length;
        if(m2==n1){
            int C[][]=new int[m1][n2];
            for(int i=0;i<m1;i++){
                for(int j=0;j<n2;j++){
                    C[i][j]=0;
                    for(int k=0;k<m2;k++){
                        C[i][j]+=A[i][k]*B[k][j];
                    }
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    }
}
