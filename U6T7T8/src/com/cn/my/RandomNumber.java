package com.cn.my;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class RandomNumber {
    Random r = new Random();
    int[] a= new int[5];
    FileOutputStream fileOutput;
    DataOutputStream dataout;
    public void output(File file) {
        for(int i =0; i <5; i++){
            a[i] = r.nextInt(100);
        }

        try {
            fileOutput = new FileOutputStream(file);
            dataout = new DataOutputStream(fileOutput);
            for(int i =0; i <5; i++){
                dataout.writeInt(a[i]);
            }
            dataout.close();
            fileOutput.close();
        } catch (IOException ioe) {
        }

    }

    public void output(File file,int[] a) {
        try {
            fileOutput = new FileOutputStream(file);
            dataout = new DataOutputStream(fileOutput);
            for(int i =0; i <5; i++){
                dataout.writeInt(a[i]);
            }
            dataout.close();
            fileOutput.close();
        } catch (IOException ioe) {
        }

    }

}
