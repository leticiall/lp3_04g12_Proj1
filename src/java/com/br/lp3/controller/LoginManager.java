package com.br.lp3.controller;

/**
 *
 * @author 31400817
 */
public class LoginManager {

    private String username, password;

    public LoginManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authorize(){
        return ("oi".equals(username) && "oi2".equals(password));
        
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
