package com.login.stats.forms;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class PasswordForm {

    @Email
    @NotEmpty
    private String email;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
