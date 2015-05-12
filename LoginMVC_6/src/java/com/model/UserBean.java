/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author PaulRyan
 */
public class UserBean {
    private String username = "yayannpaul";
    private String password = "12345";
    
    public boolean isUserValid(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password))
            return true;
        return false;
    }
}
