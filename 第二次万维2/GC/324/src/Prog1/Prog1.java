/*-------------------------------------------------------
������Ĵ�
---------------------------------------------------------

��Ŀ��������������һ���������������ӣ���5��һ�е���ʽ���
      ���������������֮�͡������һ������a�ܱ�����b������
       ��b��a�����ӡ���

-------------------------------------------------------*/

import java.io.*;
public class Prog1
{
   public static void main(String args[]) throws IOException
    { 
     int n,cn=0,sum=0;
     BufferedReader buf;
     buf=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("������һ��������");
     n=Integer.parseInt(buf.readLine());        
     System.out.println(n+"�������������£�");
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
      System.out.println("�������Ӻ�ֵ�ǣ�"+sum);		
      
   }
}

