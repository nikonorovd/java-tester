package ru.neolant.addressbook.tests;


import org.testng.annotations.*;


public class ContactsCreationTests extends ContacsBase {

    @Test
    public void testContacts() {

        gotoNewPage();
        fillAddNewForm(new AddNewData("name", "leen", "keet", "nnn", "art", "Lenina1", "08", "07", "06"));
        submitAddNew();
        returnAddNew();
        logout();
    }

}
