package ru.neolant.addressbook.tests.Tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test1", "Test1", "Test1"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
