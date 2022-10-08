package cn.com.my;

public class MatrixLocation {
    int row;
    int column;
    double maxValue = 0;

    public void location(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("最大值是：" + maxValue);
        System.out.println("位置是：" + "第" + row + "行" + "第" + column + "列");
    }

}
