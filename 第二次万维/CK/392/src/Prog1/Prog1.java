/*-------------------------------------------------------
��������ա�
---------------------------------------------------------

���ܣ�����һ��ѧ����Prog1������������ѧ�š���ѧ�ɼ�������
      �ɼ���������ɼ������ԣ��Լ���ʼ�������ԵĹ��췽����
      ����ѧ��ƽ���ɼ��ķ�������ʾѧ���ɼ����ķ���

-------------------------------------------------------*/

import java.awt.*;
public class Prog1
 {
   String name;
   long no;
   double math;
   double english;
   double computer; 
  /*******************SPACE*******************/
   Prog1(String s,long n,double m,double e,double c)
    {
     name=s;
     no=n;
     math=m;
     english=e;
     computer=c;
    }
  /*******************SPACE*******************/
   public double average() 
    { 
      return (math+english+computer)/3;
     }
  /*******************SPACE*******************/
   public void print()
    {
      System.out.println("����:"+name);
      System.out.println("ѧ��:"+no);
      System.out.println("��ѧ�ɼ�:"+math);
      System.out.println("����ɼ�:"+english);
      System.out.println("������ɼ�:"+computer);
    }
   public static void main (String args[]) 
     {
        Prog1 b=new Prog1("����",20030101,78,67,89);
        b.print();
  /*******************SPACE*******************/
        System.out.println("ƽ����:"+b.average());     
      }
}
