package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;

public class ContactsDeletionTests extends ContacsBase{



  @Test
  public void testContactsDeletion() {

    selectedContact();
    deletedContact();

  }

}