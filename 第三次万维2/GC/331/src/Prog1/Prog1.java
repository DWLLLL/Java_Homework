/*-------------------------------------------------------
������Ĵ�
---------------------------------------------------------

��Ŀ�������������������������֮��(����������)���в��ܱ�7
      ����������ÿ10 ������һ�У�

-------------------------------------------------------*/

import java.io.*;
public class Prog1
{
   public static void main(String args[]) throws IOException
   {
      int n,m,t,i,p;
      BufferedReader buf;
      buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("������һ������:");
      n=Integer.parseInt(buf.readLine());  
      System.out.print("��������һ������:"); 
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
