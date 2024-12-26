package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='s-item__link' and not (@tabindex)]")
	List<WebElement> booksLinks;
	
	@FindBy(id = "gh-btn")
	WebElement searchButton;
	
	public BooksPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFirstBook() {
		booksLinks.get(0).click();
	}
}
