/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ�����ⶨ������ƽ�������A��B��C���뽫area�������ƣ�ʹ����Լ���������㹹�ɵ������ε������
      Ҫ��
      * 1��ʹ��Math.sqrt()������
      * 2��ʹ�ú��׹�ʽ���������������
      * ���׹�ʽ��S=��p(p-a)(p-b)(p-c)����ʽ��a��b��c�ֱ�Ϊ���������߳���pΪ�ܳ�����֮һ��SΪ�����ε������

���磺��AΪ(0,0) ��Bλ(1,0) ��CΪ(0,2) �����Ϊ1��

-------------------------------------------------------*/
import java.io.*;
import java.math.*;

/*
���������
*/
class Point {
    double zuobiaoX;
    double zuobiaoY;
    Point(){
    }
    Point(double x, double y){
        zuobiaoX = x;
        zuobiaoY = y;
    }
}

public class Prog1 {
    //���������
    public static double area(Point A, Point B, Point C) {
        double s; //s����������
        double lineAB; //lineAB���������AB�ĳ��� c
        double lineAC; //lineAB���������AC�ĳ��� b
        double lineBC; //lineAB���������BC�ĳ��� a
        double lineH; //lineH������ź��׹�ʽ�еĶ���֮һ�ܳ� p

/**********Program**********/
        lineAB=Math.sqrt((A.zuobiaoX-B.zuobiaoX)*(A.zuobiaoX-B.zuobiaoX)+(A.zuobiaoY-B.zuobiaoY)*(A.zuobiaoY-B.zuobiaoY));
        lineAC=Math.sqrt((A.zuobiaoX-C.zuobiaoX)*(A.zuobiaoX-C.zuobiaoX)+(A.zuobiaoY-C.zuobiaoY)*(A.zuobiaoY-C.zuobiaoY));
        lineBC=Math.sqrt((B.zuobiaoX-C.zuobiaoX)*(B.zuobiaoX-C.zuobiaoX)+(B.zuobiaoY-C.zuobiaoY)*(B.zuobiaoY-C.zuobiaoY));
        lineH=(lineAB+lineBC+lineAC)/2;
        return (Math.sqrt(lineH*(lineH-lineAB)*(lineH-lineAC)*(lineH-lineBC)));





/**********  End  **********/

      }
    
    public static void main(String[] args){
         Point a = new Point(0, 0);
         Point b = new Point(1, 0);
         Point c = new Point(0, 2);
         double s = area(a, b, c);
         System.out.println("���Ϊ��" + s);

         wwjt();
    }
    
    
        
    
    
    
    
    
    

    public static void wwjt() {
        File file = new File("in.dat");
        File tempFile = new File("out.dat");
        if (!tempFile.exists()) {
            try {
                tempFile.createNewFile();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        try {
            FileReader inone;
            BufferedReader intwo;
            inone = new FileReader(file);
            intwo = new BufferedReader(inone);
            FileWriter tofile = new FileWriter(tempFile);
            BufferedWriter out = new BufferedWriter(tofile);
            String s = null;
            s = intwo.readLine();
            while (s != null) {
                String[] pointArrStr = s.split(";");
                Point A = new Point();
                A.zuobiaoX = Double.parseDouble(pointArrStr[0].split(",")[0]);
                A.zuobiaoY = Double.parseDouble(pointArrStr[0].split(",")[1]);
                Point B = new Point();
                B.zuobiaoX = Double.parseDouble(pointArrStr[1].split(",")[0]);
                B.zuobiaoY = Double.parseDouble(pointArrStr[1].split(",")[1]);
                Point C = new Point();
                C.zuobiaoX = Double.parseDouble(pointArrStr[2].split(",")[0]);
                C.zuobiaoY = Double.parseDouble(pointArrStr[2].split(",")[1]);
                
                double number = area(A, B, C);
                BigDecimal b = new BigDecimal(number);
                number = b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();  
                out.write(String.valueOf(number));
                out.newLine();
                s = intwo.readLine();
            }

            inone.close();
            intwo.close();
            out.flush();
            out.close();
            tofile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}



