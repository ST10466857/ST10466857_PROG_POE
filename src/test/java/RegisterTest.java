/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mainapp.Register;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegisterTest {

    Register reg = new Register();

    @Test
    public void testValidUsername() {
        assertTrue(reg.checkUserName("abc_1"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(reg.checkUserName("abcdef"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(reg.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(reg.checkPasswordComplexity("password"));
    }

    @Test
    public void testValidCellNumber() {
        assertTrue(reg.checkCellPhoneNumber("+27834567890"));
    }

    @Test
    public void testInvalidCellNumber() {
        assertFalse(reg.checkCellPhoneNumber("0831234567"));
    }

    @Test
    public void testSuccessfulRegistration() {
        String result = reg.registerUser("abc_1", "Ch&&sec@ke99!", "+27834567890");
        assertTrue(result.contains("successfully"));
    }

    @Test
    public void testRegistrationFail_Username() {
        String result = reg.registerUser("abc1", "Ch&&sec@ke99!", "+27834567890");
        assertTrue(result.contains("Username is not correctly formatted"));
    }

    @Test
    public void testRegistrationFail_Password() {
        String result = reg.registerUser("abc_1", "password", "+27834567890");
        assertTrue(result.contains("Password is not correctly formatted"));
    }

    @Test
    public void testRegistrationFail_Cell() {
        String result = reg.registerUser("abc_1", "Ch&&sec@ke99!", "0831234567");
        assertTrue(result.contains("Cell phone number incorrectly formatted"));
    }
}
