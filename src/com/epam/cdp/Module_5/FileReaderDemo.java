package com.epam.cdp.Module_5;

import java.io.*;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("/Users/mac/Desktop/newFolder/4.txt");
        writer.write("Summer Party");
        writer.close();


        Reader reader = new FileReader("/Users/mac/Desktop/newFolder/4.txt");
        int data = reader.read();
        while (data!=-1){
            char dataChar = (char) data;
            System.out.print(dataChar);
            data = reader.read();
        }

//        Reader readerSt = new InputStreamReader(oldAPI.getInputStream);

    }
}
