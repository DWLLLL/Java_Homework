/*-------------------------------------------------------
������Ĵ�
---------------------------------------------------------

��Ŀ���Ӽ���������һ����Ȼ��m����m��������ʾ��m����������
      ��֮�͡���ʾ��������������Ϊm��(m+1)-1

-------------------------------------------------------*/

import java.io.*;
public class Prog1
{
   public static void main(String args[]) throws IOException
    {
      int m,t,p,s;
      BufferedReader buf;
      buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("������һ����Ȼ��:");
      m=Integer.parseInt(buf.readLine());  
 /***********FOUND***********/
      s=0;
      p=m*(m+1)-1;
      System.out.print(m+"��"+m+"��"+m+"="+p);
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
