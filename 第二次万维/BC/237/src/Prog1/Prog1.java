/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ����������һ��Person�� һ��MyDate�ࡣ���һ���̳�Person�������Student��
      Student����һ��������String��������JOB����"ѧϰ"��һ��String���͵�
      studentID��һ��MyDate���͵�admissionDate������Student������дPerson��
      getType�������䷵���ַ���"Student"��
      ȷ��������Ϻ����г�������������1�Ľ����

�����������1��ʾ��

-------------------------------------------------------*/

//Student


/**********Program**********/
class Student extends Person{
    public static final String JOB="ѧϰ";
    public String studentID;
    public MyDate admissionDate;
    public String getType(){
        return "Student";
    }
    
}


/**********  End  **********/

//Person
class Person {
    //��ȡ����

    public String getType() {
        return "Person";
    }
    protected String name;//����
    protected int age;//����
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
        student.name = "ѧ��1";
        student.age = 21;
        student.studentID = "2015010101";
        student.admissionDate = new MyDate();
        student.admissionDate.year = 2015;
        student.admissionDate.month = 9;
        student.admissionDate.day = 1;
        System.out.println("���ͣ�" + student.getType());
        System.out.println("������" + student.name);
        System.out.println("���䣺" + student.age);
        System.out.println("ѧ�ţ�" + student.studentID);
        System.out.println("������" + Student.JOB);
        System.out.println("��ѧ���ڣ�" + student.admissionDate.year + "��" + student.admissionDate.month + "��" + student.admissionDate.day + "��");
    }
}
