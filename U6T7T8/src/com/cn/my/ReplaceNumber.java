package com.cn.my;

import java.io.*;

public class ReplaceNumber {
    int[] a=new int[5];
    FileInputStream filein;
    DataInputStream datain;
    public void replace(File file){
        int i = 0;
        int sum=0;
        try{
            filein = new FileInputStream(file);
            datain = new DataInputStream(filein);
            while(true){
                a[i]=datain.readInt();
                sum+=a[i];
                i++;
            }
        }catch (EOFException ioe) {
        }catch (IOException eoe){
        }
        a[2] = sum / 5;
        RandomNumber r = new RandomNumber();
        r.output(file,a);
    }
}
