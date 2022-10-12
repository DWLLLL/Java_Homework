/*-------------------------------------------------------
【程序改错】
---------------------------------------------------------

题目：从键盘上输入一个自然数m，将m的立方表示成m个连续的奇
      数之和。提示：其中最大的奇数为m×(m+1)-1

-------------------------------------------------------*/

import java.io.*;
public class Prog1
{
   public static void main(String args[]) throws IOException
    {
      int m,t,p,s;
      BufferedReader buf;
      buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("请输入一个自然数:");
      m=Integer.parseInt(buf.readLine());  
 /***********FOUND***********/
      s=0;
      p=m*(m+1)-1;
      System.out.print(m+"×"+m+"×"+m+"="+p);
 /***********FOUND***********/
      t=m;
      do
       {
 /***********FOUND***********/
        s=s+p;
        t--;
        p=p-2;
        System.out.print("+"+p);
 /***********FOUND***********/
       }while(s==m*m*m);
       
     System.out.println("="+s);
   } 
} 
