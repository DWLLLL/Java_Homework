
/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：Book（图书）类，包括name(书名)，publisher(出版社)，author(作者)，
      year(出版年份)，price(单价)共5个成员变量 和 1个构造函数。
      toString()方法返回某一本书的相关信息字符串。

要求：实例化Book类的对象book，并对其所有属性赋值，
      最后通过调用图书类的toString()方法获取图书信息并输出。

结果：输出结果如“样张1”所示。
-------------------------------------------------------*/

public class Prog1 {
    public static void main(String[] args){
        String bookInformation = "";//bookInformation此变量存放图书信息；

/**********Program**********/
        Book book=new Book("Java教程","大学出版社",2016);
        book.setPrice((float)36.0);
        book.setAuthor("张三");
        bookInformation = book.toString();




/**********  End  **********/

        System.out.print(bookInformation);
    }
}

//图书类
class Book{
    private String name;//名称
    private String publisher;//出版社
    private String author;//作者
    private int year;//出版年份
    private float price;//单价

    public  Book(String n,String p,int y){
        name=n;
        publisher=p;
        year=y;
    }
   
    public void setPrice(float p){
        price=p;
    }
    
    public void setAuthor(String au){
        author=au;
    }
 
    public String toString(){
        StringBuilder str=new StringBuilder("=============="+
        "================================================\n");
        str=str.append("书名：").append(name).
        append("\t\t出版社：").append(publisher).
        append("\t作者：").append(author).append("\n");
        
        str=str.append("出版年份：").append(year).
        append("\t单价："+price+"\n");
        str=str.append("==================================="+
        "===========================\n");
        return str.toString();
    }
}
