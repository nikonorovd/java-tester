package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.GroupData;
import ru.neolant.addressbook.model.TestBase;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification(){
        app.getNavigationHelper().GotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().FillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnGroupPage();

    }
}