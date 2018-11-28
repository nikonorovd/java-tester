package contactsmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ContactsManager {
    FirefoxDriver wd;

    private ContactsSeccionHelper contactsSeccionHelper;
    private ContactsNavigationHelper contactsNavigationHelper;
    private ContactHelper contactHelper;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        contactHelper = new ContactHelper(wd);
        contactsNavigationHelper = new ContactsNavigationHelper(wd);
        contactsSeccionHelper = new ContactsSeccionHelper(wd);
        contactsSeccionHelper.login("admin", "secret");
    }


    public void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        wd.quit();
    }


    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public ContactsNavigationHelper getContactsNavigationHelper() {
        return contactsNavigationHelper;
    }
}
