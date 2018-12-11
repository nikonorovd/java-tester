package ru.neolant.addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelpeBase{

    public SessionHelper(WebDriver wd) {
        super(wd);

    }
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"),password);
        click(By.xpath("//input[@value='Login']"));
    }
}
