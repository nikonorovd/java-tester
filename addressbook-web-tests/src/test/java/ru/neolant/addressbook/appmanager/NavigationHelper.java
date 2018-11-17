package ru.neolant.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void GotoGroupPage() {
        click (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]"));
    }
}
