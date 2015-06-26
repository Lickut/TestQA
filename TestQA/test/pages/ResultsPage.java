package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class ResultsPage extends Page{
 
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
 
    public List<String> getSuggestions(){
    	List<String> suggestionList= new ArrayList<String>();
    	List<WebElement> allSuggestions = driver.findElements(By
				.xpath("//div[@class='sbqs_c']"));
		for (WebElement suggestion : allSuggestions) {
			suggestionList.add(suggestion.getText());
		}
		return suggestionList;
    }
}