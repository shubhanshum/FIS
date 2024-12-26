package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;
	
	@FindBy(id = "atcBtn_btn_1")
	WebElement addCartButton;
	
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCartButton() {
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String)windows.get(1));
		addCartButton.click();
		
	}
}
