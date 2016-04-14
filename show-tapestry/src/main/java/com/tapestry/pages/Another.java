package com.tapestry.pages;

import com.tapestry.util.User;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.services.ApplicationDefaults;

public class Another {

    @SessionState
    private User myUser;

    private String passedMessage;

    public User getMyUser() {
        return myUser;
    }

    public String getPassedMessage() {
        return passedMessage;
    }

    public void setPassedMessage(String passedMessage) {
        this.passedMessage = passedMessage;
    }

    void onActivate(String message) {
        System.out.println("Another page is activated! The message is: " + message);
        this.passedMessage = message;
    }

    String onPassivate() {
        System.out.println("Another page is passivated...");
        return passedMessage;
    }
}
