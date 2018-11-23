package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.model.TestBase;

public class DeleteContactsTests extends TestBase {


  @Test
  public void testDeleteContacts() throws Exception {
    wd.get("http://localhost/addressbook/");
    selectContact();
    deleteContacts();
    returnHomePage();
  }


}
