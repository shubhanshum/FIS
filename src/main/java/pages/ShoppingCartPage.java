package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(@alt,'shopping cart contains')]")
	WebElement cart;
	
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getItemsAddedCount() {
		String altValue=cart.getAttribute("alt").toString().trim();
		String[] str=altValue.split("contains");
		return str[1];
	}
}
