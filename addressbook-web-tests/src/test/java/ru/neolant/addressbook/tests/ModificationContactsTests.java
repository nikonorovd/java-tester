package ru.neolant.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModificationContactsTests {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testModificationContactsTests() throws Exception {
    wd.get("http://localhost/addressbook/");
    editContact();
    clearFirstName();
    renameFirstName("Mark");
    updateContactPage();
    returnHomaPage();
  }

  private void returnHomaPage() {
    wd.findElement(By.linkText("home")).click();
  }

  private void updateContactPage() {
    wd.findElement(By.name("update")).click();
  }

  private void renameFirstName(String firstname) {
    wd.findElement(By.name("firstname")).sendKeys(firstname);
  }

  private void clearFirstName() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
  }

  private void editContact() {
    wd.findElement(By.xpath("(//img[@alt='Edit'])[3]")).click();
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
