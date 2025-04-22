package com.mycompany.mainapp;

/**
 *
 * @author lab_services_student
 */

//(Farrell, 2022)
import javax.swing.JOptionPane;

public class MainApp {
    public static void main(String[] args) {
        Register reg = new Register();

        // Ask for username
        String username = JOptionPane.showInputDialog("Enter a username:");
        if (!reg.checkUserName(username)) {
            JOptionPane.showMessageDialog(null,
                    "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        // Ask for password
        String password = JOptionPane.showInputDialog("Enter a password:");
        if (!reg.checkPasswordComplexity(password)) {
            JOptionPane.showMessageDialog(null,
                    "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        // Ask for cell number
        String cell = JOptionPane.showInputDialog("Enter your cell number (+27...):");
        if (!reg.checkCellPhoneNumber(cell)) {
            JOptionPane.showMessageDialog(null,
                    "Cell phone number incorrectly formatted or does not contain international code.");
        }

        // Attempt to register the user and display message
        String regMessage = reg.registerUser(username, password, cell);
        JOptionPane.showMessageDialog(null, regMessage);

        // Login section
        String loginUsername = JOptionPane.showInputDialog("Login - Enter your username:");
        String loginPassword = JOptionPane.showInputDialog("Login - Enter your password:");

        Login login = new Login(reg.getUsername(), reg.getPassword());
        String loginStatus = login.returnLoginStatus(loginUsername, loginPassword);
        JOptionPane.showMessageDialog(null, loginStatus);
    }
}
