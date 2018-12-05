package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test1", "Test1", "Test1"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
