package com.searcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	WebDriver _driver;

	public Page(WebDriver driver) {
		this._driver = driver;
	}

	public boolean elementIsPresentById(final String idLocator) {
		return (_driver.findElements(By.id(idLocator)).size() != 0);
	}
}