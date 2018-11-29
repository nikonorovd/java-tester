package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CB {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCB() throws Exception {
    driver.get("http://pfei-ext.kld.neolant/auth/login");
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//div[@id='__layout']/div/main/div/div[2]/form/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='__layout']/div/main/div/div[2]/form/div/div/div/input")).sendKeys("Dev");
    driver.findElement(By.xpath("//input[@type='password']")).click();
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dev123");
    driver.findElement(By.xpath("//button")).click();
    driver.findElement(By.xpath("//div[@id='__layout']/div/div[3]/div/ul/li[4]/span")).click();
    driver.findElement(By.linkText("Входящие")).click();
    driver.findElement(By.xpath("//div[@id='grid-5186a660-f3b1-11e8-8534-53e7239423e3']/div[2]/table/tbody/tr[5]/td/label")).click();
    driver.findElement(By.id("btnDelete")).click();
    driver.findElement(By.xpath("//div[3]/button[2]")).click();
    driver.findElement(By.xpath("//div[@id='__layout']/div/header/div/div/div/a/img")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
