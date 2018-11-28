package contactsmanager;

import modelcontacts.AddNewData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.neolant.addressbook.tests.TestBase;
import tests.ContacsBase;

public class ContactHelper extends ContactsHelperBase {

    public Object initContactsModification;

    public ContactHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void returnAddNew() {
        click(By.linkText("home"));
    }

    public void submitAddNew() {
        click(By.name("submit"));
    }

    public void fillAddNewForm(AddNewData addNewData) {
        fname(By.name("firstname"), addNewData.getFirstname());
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
        fname(By.name("home"), addNewData.getHome());
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(addNewData.getMobile());
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(addNewData.getWork());
    }

    public void deletedContact() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void selectedContact() {
        click(By.xpath("//input[@name='selected[]']"));
    }

    public void initContactsModification() {
        click(By.xpath("edit"));

    }

    public void submitContactsModification() {
        click(By.xpath("update"));
    }
}
