/*-------------------------------------------------------
��������ơ�
---------------------------------------------------------

��Ŀ����д����add()���ڷ�����ʹ�õݹ���ʽ�������m(mΪ������)��ǰn����Ȼ���ĺ͡�

���磺m=10��m��ǰn����Ȼ���ĺͼ��㹫ʽΪ1+2+3+4+5+6+7+8+9+10

-------------------------------------------------------*/

import java.io.*;
public class Prog1{        
    public static int add(int m) {
/**********Program**********/
        if(m==1)
            return 1;
        else{
            return add(m-1)+m;
        }





/**********  End  **********/
    }    

        
    public static int[] function(int[] inarray) {
        int[] outarray = new int[inarray.length];
        for (int i = 0; i < inarray.length; i++) {
            outarray[i]=add(inarray[i]);
        }
        return outarray;
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
            int[] inarray = new int[6];
            String s = intwo.readLine();
            for (int i = 0; i < 6; i++) {
                if (s != null) {
                    inarray[i] = Integer.parseInt(s);
                    s = intwo.readLine();
                }
            }
            inone.close();
            intwo.close();
            int[] outarray = function(inarray);
            for (int i = 0; i < outarray.length; i++) {
                out.write(outarray[i] + "");
                out.newLine();
                out.flush();
            }
            out.close();
            tofile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}


