package ru.neolant.addressbook.tests;


import org.testng.annotations.Test;
import ru.neolant.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().GotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().FillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        app.logout();
    }

}
