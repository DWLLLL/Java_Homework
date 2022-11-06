package com.cn.my;

public class TongJi {
    public void tj(int[] a, int n) {
        int t = 0;
        int b = 0;
        int[] cishu = new int[10];
        for(int i = 0; i <=9; i++){
            cishu[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] <= 9) {
                switch (a[i]) {
                    case 0:
                        cishu[0]++;
                        break;
                    case 1:
                        cishu[1]++;
                        break;
                    case 2:
                        cishu[2]++;
                        break;
                    case 3:
                        cishu[3]++;
                        break;
                    case 4:
                        cishu[4]++;
                        break;
                    case 5:
                        cishu[5]++;
                        break;
                    case 6:
                        cishu[6]++;
                        break;
                    case 7:
                        cishu[7]++;
                        break;
                    case 8:
                        cishu[8]++;
                        break;
                    case 9:
                        cishu[9]++;
                        break;
                }
            } else {
                while (a[i] > 0) {
                    b = a[i] % 10;
                    switch (b) {
                        case 0:
                            cishu[0]++;
                            break;
                        case 1:
                            cishu[1]++;
                            break;
                        case 2:
                            cishu[2]++;
                            break;
                        case 3:
                            cishu[3]++;
                            break;
                        case 4:
                            cishu[4]++;
                            break;
                        case 5:
                            cishu[5]++;
                            break;
                        case 6:
                            cishu[6]++;
                            break;
                        case 7:
                            cishu[7]++;
                            break;
                        case 8:
                            cishu[8]++;
                            break;
                        case 9:
                            cishu[9]++;
                            break;

                    }
                    a[i] = a[i] / 10;
                }
            }
        }
        for(int i =0;i<=9;i++)
            System.out.println(cishu[i]+"次"+i);
    }
}