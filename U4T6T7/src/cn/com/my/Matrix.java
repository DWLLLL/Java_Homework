package cn.com.my;

public class Matrix {
    public int[][] matrixMultiply(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            return null;
        }
        int[][] c = new int[a.length][b[0].length];
        System.out.println("正在进行矩阵乘法");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++)
                    c[i][j] += b[k][j] * a[i][k];
            }
        }
        return c;
    }

    public int[][] matrixAddition(int[][] a, int[][] b) {
        if (a[0].length != b[0].length || a.length != b.length) {
            return null;
        }
        int[][] c = new int[a.length][a[0].length];
        System.out.println("正在进行矩阵加法");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }

    public int[][] matrixSubtraction(int[][] a, int[][] b) {
        if (a[0].length != b[0].length || a.length != b.length) {
            return null;
        }
        int[][] c = new int[a.length][a[0].length];
        System.out.println("正在进行矩阵减法");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] - b[i][j];
        return c;
    }

    public int matrixMinor(int[][] a, int i, int j) { //代数余子式
        int[][] c = new int[a.length - 1][a.length - 1];
        int b = 0;
        if (a.length != a[0].length) {
            return 0;
        } else if (a.length == 1) {
            return 0;
        } else {
            for (int i1 = 0; i1 < a.length; i1++) {
                for (int j1 = 0, j2 = 0; j1 < a.length - 1; j1++, j2++) {
                    for (int k1 = 0, k2 = 0; k1 < a[0].length - 1; k1++, k2++) {
                        if (j2 == i)
                            j2++;
                        if (k2 == j)
                            k2++;
                        c[j1][k1] = a[j2][k2];
                    }
                }
                b = determinant(c);
            }
            if ((i + j) % 2 == 1)
                return -b;
            else
                return b;
        }
    }

    public int determinant(int[][] a) { //方阵的行列式
        int[] b = new int[a.length];
        int[][] c = new int[a.length - 1][a[0].length - 1];
        int sum = 0;
        if (a.length != a[0].length) {
            return 0;
        } else if (a.length == 1) {
            return a[0][0];
        } else if (a.length == 2) {
            return (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j1 = 0, j2 = 1; j1 < a.length - 1; j1++, j2++) {
                    for (int k1 = 0, k2 = 0; k1 < a[0].length - 1; k1++, k2++) {
                        if (k2 == i)
                            k2++;
                        c[j1][k1] = a[j2][k2];
                    }
                }
                b[i] = a[0][i] * determinant(c);
                if (i % 2 == 1)
                    sum -= b[i];
                else
                    sum += b[i];
            }
            return sum;
        }
    }

    public int[][] matrixAdjugate(int[][] a) {  //仅仅方阵时可以正常使用  //伴随矩阵
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = matrixMinor(a, j, i);
            }
        }
        return c;
    }


    public int[][] matrixInverse(int[][] a) { //矩阵的逆
        if (a.length != a[0].length)
            return null;
        System.out.println("正在进行矩阵逆运算");
        int[][] c = new int[a.length][a[0].length];
        int[][] d = new int[a.length][a[0].length];//伴随矩阵
        int b = determinant(a); //行列式的值
        d = matrixAdjugate(a);
        if (b == 0) {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[0].length; j++) {
                    c[i][j] = 0;
                }
            }
        } else {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[0].length; j++) {
                    c[i][j] = d[i][j] / b;
                }
            }
        }

        return c;
    }

    public int[][] matrixTranspose(int[][] a) { //矩阵转置
        int[][] c = new int[a[0].length][a.length];
        System.out.println("正在进行矩阵转置");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[j][i];
            }
        }
        return c;
    }

    public void printMatrix(int[][] c) {
        if (c != null) {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    System.out.printf("%d ", c[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("无效");
        }
        System.out.println();
    }
}
