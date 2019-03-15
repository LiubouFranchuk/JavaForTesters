package com.epam.cdp.Module_7.annitations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME )
public @interface NotEmpty {
    //usually no code is written insid an annotaion, but sometimes parameters can be added

}
