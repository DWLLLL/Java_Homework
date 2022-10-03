/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

功能：使用起泡排序法对数组a中的数据从小到大排序

-------------------------------------------------------*/

public class Prog1
{
  public static void main(String args[]) 
   {
     int i,j,min,temp;
  /*******************SPACE*******************/
     int a[]= { 20,10,50,40,30,70,60,80,90,100 };
     int n;
  /*******************SPACE*******************/
     n=a.length; 
     System.out.println("排序之前:");
     for(i=0;i<n;i++)
       System.out.print(a[i]+" ");
     System.out.println();
     for(i=0;i<n-1;i++)
      { for(j=0;j<n-i-1;j++)
  /*******************SPACE*******************/
          if (a[j]>a[j+1])
           { temp = a[j];
             a[j] = a[j+1];
  /*******************SPACE*******************/
             a[j+1] = temp;
          }
       }
     System.out.println("排序后的结果:");
     for(i=0;i<n;i++)
       System.out.print(a[i]+"  ");
     System.out.println();
   }
}
