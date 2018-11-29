package ru.neolant.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import contactsmanager.ApplicationManager;

public class TestBase {

    public ApplicationManager app = new ApplicationManager(null);
    public FirefoxDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {

        app.init();
    }

    protected void returnHomaPage() {
      wd.findElement(By.linkText("home")).click();
    }

    protected void updateContactPage() {
      wd.findElement(By.name("update")).click();
    }

    protected void renameFirstName(String firstname) {
      wd.findElement(By.name("firstname")).sendKeys(firstname);
    }

    protected void clearFirstName() {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
    }

    protected void editContact() {
      wd.findElement(By.xpath("(//img[@alt='Edit'])[3]")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

    public ApplicationManager getApp() {
        return app;
    }

    private boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    protected void returnHomePage() {
      wd.findElement(By.linkText("home")).click();
    }

    protected void deleteContacts() {
      wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    protected void selectContact() {
      wd.findElement(By.id("2")).click();
    }
}
