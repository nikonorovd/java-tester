package ru.neolant.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.neolant.addressbook.appmanager.ApplycationManager;

public class TestBase {


    protected final ApplycationManager app = new ApplycationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {

        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
