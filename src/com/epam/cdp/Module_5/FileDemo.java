package com.epam.cdp.Module_5;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/mac/Desktop/Hi.txt");
        // windows version:
        //File f = new File("C:\\Temp\\Example.txt");
        System.out.println(file.exists());
        System.out.println(file.length());

        if (file.renameTo(new File("/Users/mac/Desktop/Hi2.txt")));
        {
            System.out.println(file.exists());
            file.delete();
            System.out.println(file.exists());
        }



        File dir = new File("/Users/mac/Desktop/newFolder");
        System.out.println(dir.exists());
        if (dir.mkdir()) {
            System.out.println(dir.exists());
            System.out.println("It is a directory : " + dir.isDirectory());
        }

        String[] fileNames = dir.list();
        for (String fileName: fileNames){
            System.out.println(fileName);
        }
        File[] files = dir.listFiles();

    }
}
