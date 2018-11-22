package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.model.TestBase;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.GotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnGroupPage();
  }

  
}


