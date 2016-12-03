package com.login.stats.forms;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


public class LoginForm {

    @Email
    @NotEmpty
    private String email;
    
    @NotEmpty
    @Length(min = 6)
    private String password;
	
    public String getEmail() {
		return email;
	}
	
    public void setEmail(String email) {
		this.email = email;
	}
	
    public String getPassword() {
		return password;
	}
	
    public void setPassword(String password) {
		this.password = password;
	}
    
}
