package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WrapperClass;

public class FB_Login_with_ValidData extends WrapperClass {
	
	
	

//	    When User enter valid credentials
//	    Then Application should not display the validation Message
	
// Delete the common one from fblogin.feature
	
	// When User enter valid credentials

		@When("User enter valid credentials")

		public void typeuserdetails()  {

			driver.findElement(By.name("email")).sendKeys("sachu611@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("sathishsp611982");
			

		}
		
		
		// Then Application should not display the validation Message

		@Then("Application should not display the validation Message")

		public void validationmsg() {
			
			
			if( driver.findElements(By.linkText("Forgotten password")).size() > 0
			 			  || driver.findElements(By.linkText("Find your account and login")).size() > 0) {
			 				  
			   System.out.println("Error Message displayed :Given credentials are invalid");
			   
			  }else {
				  
				  System.out.println("Error Message not displayed :Given credentials are valid");
			  }

		}


}
