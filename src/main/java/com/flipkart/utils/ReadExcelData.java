package com.flipkart.utils;

public class ReadExcelData {

}

/*

From Faculty (Olympus) to Everyone 03:09 PM
below code to implement extent report in loginpage.java
try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));
		} catch (TimeoutException te) {
			String screenShotName = captureScreenshot("Login Failure");
			System.out.println("Screenshot Name : " + screenShotName);
			flagResult = false;

			test = extent.createTest("Flipkart Login Failure", "Login is failed due to invalid credentials");

			try {
				test.fail("Login Failure", MediaEntityBuilder
						.createScreenCaptureFromPath(".\\src\\test\\resources\\Screenshots\\" + screenShotName + ".png")
						.build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				test.addScreenCaptureFromPath(".\\src\\test\\resources\\Screenshots\\" + screenShotName + ".png");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
if (flagResult) {
			test = extent.createTest("Flipkart Login Success", "Login is success");
			test.log(Status.PASS, "Login Successfull");
			String actResult = driver
					.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"))
					.getText();
			return actResult.equals("Senthil");
		} else
			return false;
	}

}
From 1265878_varun.lulla to Everyone 03:09 PM
sir plz share entire zip file
From Faculty (Olympus) to Everyone 03:13 PM
extent report
	}
}


*/