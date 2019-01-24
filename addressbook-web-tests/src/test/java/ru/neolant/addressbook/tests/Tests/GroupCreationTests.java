package ru.neolant.addressbook.tests.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        int before = app.getGroupHelper().getGroupCount();
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
    }

}
