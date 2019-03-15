package com.epam.cdp.Module_5;

import java.io.*;

public class ReadBytesDemo {
    public static void main(String[] args) throws IOException {

        OutputStream output = new FileOutputStream("/Users/mac/Desktop/newFolder/3.txt");
        output.write("Hello, world".getBytes());
        output.close();


        InputStream input = new FileInputStream("/Users/mac/Desktop/newFolder/3.txt");
        int data = input.read();
        while (data!=-1){
            data = input.read();
            System.out.println(data);
        }

        input.close();
        //read and write streams should always be closed afterwards
    }
}


// open -> read/write -> close stream