package ru.neolant.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
  public void testGroupDeletion() throws Exception {
    GotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
