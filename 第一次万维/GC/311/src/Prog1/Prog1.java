/*-------------------------------------------------------
【程序改错】
---------------------------------------------------------

题目：计算并输出100以内最大的10个能被3或7整除的自然数之和

-------------------------------------------------------*/

public class Prog1
{
  public static void main(String args[])
   {
     int k,s=0,mc=0;
    /***********FOUND***********/
     for (k=500;k>0;k--) 
      {
   /***********FOUND***********/
       if (k%3 == 0 || k%7==0)
        { 
   /***********FOUND***********/
          s=s+k;
          mc++; 
        }
    /***********FOUND***********/
       if (mc==10)
         break; 
     }
   System.out.println("Sum is "+s);
  }
}

