package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	@FindBy(id = "gh-ac")
	WebElement searchTextField;
	
	@FindBy(id = "gh-btn")
	WebElement searchButton;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterTextInSearchField(String text) {
		searchTextField.sendKeys(text);
	}
	
	public void clickOnsearchButton() {
		searchButton.click();
	}
}
