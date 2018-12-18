package ru.neolant.addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import ru.neolant.addressbook.tests.model.ContactData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if  (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }

        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }


    private void click() {

        wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]"));
    }

    public GroupHelper getGroupHelper() {

        return groupHelper;
    }

    public ContactHelper getContactHelper() {

        return contactHelper;
    }

    public ContactHelper getdeletionContact() {

        return contactHelper;
    }

    public ContactHelper getreturnToHomePage() {

        return contactHelper;
    }
    public ContactHelper getfillGroupFormContacts() {

        return contactHelper;
    }
    public ContactHelper getsubmitContactsCreation() {

        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {

        return navigationHelper;
    }

    public ContactHelper fillGroupFormContacts(ContactData contactData) {
        return contactHelper;

    }

    public ContactHelper submitContactsCreation() {
        return contactHelper;


    }

    public ContactHelper returnToHomePage() {
        return contactHelper;

    }

    public ContactHelper deletionContact()
    {return contactHelper;


    }

    public ContactHelper editContact() {

        return contactHelper;
    }

    public ContactHelper updateContacts() {

        return contactHelper;
    }

    public ApplicationManager contacthelper() {

        return null;
    }


}
