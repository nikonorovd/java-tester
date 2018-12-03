package ru.neolant.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactsCreationTestsNew {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void testContactsCreationTestsNew() throws Exception {

        gotoAddNew();
        fillGroupForm(new GroupData("first name", "middle name", "last name", "company", "Titova", "1212121", "555666", "info@info.ru"));
        submitContactCreation();
        returnToHomePage();
    }

    private void returnToHomePage() {
        driver.findElement(By.id("logo")).click();
    }

    private void submitContactCreation() {
        driver.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(groupData.getFirstname());
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(groupData.getMiddle_name());
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(groupData.getLast_name());
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(groupData.getCompany());
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(groupData.getAddress());
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(groupData.getHomephone());
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(groupData.getMobile());
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(groupData.getEmail());
    }

    private void gotoAddNew() {
        driver.findElement(By.linkText("add new")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
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

    private static class GroupData {
        private final String firstname;
        private final String middle_name;
        private final String last_name;
        private final String company;
        private final String address;
        private final String homephone;
        private final String mobile;
        private final String email;

        private GroupData(String firstname, String middle_name, String last_name, String company, String address, String homephone, String mobile, String email) {
            this.firstname = firstname;
            this.middle_name = middle_name;
            this.last_name = last_name;
            this.company = company;
            this.address = address;
            this.homephone = homephone;
            this.mobile = mobile;
            this.email = email;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getMiddle_name() {
            return middle_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getCompany() {
            return company;
        }

        public String getAddress() {
            return address;
        }

        public String getHomephone() {
            return homephone;
        }

        public String getMobile() {
            return mobile;
        }

        public String getEmail() {
            return email;
        }
    }
}
