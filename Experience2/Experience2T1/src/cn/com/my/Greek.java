package cn.com.my;

public class Greek extends English{
    public void printGreek(){
        char a='α';
        int i=0;
        System.out.print("希腊字母表为：");
        for(i=0;i<25;i++){
            System.out.printf("%c ",a+i);
        }
        System.out.println();
    }
}
