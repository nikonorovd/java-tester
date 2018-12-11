package ru.neolant.addressbook.tests.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactsModificationTests extends TestBase{
    private WebDriver wd;


    @Test
    public void testContactsModificationTests() throws Exception {

        wd.findElement(By.id("11")).click();
        wd.findElement(By.xpath("//input[@value='Login']")).click();
        wd.findElement(By.xpath("//img[@alt='Edit']")).click();
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("name1");
        wd.findElement(By.xpath("(//input[@name='update'])[2]")).click();
        wd.findElement(By.id("logo")).click();
    }

}
