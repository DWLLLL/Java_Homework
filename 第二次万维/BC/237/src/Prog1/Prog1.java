/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：程序中有一个Person类 一个MyDate类。设计一个继承Person类的子类Student，
      Student类有一个常量的String类型属性JOB等于"学习"、一个String类型的
      studentID，一个MyDate类型的admissionDate。并在Student类中重写Person的
      getType方法让其返回字符串"Student"。
      确保编译完毕后，运行程序会出现如样张1的结果。

结果：如样张1所示。

-------------------------------------------------------*/

//Student


/**********Program**********/
class Student extends Person{
    public static final String JOB="学习";
    public String studentID;
    public MyDate admissionDate;
    public String getType(){
        return "Student";
    }
    
}


/**********  End  **********/

//Person
class Person {
    //获取类型

    public String getType() {
        return "Person";
    }
    protected String name;//名称
    protected int age;//年龄
}

//MyDate
class MyDate {

    long year;
    long month;
    long day;
}

public class Prog1 {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "学生1";
        student.age = 21;
        student.studentID = "2015010101";
        student.admissionDate = new MyDate();
        student.admissionDate.year = 2015;
        student.admissionDate.month = 9;
        student.admissionDate.day = 1;
        System.out.println("类型：" + student.getType());
        System.out.println("姓名：" + student.name);
        System.out.println("年龄：" + student.age);
        System.out.println("学号：" + student.studentID);
        System.out.println("工作：" + Student.JOB);
        System.out.println("入学日期：" + student.admissionDate.year + "年" + student.admissionDate.month + "月" + student.admissionDate.day + "日");
    }
}
