/*-------------------------------------------------------
��������ա�
---------------------------------------------------------

���ܣ�����һ��Date�࣬�����ꡢ�¡����������ԣ��Լ���������
      �ķ�������ʾ���ڵķ���������һ��ѧ����Prog1��������
      �����������ԣ������������������յķ�������ʾ�������յ�
      ����

-------------------------------------------------------*/

class Date 
 {
   int day, month, year;
/*******************SPACE*******************/
   public void setDate( int y, int m, int d) 
    {
      day = d;
      month = m;
      year = y;
     }
/*******************SPACE*******************/
   public void printDate()
     {
	System.out.println(year+"��"+month+"��"+day+"��");
     }
 }
public class Prog1
{  
  String name;
/*******************SPACE*******************/
  Date birth=new Date();
  int age;
  void setBlank(String n,int y,int m,int d)
   {
    name=n;
    birth.setDate(y,m,d);
    } 
  void calAge()
   {if (birth.month<7)
      age=2004-birth.year;
    else
      age=2004-birth.year-1; 
    }
  void printBlank()
   {
    System.out.print(name+"��������");
    birth.printDate();
/*******************SPACE*******************/
    calAge();    
    System.out.println(name+"��������"+age);
    }
  public static void main (String args[]) 
     {
	Prog1 s = new Prog1();
	s.setBlank("����",1985,6,2);
       	s.printBlank();
      }
}
