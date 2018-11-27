package ru.neolant.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ContacsBase {
    protected WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.id("LoginForm")).submit();
    }

    protected void logout() {
      wd.findElement(By.linkText("Logout")).click();
    }

    protected void returnAddNew() {
      wd.findElement(By.linkText("home")).click();
    }

    protected void submitAddNew() {
      wd.findElement(By.name("submit")).click();
    }

    protected void fillAddNewForm(AddNewData addNewData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(addNewData.getFirstname());
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(addNewData.getMiddlename());
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(addNewData.getLastname());
      wd.findElement(By.name("nickname")).clear();
      wd.findElement(By.name("nickname")).sendKeys(addNewData.getNickname());
      wd.findElement(By.name("company")).clear();
      wd.findElement(By.name("company")).sendKeys(addNewData.getCompany());
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(addNewData.getAddress());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(addNewData.getHome());
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(addNewData.getMobile());
      wd.findElement(By.name("work")).clear();
      wd.findElement(By.name("work")).sendKeys(addNewData.getWork());
    }

    protected void gotoNewPage() {
      wd.findElement(By.linkText("add new")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
      wd.quit();
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

    protected void deletedContact() {
      wd.findElement(By.xpath("//input[@value='Delete']")).click();
      wd.switchTo().alert().accept();
    }

    protected void selectedContact() {
      wd.findElement(By.xpath("//input[@name='selected[]']")).click();
    }
}
