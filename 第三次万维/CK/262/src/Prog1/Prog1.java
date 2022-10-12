/*-------------------------------------------------------
【程序填空】
---------------------------------------------------------

本题将数组arrA中元素按逆序存储在另外一个相同长度的数组arrB中。

-------------------------------------------------------*/


public class Prog1{        

public static void main(String[] args) {

        int []arrA={1,3,8,4,2,6,9,0,7};
/***********SPACE***********/
        int []arrB=new int[arrA.length];

        int i=0;
/***********SPACE***********/
        int j=arrA.length-1;

        for(i=0;i<arrA.length;i++){

                arrB[j]=arrA[i];
/***********SPACE***********/
                j--;

        }

        System.out.println("arrA: "+"arrB:");

        for(i=0;i<arrA.length;i++){

                System.out.println(arrA[i]+"    "+arrB[i]);

        }

}        

}
