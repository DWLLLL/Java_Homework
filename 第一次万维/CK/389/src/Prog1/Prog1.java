/*-------------------------------------------------------
��������ա�
---------------------------------------------------------

���ܣ�����һ��Student�࣬�����ꡢ�¡����������ԣ��Լ�������
      �ڵķ�������ʾ���ڵķ���������һ��Prog1��������������
      �����ԣ������������������յķ�������ʾ�������յķ���

-------------------------------------------------------*/

class Student
 {
   int day, month, year;
   public void setDate( int d, int m, int y) 
    {
      day = d;
      month = m;
/*******************SPACE*******************/
      year=y;
     }
   public void printDate()
     {
	System.out.println(year+"��"+month+"��"+day+"��");
     }
 }
/*******************SPACE*******************/
public class Prog1 extends Student
{  
  String name;
  Student  birth;
  void setStudent(String n,Student b)
   {
    name=n;
    birth=b;
    } 
  void printStudent()
   {
    System.out.print(name+"��������");
/*******************SPACE*******************/
    birth.printDate();    
    }
  public static void main (String args[]) 
     {
	Prog1 s = new Prog1();
	Student d=new Student();
        d.setDate(22, 2, 1985);
        s.setStudent("����",d);
/*******************SPACE*******************/
	s.printStudent();
      }
}

