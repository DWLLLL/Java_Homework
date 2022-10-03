/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：本题定义三个平面坐标点A、B、C，请将area方法完善，使其可以计算出三个点构成的三角形的面积。
      要求：
      * 1、使用Math.sqrt()方法。
      * 2、使用海伦公式计算三角形面积。
      * 海伦公式：S=√p(p-a)(p-b)(p-c)，公式中a，b，c分别为三角形三边长，p为周长二分之一，S为三角形的面积。

例如：点A为(0,0) 点B位(1,0) 点C为(0,2) 则面积为1。

-------------------------------------------------------*/
import java.io.*;
import java.math.*;

/*
定义坐标点
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
    //求面积函数
    public static double area(Point A, Point B, Point C) {
        double s; //s变量存放面积
        double lineAB; //lineAB变量存放线AB的长度 c
        double lineAC; //lineAB变量存放线AC的长度 b
        double lineBC; //lineAB变量存放线BC的长度 a
        double lineH; //lineH变量存放海伦公式中的二分之一周长 p

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
         System.out.println("面积为：" + s);

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



