/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

功能：定义一个Student类，包括年、月、日三个属性，以及设置日
      期的方法，显示日期的方法；定义一个Prog1，包括姓名、生
      日属性，包括设置姓名与生日的方法，显示姓名生日的方法

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
	System.out.println(year+"年"+month+"月"+day+"日");
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
    System.out.print(name+"的生日是");
/*******************SPACE*******************/
    birth.printDate();    
    }
  public static void main (String args[]) 
     {
	Prog1 s = new Prog1();
	Student d=new Student();
        d.setDate(22, 2, 1985);
        s.setStudent("李利",d);
/*******************SPACE*******************/
	s.printStudent();
      }
}

