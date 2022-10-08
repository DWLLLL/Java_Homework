import cn.com.my.Matrix;
import cn.com.my.MatrixLocation;

public class Test {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3, 4}, {5, 6, 7}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix5 = {{1, 2}, {-1, -3}};
        int[][] matrix11 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrixMultiplication = new Matrix();
        int[][] matrixMultiply = matrixMultiplication.matrixMultiply(matrix1, matrix2); //*
        matrixMultiplication.printMatrix(matrixMultiply);
        int[][] matrixAddition = matrixMultiplication.matrixAddition(matrix1, matrix11); //+
        matrixMultiplication.printMatrix(matrixAddition);
        int[][] matrixSubtraction = matrixMultiplication.matrixSubtraction(matrix1, matrix11); //-
        matrixMultiplication.printMatrix(matrixSubtraction);
        int[][] matrixTranspose = matrixMultiplication.matrixTranspose(matrix1); //转职
        matrixMultiplication.printMatrix(matrixTranspose);
        int a = matrixMultiplication.determinant(matrix5);
        System.out.println("矩阵的行列式的值是" + a);
        int[][] matrixAdjugate = matrixMultiplication.matrixAdjugate(matrix5);
        System.out.println("伴随矩阵是：");
        matrixMultiplication.printMatrix(matrixAdjugate);
        int[][] matrixInverse = matrixMultiplication.matrixInverse(matrix5);
        matrixMultiplication.printMatrix(matrixInverse);
        MatrixLocation matrixLocation = new MatrixLocation();
        double[][] z = {{1.2, 1.3, 2.4}, {2.1, 5.2, 6.2}, {1.3, 2.5, 6.1}};
        matrixLocation.location(z);
    }
}
