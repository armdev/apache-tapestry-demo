package com.tapestry.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;

public class Result {

    private String firstName;

    private String lastName;

    // set() is public so that other pages can use it to set up this page.
    public void set(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // onPassivate() is called by Tapestry to get the activation context to put in the URL.
    Object[] onPassivate() {
        return new String[]{firstName, lastName};
    }

    // onActivate() is called by Tapestry to pass in the activation context from the URL.
    void onActivate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

}
