/*-------------------------------------------------------
��������ա�
---------------------------------------------------------

���ܣ�����һ��Բ����Prog1������Բ�����꣨��Point��Ķ���
      Point����java.awt���е��࣬����x��y�������ԣ����뾶
      ���ԣ��Լ���ʼ��Բ�����ԵĹ��췽����ȡ��Բ�ĵķ�����
      �뾶�ķ���������Բ����ķ���

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
        System.out.println("Բ��Ϊ��("+b.getCenter().x+","+b.getCenter().y+")");
        System.out.println("�뾶�ǣ�"+b.getRadius());
  /*******************SPACE*******************/
        System.out.println("Բ������ǣ�"+b.calArea());     
      }
}
