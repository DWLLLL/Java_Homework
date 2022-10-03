/*-------------------------------------------------------
【程序改错】
---------------------------------------------------------

题目：求键盘上输入的一个整数的所有因子，以5个一行的形式输出
      ，并求出所有因子之和。（如果一个整数a能被整数b整除，
       则b是a的因子。）

-------------------------------------------------------*/

import java.io.*;
public class Prog1
{
   public static void main(String args[]) throws IOException
    { 
     int n,cn=0,sum=0;
     BufferedReader buf;
     buf=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("请输入一个整数：");
     n=Integer.parseInt(buf.readLine());        
     System.out.println(n+"的所有因子如下：");
/***********FOUND***********/
     for(int k=1;k<=n;k++)
       {
/***********FOUND***********/
         if(n%k==0)
 	 {System.out.print(k+"  ");
          cn++;
/***********FOUND***********/
          if (cn%5==0)
            System.out.println();
/***********FOUND***********/
          sum+=k;}
        }
      System.out.println();
      System.out.println("所有因子和值是："+sum);		
      
   }
}

