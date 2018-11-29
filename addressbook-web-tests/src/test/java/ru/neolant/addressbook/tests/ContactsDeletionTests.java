package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.tests.ContacsBase;

public class ContactsDeletionTests extends ContacsBase {



  @Test
  public void testContactsDeletion() {

    contactsM.getContactHelper().selectedContact();
    contactsM.getContactHelper().deletedContact();

  }

}