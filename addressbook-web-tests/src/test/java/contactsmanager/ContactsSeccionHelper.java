package contactsmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsSeccionHelper {
    private FirefoxDriver wd;

    public ContactsSeccionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }
    public void login(String username, String password) {
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.id("LoginForm")).submit();
    }
}
