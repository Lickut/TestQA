package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Page {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "q")
	private WebElement searchBox; // Search button

	public ResultsPage search(String searchQuery) {
		searchBox.sendKeys(searchQuery);
		return PageFactory.initElements(_driver, ResultsPage.class);
	}

}