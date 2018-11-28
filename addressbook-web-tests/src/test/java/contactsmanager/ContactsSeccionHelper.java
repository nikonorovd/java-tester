package contactsmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsSeccionHelper extends ContactsHelperBase{

    public ContactsSeccionHelper(FirefoxDriver wd) {

        super(wd);
    }
    public void login(String username, String password) {
        fname(By.name("user"),username);
        fname(By.name("pass"),password);
        click(By.id("LoginForm"));
    }
}
