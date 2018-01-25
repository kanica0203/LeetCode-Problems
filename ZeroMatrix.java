/*Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
  column are set to 0.*/

public class ZeroMatrix {
    public static void main(String []args){
        int matrix[][] = new int[2][3];
        int  k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]= k++;
            }
        }

        SetZeros(matrix);

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void SetZeros(int [][]matrix){
    boolean[] row = new boolean[matrix.length];
    boolean[] column= new boolean[matrix[0].length];

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                row[i]=true;
                column[j]=true;
            }
        }
    }

    for(int i=0;i<matrix.length;i++){
        if(row[i]){
            nullifyRow(matrix,i);
        }
    }

    for(int j=0;j<matrix[0].length;j++){
        if(column[j]){
            nullifyColumn(matrix,j);
        }
    }
    }

    public static void nullifyRow(int [][] matrix, int i){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=0;
        }
    }

    public static void nullifyColumn(int [][] matrix, int i){
        for(int j=0;j<matrix.length;j++){
            matrix[j][i]=0;
        }
    }


}
