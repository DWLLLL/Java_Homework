/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

功能：定义一个学生类Prog1，包括姓名、学号、数学成绩、外语
      成绩、计算机成绩等属性，以及初始化各属性的构造方法、
      计算学生平均成绩的方法、显示学生成绩单的方法

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
      System.out.println("姓名:"+name);
      System.out.println("学号:"+no);
      System.out.println("数学成绩:"+math);
      System.out.println("外语成绩:"+english);
      System.out.println("计算机成绩:"+computer);
    }
   public static void main (String args[]) 
     {
        Prog1 b=new Prog1("李利",20030101,78,67,89);
        b.print();
  /*******************SPACE*******************/
        System.out.println("平均分:"+b.average());     
      }
}
