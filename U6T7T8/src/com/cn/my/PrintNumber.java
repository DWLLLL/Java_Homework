package com.cn.my;

import java.io.*;

public class PrintNumber {
    FileInputStream filein;
    DataInputStream datain;
    FileOutputStream fileout;
    DataOutputStream dataout;
    public void print(File file, int n){
        int a;
        int[] b=new int[n];
        try{
            fileout = new FileOutputStream(file);
            dataout = new DataOutputStream(fileout);
            dataout.writeInt(2);
            for (int i = 3; i < n; i++){
                int t=1;
                for (int j = 2; j < i; j++){
                    if(i%j == 0){
                        t=0;
                        break;
                    }

                }
               if(t==1)
                   dataout.writeInt(i);
            }
        }catch (IOException ioe){

        }
        int i=0;
        try{
            filein = new FileInputStream(file);
            datain = new DataInputStream(filein);
            while(true){
               b[i] = datain.readInt();
               i++;
            }
        }catch (EOFException ioe) {
        }catch (IOException eoe){
        }
        TongJi tongJi = new TongJi();
        tongJi.tj(b,i);


    }
}
