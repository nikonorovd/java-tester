package ru.neolant.addressbook.tests;



import org.testng.annotations.*;
import ru.neolant.addressbook.model.TestBase;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation(){

        app.getNavigationHelper().GotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().FillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
        app.logout();
    }

}
