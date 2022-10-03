/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

功能：定义一个复数类Prog1，包括实部与虚部两个属性，以及设
      置虚部实部的构造方法，复数求和方法，复数求差方法，复
      数求积方法，显示复数方法

-------------------------------------------------------*/

public class Prog1
 {
   double real,image;
   Prog1()
    {
     real=0;
     image=0;
    }
   Prog1(double r,double i)
    {
     real=r;
/*******************SPACE*******************/
     image =i;
    }
   public Prog1 add(Prog1 b) 
    { 
      Prog1 bt=new Prog1();
      bt.real=real+b.real;
      bt.image=image+b.image;
/*******************SPACE*******************/
      return bt;
     }
   public Prog1 minus(Prog1 b) 
    { 
      Prog1 bt=new Prog1();
      bt.real=real-b.real;
/*******************SPACE*******************/
      bt.image=image-b.image;
      return bt;
     }
  
   public void print()
     {
	System.out.println(real+"+"+image+"i");
     }
   public static void main (String args[]) 
     {
	Prog1 a = new Prog1(3,4);
        Prog1 b = new Prog1(1,2);
        System.out.print("第一个复数是：");
        a.print();
        System.out.print("第二个复数是：");
        b.print();
        System.out.print("两复数之和是：");
/*******************SPACE*******************/
        a.add(b).print();
        System.out.print("两复数之差是：");
        a.minus(b).print();
      }

}
