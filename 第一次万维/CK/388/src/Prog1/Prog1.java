/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

功能：定义一个Date类，包括年、月、日三个属性，以及设置日期
      的方法，显示日期的方法；定义一个学生类Prog1，包括姓
      名、生日属性，包括设置姓名与生日的方法，显示姓名生日的
      方法

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
	System.out.println(year+"年"+month+"月"+day+"日");
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
    System.out.print(name+"的生日是");
    birth.printDate();
/*******************SPACE*******************/
    calAge();    
    System.out.println(name+"的年龄是"+age);
    }
  public static void main (String args[]) 
     {
	Prog1 s = new Prog1();
	s.setBlank("李利",1985,6,2);
       	s.printBlank();
      }
}
