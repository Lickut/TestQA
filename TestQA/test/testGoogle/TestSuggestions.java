package testGoogle;



import java.util.concurrent.TimeUnit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.searcher.ResultsPage;
import com.searcher.SearchPage;

@RunWith(JUnitParamsRunner.class)
public class TestSuggestions {
	private static WebDriver driver;
	private static String baseURL = "http://www.google.com/webhp?complete=1&hl=en";

	@Before
	public void setUp() throws Exception {
		driver.get(baseURL);
	}

	@BeforeClass
	public static void setAllUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearAllDown() throws Exception {
		driver.close();
	}

	@Test
	@Parameters({ "Cheese", "(", "[" })
	public void testSuggestionsExists(String searchQuery) {
		SearchPage searchPage = PageFactory.initElements(driver,
				SearchPage.class);
		ResultsPage resultpage = searchPage.search(searchQuery);
		System.out.println(resultpage.getSuggestions());
		assertTrue(resultpage.getSuggestions().size() != 0);
	}
}
