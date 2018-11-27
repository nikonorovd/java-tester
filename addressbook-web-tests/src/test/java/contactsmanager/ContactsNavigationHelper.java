package contactsmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsNavigationHelper {

    private FirefoxDriver wd;

    public ContactsNavigationHelper(FirefoxDriver wd) {
        this. wd = wd;

    }

    public void gotoNewPage() {
      wd.findElement(By.linkText("add new")).click();
    }
}
