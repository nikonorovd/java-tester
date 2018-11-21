package ru.neolant.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{


    public SessionHelper(FirefoxDriver wd) {

        this.wd = wd;
    }
    public void login(String username, String password) {
        type(By.name("user") , username);
        type(By.name("pass"), password);
         }
}
