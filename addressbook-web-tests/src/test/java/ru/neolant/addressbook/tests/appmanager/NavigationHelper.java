package ru.neolant.addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {

        click(By.linkText("groups"));
    }

    public void gotoAddNew() {
        click(By.linkText("add new"));
    }
}