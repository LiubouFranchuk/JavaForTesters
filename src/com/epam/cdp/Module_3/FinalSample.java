package com.epam.cdp.Module_3;

public class FinalSample {

    public static final String CLASSNAME = "FinalSample";
    public static final String CLASSNAME1 = CLASSNAME;

    //    psvm --> this abbreviation adds the row below
    public static void main(String[] args) {
        final int i = 10;
//        i = i - 2;
//        i++;
        System.out.println(i + CLASSNAME1);
//        RMC --> Refactor --> Extract --> Constant (public static final in this case)

    }
}
