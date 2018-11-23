package ru.neolant.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.neolant.addressbook.model.TestBase;

public class ModificationContactsTests extends TestBase {


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

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.quit();

    }

}
