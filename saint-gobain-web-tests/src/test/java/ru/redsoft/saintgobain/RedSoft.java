package ru.redsoft.saintgobain;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class RedSoft {
	WebDriver wd;

	@BeforeMethod
	public void setUp() {
		String browser = BrowserType.FIREFOX;
		if (browser == BrowserType.FIREFOX) {
			wd = new FirefoxDriver();
		}else if (browser == BrowserType.CHROME){
			wd = new ChromeDriver();
		}else if (browser == BrowserType.IE){
			wd = new InternetExplorerDriver();
		}
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void testNew() throws Exception {
		goToHomePage();
		goToGidroizolyzionnieMateriali();
		addOneItem();
		selectPickupPechatniki();
		сheckout();
		consentAndContinue();
		selectCashlessPayments();
		finishCheckout();
	}

	private void finishCheckout() {
		wd.findElement(By.name("id=edit-continue"));
	}

	private void selectCashlessPayments() {
		wd.findElement(By.name("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Картой при получении'])[1]/following::div[2]"));
	}

	private void consentAndContinue() {
		wd.findElement(By.name("id=edit-customer-profile-billing-agreement"));
		wd.findElement(By.name("id=edit-continue"));
	}

	private void сheckout() {
		wd.findElement(By.name("id=edit-checkout"));
	}

	private void selectPickupPechatniki() {
		wd.findElement(By.name("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Доставка Saint-Gobain'])[1]/following::div[2]"));
	}

	private void addOneItem() {
		wd.findElement(By.name("xpath=(.//*[normalize-space(text()) and normalize-space(.)='балла'])[1]/following::span[1]"));
		wd.findElement(By.name("link=▲"));
		wd.findElement(By.name("xpath=(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::span[2]"));
	}

	private void goToGidroizolyzionnieMateriali() {
		wd.findElement(By.name("link=Гидроизоляционные материалы и грунтовки"));
	}

	private void goToHomePage() {
		wd.get("https://shop.saint-gobain.ru/");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		wd.quit();
	}
}
