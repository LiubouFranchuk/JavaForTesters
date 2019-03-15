package com.epam.cdp.Module_3;

import java.io.IOException;

public class MyOwnException extends IOException {
        public void logSomething(){
            System.out.println("It was " + System.currentTimeMillis());
        }

}
