package contactsmanager;

import modelcontacts.AddNewData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this. wd = wd;
    }

    public void returnAddNew() {
      wd.findElement(By.linkText("home")).click();
    }

    public void submitAddNew() {
      wd.findElement(By.name("submit")).click();
    }

    public void fillAddNewForm(AddNewData addNewData) {
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

    public void deletedContact() {
      wd.findElement(By.xpath("//input[@value='Delete']")).click();
      wd.switchTo().alert().accept();
    }

    public void selectedContact() {
      wd.findElement(By.xpath("//input[@name='selected[]']")).click();
    }
}
