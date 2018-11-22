package ru.neolant.addressbook.tests;



import org.testng.annotations.*;
import ru.neolant.addressbook.GroupData;
import ru.neolant.addressbook.model.TestBase;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        app.GotoGroupPage();
        app.initGroupCreation();
        app.FillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returnGroupPage();
        app.logout();
    }

}
