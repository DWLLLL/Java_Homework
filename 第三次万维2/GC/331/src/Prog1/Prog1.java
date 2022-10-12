/*-------------------------------------------------------
【程序改错】
---------------------------------------------------------

题目：输入两个数，输出这两个数之间(包括两个数)所有不能被7
      整除的数（每10 个数据一行）

-------------------------------------------------------*/

import java.io.*;
public class Prog1
{
   public static void main(String args[]) throws IOException
   {
      int n,m,t,i,p;
      BufferedReader buf;
      buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("请输入一个整数:");
      n=Integer.parseInt(buf.readLine());  
      System.out.print("请输入另一个整数:"); 
      m=Integer.parseInt(buf.readLine());
 /***********FOUND***********/
      if(m<n)
       {t=m;
        m=n;
        n=t;
       }
 /***********FOUND***********/
      p=0;
      for(i=n;i<=m;i++)
 /***********FOUND***********/
        if(i%7!=0)
         {System.out.print(i+"\t"); 
          p++;
          if (p%10==0)
 /***********FOUND***********/
            System.out.println();
         }
     } 
 } 
