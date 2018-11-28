package contactsmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsNavigationHelper extends ContactsHelperBase{


    public ContactsNavigationHelper(FirefoxDriver wd) {
        super(wd);

    }

    public void gotoNewPage() {

        click(By.linkText("add new"));
    }
}
