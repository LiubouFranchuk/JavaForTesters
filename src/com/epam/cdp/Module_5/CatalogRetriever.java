package com.epam.cdp.Module_5;

import java.io.File;

public class CatalogRetriever {
    public static void main(String[] args) {

        File dir = new File("/Users/mac/Desktop");
        retrieveCatalogs(dir);
        System.out.println(i);
    }

    private static int i = 0;

    private static void retrieveCatalogs(File dir) {

        if (dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files){
                    System.out.println(file.getAbsolutePath());
                    i++;
                    if (file.isDirectory()){
                        retrieveCatalogs(file);
                    }
                }
            }
        }
    }
}

