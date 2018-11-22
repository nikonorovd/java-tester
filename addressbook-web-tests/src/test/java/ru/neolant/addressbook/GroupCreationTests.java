package ru.neolant.addressbook;



import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        GotoGroupPage();
        initGroupCreation();
        FillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnGroupPage();
        logout();
    }

}
