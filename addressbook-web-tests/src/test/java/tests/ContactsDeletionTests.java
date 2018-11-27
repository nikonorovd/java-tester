package tests;

import org.testng.annotations.Test;

public class ContactsDeletionTests extends ContacsBase{



  @Test
  public void testContactsDeletion() {

    contactsM.selectedContact();
    contactsM.deletedContact();

  }

}