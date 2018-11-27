package tests;

import org.testng.annotations.Test;
import tests.ContacsBase;

public class ContactsModificationTests extends ContacsBase {
    @Test
    public void testContactsModification(){
       contactsM.getContactHelper().selectedContact();

        
    }


}
