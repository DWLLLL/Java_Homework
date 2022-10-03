/*-------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：本题定义了一个长度为n的boolean型数组b，并给数组元素赋值，
要求如果数组元素下标为奇数的话，数组元素值为false，否则为true。

例如：n = 5 数组b[] = {true,false,true,false,true}

-------------------------------------------------------*/

import java.io.*;

public class Prog1 {

    public static String fuction(int n) {
        String result = "";
        if (n > 0) {
            /**********Program**********/
            boolean[] b=new boolean[n];
            for(int i=0;i<n;i++){
                if(i%2==0)
                    b[i]=true;
                else
                    b[i]=false;
            }

            /**********  End  **********/
            for (int i = 0; i < n; i++) {
                result = result + b[i] + ",";
            }
        }
        return result;
    }

    public static void main(String[] args) {
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
                String number = fuction(Integer.parseInt(s));
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
