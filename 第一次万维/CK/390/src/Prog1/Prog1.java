/*-------------------------------------------------------
��������ա�
---------------------------------------------------------

���ܣ�����һ��������Prog1������ʵ�����鲿�������ԣ��Լ���
      ���鲿ʵ���Ĺ��췽����������ͷ�����������������
      �������������ʾ��������

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
        System.out.print("��һ�������ǣ�");
        a.print();
        System.out.print("�ڶ��������ǣ�");
        b.print();
        System.out.print("������֮���ǣ�");
/*******************SPACE*******************/
        a.add(b).print();
        System.out.print("������֮���ǣ�");
        a.minus(b).print();
      }

}
