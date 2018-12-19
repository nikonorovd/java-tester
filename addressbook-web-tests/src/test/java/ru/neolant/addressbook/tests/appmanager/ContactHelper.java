package ru.neolant.addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.neolant.addressbook.tests.model.ContactData;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {

        super(wd);
        this.wd = wd;
    }


    public void submitContactsCreation() {

        wd.findElement(By.name("submit")).click();
    }

    public void click(String submit) {

        wd.findElement(By.name(submit)).click();
    }

    public void fillContactsForm(ContactData contactData, boolean creation) {
        type("firstname", By.name("firstname"), contactData.getFirstname());
        type("middlename", contactData.getMiddlename(), By.name("middlename"));
        type("lastname", contactData.getLastname(), By.name("lastname"));
        type("company", By.name("company"), contactData.getCompany());
        type("address", By.name("address"), contactData.getAddress());
        type("home", By.name("home"), contactData.getHome());
        type("mobile", By.name("mobile"), contactData.getModile());
        type("email", By.name("email"), contactData.getEmail());


        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void type(String middlename, String middlename2, By locator) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(middlename2);
    }

    public void type(String firstname, By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void returnToHomePage() {
        click();

    }

    private void click() {
        wd.findElement(By.xpath("//img[@id='logo']")).click();
    }

    public void deletionContact() {
        wd.findElement(By.xpath("//input[@value='Delete']")).click();
        wd.switchTo().alert().accept();
    }

    public void selectContact() {

        click("selected[]");

    }

    public void updateContacts() {

        click(By.xpath("(//input[@name='update'])[2]"));
    }

    public void editContact() {

        click(By.xpath("//img[@alt='Edit']"));
    }


}


