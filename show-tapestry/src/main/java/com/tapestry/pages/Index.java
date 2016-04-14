package com.tapestry.pages;

import java.util.Date;
import org.apache.tapestry5.ioc.annotations.Inject;

//http://jumpstart.doublenegative.com.au/jumpstart/

public class Index {
   
    public String getUsername() {
        return "Simple User !!!";
    }

    public Date getCurrentTime() {
        return new Date();
    }
}
