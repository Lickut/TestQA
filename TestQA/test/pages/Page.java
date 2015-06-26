package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public boolean elementIsPresentById(final String idLocator) {
		return (driver.findElements(By.id(idLocator)).size() != 0);
	}
}