/*-------------------------------------------------------
������Ĵ�
---------------------------------------------------------

��Ŀ���Ӽ���������һ������������������ĸ�λ����֮��

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
      System.out.print("������һ����Ȼ��:");
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
       System.out.print("���λ����֮��Ϊ��"+s); 
   } 
}
