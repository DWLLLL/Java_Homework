package cn.com.my;

public class English {
    public void printEnglish() {
        char a='A';
        char b='a';
        int i=0;
        System.out.print("英文字母表为：");
        for (i = 0; i < 26; i++){
            System.out.printf("%c",a+i);
            System.out.printf("%c ",b+i);
        }
            System.out.println();
    }
}