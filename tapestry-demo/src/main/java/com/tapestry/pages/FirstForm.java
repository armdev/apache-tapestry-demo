package com.tapestry.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;

public class FirstForm {

    @InjectPage
    private Result resultPage;

    @Property
    private String firstName;

    @Property
    private String lastName;

    @InjectComponent("names")
    private Form form;

    @InjectComponent("firstName")
    private TextField firstNameField;

    @InjectComponent("lastName")
    private TextField lastNameField;

    @InjectPage
    private Result page2;
   
    void onValidateFromNames() {
        if (firstName == null || firstName.trim().equals("")) {
            form.recordError(firstNameField, "First Name is required.");
        }
        if (lastName == null || lastName.trim().equals("")) {
            form.recordError(lastNameField, "Last Name is required.");
        }
    }

    Object onSuccess() {
        page2.set(firstName, lastName);
      
        return page2;
    }

}
