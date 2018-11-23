package ru.neolant.addressbook.tests;

import org.testng.annotations.Test;
import ru.neolant.addressbook.model.TestBase;

public class ModificationContactsTests extends TestBase {


    @Test
    public void testModificationContactsTests() throws Exception {
        wd.get("http://localhost/addressbook/");
        editContact();
        clearFirstName();
        renameFirstName("Mark");
        updateContactPage();
        returnHomaPage();
    }

}
