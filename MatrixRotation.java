public class MatrixRotation {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = k++;
            }
        }
        System.out.println("Original matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        Rotate(matrix);
        System.out.println("matrix after rotation");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void Rotate(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length != matrix.length){
            System.out.println("rotation not possible");
        }
        int n=matrix.length;
        for(int layer=0;layer<n/2;layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first;i < last;i++){
                int offset = i- first;
                //storing top
                int top = matrix[first][i];
                //bottom left -> top
                matrix[first][i] = matrix[last - offset][first];
                //bottom right -> bottom left
                matrix[last - offset][first] = matrix[last][last-offset];
                //top right -> bottom right
                matrix[last][last-offset]= matrix[i][last];
                //top left-> top right
                matrix[i][last] = top;
            }
        }
    }
}