/*-------------------------------------------------------
【程序改错】
---------------------------------------------------------

题目：从键盘上输入一个正整数，计算该数的各位数字之和

-------------------------------------------------------*/

import java.io.*;
/***********FOUND***********/
public class Prog1
{
   public static void main(String args[]) throws IOException
    {
      int m,s;
      BufferedReader buf;
      buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("请输入一个自然数:");
      m=Integer.parseInt(buf.readLine()); 
 /***********FOUND***********/
      s=0;
      while(m!=0)
       {
 /***********FOUND***********/
        s=s+m%10;
 /***********FOUND***********/
        m=m/10;
       }
       System.out.print("其各位数字之和为："+s); 
   } 
}
