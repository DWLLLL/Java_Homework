/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

本题是判断一个字符串"Tom"是否在另外一个字符串"I am Tom,I am from China"中出现。

-------------------------------------------------------*/

public class Prog1{
public static void main(String[] args) {
/***********SPACE***********/
        String str1,str2;
        str1="I am Tom, I am from China.";
        str2="Tom";
/***********SPACE***********/
        int i=str1.index0f(str2);
/***********SPACE***********/
        if(i!=-1)
                System.out.println("\""+str2+"\" is in the string:\""+str1+"\"");
        else
                System.out.println("\""+str2+"\" is not in the string:\""+str1+"\"");
}
}

