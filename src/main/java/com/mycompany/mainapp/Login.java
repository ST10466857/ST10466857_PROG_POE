/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//(Farrell, 2022)
package com.mycompany.mainapp;

public class Login {
    private final String regUsername;
    private final String regPassword;

    public Login(String regUsername, String regPassword) {
        this.regUsername = regUsername;
        this.regPassword = regPassword;
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(regUsername) && inputPassword.equals(regPassword);
    }

    public String returnLoginStatus(String inputUsername, String inputPassword) {
        if (loginUser(inputUsername, inputPassword)) {
            return "Login successful. Welcome " + regUsername + "!";
        } else {
            return "Login failed. Invalid username or password.";
        }
    }
}
