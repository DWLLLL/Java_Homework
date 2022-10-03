package cn.com.my;

public class CountNumber {
    public int[] count(String s) {
        int[] a = new int[10];
        for (int i=0;i<10;i++) {
            a[i] = 0;
        }
        char[] b=s.toCharArray();
        for (int i = 0; i<10; i++) {
            for(int j=0;j<s.length();j++){
                if ( (int)b[j] == i+48) {
                    a[i]++;
                }
            }
        }
        for (int i=0;i<10;i++)
            System.out.println("count["+i+"]:"+a[i]);
        return a;
    }
}
