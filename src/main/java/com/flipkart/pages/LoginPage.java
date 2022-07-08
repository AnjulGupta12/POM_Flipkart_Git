package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class LoginPage extends TestBase {																//SINCE TESTBASE IS PARENT FILE 
	
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));								//IMPLICITE WAIT OF 10 SEC (MEANS 10SEC ON EVERY PAGE )

	
	// WE ARE SAVING USERNAME, PASSWORD AND LOGIN BUTTON XPATH AT ONE PLACE 
	//SO THAT IF IN FUTURE WE HAD USE THESE XPATH NUMEROUS TIME AND ADMIN CHANGE THE XPATH OF THAT PARTICULAR XPATH 
	//THEN WE CAN CHANGE IT AT ONE PLACE(HERE)
	//IT DEC COMPLEXITY AND TIME IN LATER PART
	// USING IT AS VARIABLE
	By userNameLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");		
	By passwordLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButtonLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");
	
	
	public boolean validateLogin(String uName, String pwd) {	
		wait(2000);																			//IT(Wait) IS BEING CALLED FROM TestBase.java FILE for 2000mili sec that is 2 sec
		driver.findElement(userNameLoc).sendKeys(uName);									// TO ENTER USERNAME BY USER 
		wait(2000);
		driver.findElement(passwordLoc).sendKeys(pwd);
		wait(2000);
		driver.findElement(loginButtonLoc).click();											//TO CLICK LOGIN BUTTON
		
		

																						// validating Flipkart home page
		boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));			
		//WE HAD RANDOMLY GIVEN ANY XPATH OF ANY ELEMENT TO ENSURE THAT PARTICULAR WEBSITE PAGE IS OPEN 
		}catch(TimeoutException te) {
			captureScreenshot("Login Failure");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).getText();		
		// USER FIELD VALUE
		return actResult.equals("Anjul");
		}
		else 
		return false;
	}
	

}


/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~THE END ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

/*
Set<String> allWindows = driver.getWindowHandles(); // unique string parent and child window

		System.out.println("No of widnows: " + allWindows.size());

		for (String obj : allWindows) { // obj = p1, c1
			if (!obj.equals(parentWindow)) { // it is true only for child window
				System.out.println("Title of Child Window is: " + driver.switchTo().window(obj).getTitle());
				System.out.println(
						"Element in Child Window is: " + driver.findElement(By.xpath("/html/body/div/h3")).getText());
			}
		}







 */
