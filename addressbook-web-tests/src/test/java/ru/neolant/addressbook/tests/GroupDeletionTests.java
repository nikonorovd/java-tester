package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().GotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}