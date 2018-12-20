package ru.neolant.addressbook.tests.Tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.GroupData;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAgroup() )     {
            app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
