package com.tapestry.pages;

import com.tapestry.util.User;
import java.util.Date;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.SessionState;

public class Start {

    @InjectPage
    private Another another;

    @SessionState
    private User user;

    private boolean userExists;

    public boolean getUserExists() {
        return userExists;
    }

    private int someValue = 12345;

    private String message = "initial value";

    public User getUser() {
        return user;
    }

    Object onSuccess() {
        System.out.println("Handling form submission!");
        String[] words = message.split(" ");
        if (words.length > 0) {
            user.setFirstName(words[0]);
            if (words.length > 1) {
                user.setLastName(words[1]);
            }
        }
        another.setPassedMessage(message);
        return another;
    }

    public int getSomeValue() {
        return someValue;
    }

    public void setSomeValue(int value) {
        this.someValue = value;
    }

    public Date getCurrentTime() {
        return new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setting the message: " + message);
        this.message = message;
    }
}
