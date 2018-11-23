package ru.neolant.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteContactsTests {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDeleteContacts() throws Exception {
    wd.get("http://localhost/addressbook/");
    selectContact();
    deleteContacts();
    returnHomePage();
  }

  private void returnHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  private void deleteContacts() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }

  private void selectContact() {
    wd.findElement(By.id("2")).click();
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

}
