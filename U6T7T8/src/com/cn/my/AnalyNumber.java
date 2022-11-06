package com.cn.my;

import java.io.*;

public class AnalyNumber {
    FileInputStream filein;
    DataInputStream datain;
    public void fileinput(File file){
        try{
            filein = new FileInputStream(file);
            datain = new DataInputStream(filein);
            while(true){
                System.out.println(datain.readInt()+"");
            }
        }catch (EOFException ioe) {
        }catch (IOException eoe){

        }
    }
}
