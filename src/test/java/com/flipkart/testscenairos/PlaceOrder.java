package com.flipkart.testscenairos;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProductPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
 
  
  @BeforeClass
  public void setUp() {
	  	launchBrowser();
		navigateToURL();	  
  }

  
  
  
  @AfterClass
  public void tearDown() {
  }
  
  
  
  
  
  @Test
  public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("9456321604", "Flipkart!123");
		Assert.assertTrue(actResult);
	}
  
  @Test
  public void seachProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		searchProductPage.validateSearchProduct("laptop");
	}
	
  @Test
  public void selectProductTest() {
	  SearchProductPage selectProductPage = new SearchProductPage();
	  
	  boolean actResult2 = selectfirst.validateSelect();
	  Assert.assertTrue(actResult2);
  }
  
  @Test
  public void addToCartTest() {
	
			AddToCartPage addToCartPage = new AddToCartPage();
			addToCartPage.validateAddToCart();

  }
  
  @Test
  public void placeOrderTest() {
  }
  
  @Test
  public void makePayment() {
  }
  
  @Test
  public void logoutTest() {
  }

}



/*
 
 <build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M5</version>
				<configuration>
					<suiteXmlFiles>
						<suiteXmlFile>testng.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>


*/
