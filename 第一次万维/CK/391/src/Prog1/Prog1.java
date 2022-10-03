/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

功能：定义一个圆的类Prog1，包括圆心坐标（是Point类的对象，
      Point类是java.awt包中的类，具有x和y两个属性）、半径
      属性，以及初始化圆的属性的构造方法、取得圆心的方法、
      半径的方法，计算圆面积的方法

-------------------------------------------------------*/

import java.awt.*;
public class Prog1 
 {
  /*******************SPACE*******************/
   Point center=new Point();
   double radius;
  /*******************SPACE*******************/
   public Prog1(int x1,int y1,double r)
    {
     center.x=x1;
     center.y=y1;
     radius=r;
    }
   public Point getCenter() 
    { 
      return center;
     }
   public double getRadius() 
    { 
  /*******************SPACE*******************/
      return radius;
     }
  
   public double calArea()
     {
	return 3.14*radius*radius;
     }
   public static void main (String args[]) 
     {
        Prog1 b=new Prog1(30,40,10);
        System.out.println("圆心为：("+b.getCenter().x+","+b.getCenter().y+")");
        System.out.println("半径是："+b.getRadius());
  /*******************SPACE*******************/
        System.out.println("圆的面积是："+b.calArea());     
      }
}
