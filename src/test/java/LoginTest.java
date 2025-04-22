/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

//Made by netbeans automaticly
import com.mycompany.mainapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testLoginSuccess() {
        Login login = new Login("abc_1", "Ch&&sec@ke99!");
        assertTrue(login.loginUser("abc_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        Login login = new Login("abc_1", "Ch&&sec@ke99!");
        assertFalse(login.loginUser("wrong", "pass"));
    }

    @Test
    public void testLoginStatusSuccess() {
        Login login = new Login("abc_1", "Ch&&sec@ke99!");
        String result = login.returnLoginStatus("abc_1", "Ch&&sec@ke99!");
        assertEquals("Login successful. Welcome abc_1!", result);
    }

    @Test
    public void testLoginStatusFail() {
        Login login = new Login("abc_1", "Ch&&sec@ke99!");
        String result = login.returnLoginStatus("wrong", "wrong");
        assertEquals("Login failed. Invalid username or password.", result);
    }
}

