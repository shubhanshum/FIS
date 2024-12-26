package tests;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {

	public static void main(String[] args) {
		RestAssured.baseURI="api.coindesk";
		RestAssured.basePath="v1";
		RequestSpecification request=RestAssured.given();
		
		Response response=request.get("bpi/currentprice.json");
		
		String bpiUSD=response.jsonPath().getString("bpi.USD.rate");
		String bpiGBP=response.jsonPath().getString("bpi.GBP.rate");
		String bpiEUR=response.jsonPath().getString("bpi.EUR.rate");
		
		String desc=response.jsonPath().getString("bpi.GBP.description");
		
		Assert.assertEquals(bpiUSD, "95,852.243");
		Assert.assertEquals(bpiGBP, "76,440.247");
		Assert.assertEquals(bpiEUR, "91,957.862");
		Assert.assertEquals(desc, "British Pound Sterling");
	}
	
}
