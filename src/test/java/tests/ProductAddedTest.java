package tests;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.BooksPage;
import pages.LandingPage;
import pages.ShoppingCartPage;

public class ProductAddedTest extends BaseTest{

	LandingPage landingPage=new LandingPage(getDriver());
	BooksPage booksPage=new BooksPage(getDriver());
	AddToCartPage addToCartPage=new AddToCartPage(getDriver());
	ShoppingCartPage shoppingPage=new ShoppingCartPage(getDriver());
			
	@Test
	public void productAddedTest() {
		landingPage.enterTextInSearchField(utility.Utilities.getPropFileData("ProductName"));
		landingPage.clickOnsearchButton();
		booksPage.clickOnFirstBook();
		addToCartPage.clickOnAddToCartButton();
		String count=shoppingPage.getItemsAddedCount();
		System.out.println(count);
	}
}
