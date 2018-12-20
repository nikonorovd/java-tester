package ru.neolant.addressbook.tests.Tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAgroup() )     {
            app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test1", "Test1"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

    }
}
