
/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ��Book��ͼ�飩�࣬����name(����)��publisher(������)��author(����)��
      year(�������)��price(����)��5����Ա���� �� 1�����캯����
      toString()��������ĳһ����������Ϣ�ַ�����

Ҫ��ʵ����Book��Ķ���book���������������Ը�ֵ��
      ���ͨ������ͼ�����toString()������ȡͼ����Ϣ�������

������������硰����1����ʾ��
-------------------------------------------------------*/

public class Prog1 {
    public static void main(String[] args){
        String bookInformation = "";//bookInformation�˱������ͼ����Ϣ��

/**********Program**********/
        Book book=new Book("Java�̳�","��ѧ������",2016);
        book.setPrice((float)36.0);
        book.setAuthor("����");
        bookInformation = book.toString();




/**********  End  **********/

        System.out.print(bookInformation);
    }
}

//ͼ����
class Book{
    private String name;//����
    private String publisher;//������
    private String author;//����
    private int year;//�������
    private float price;//����

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
        str=str.append("������").append(name).
        append("\t\t�����磺").append(publisher).
        append("\t���ߣ�").append(author).append("\n");
        
        str=str.append("������ݣ�").append(year).
        append("\t���ۣ�"+price+"\n");
        str=str.append("==================================="+
        "===========================\n");
        return str.toString();
    }
}
