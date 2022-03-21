package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WrapperClass;

public class FB_Login_WithoutValidData extends WrapperClass {

// Given Open FB URL



	@Given("Open FB URL")

	public void loginToFB() {

		

// type jsut recharge url

		driver.get("https://www.facebook.com/");

	}

// When User enter invalid credentials

	@When("User enter invalid credentials")

	public void typeuserdetails()  {

		driver.findElement(By.name("email")).sendKeys("mfc.sathish@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Br439476#");
		

	}

// And Click on Login button	

	@And("Click on Login button")

	public void click_on_login_buttton() throws Exception {

		driver.findElement(By.name("login")).click();
		
		Thread.sleep(8000);

	}

// Then Application should display the validation Message

	@Then("Application should display the validation Message")

	public void validaterrormsg() {
		
		
		if( driver.findElements(By.linkText("Forgotten password")).size() > 0
	 			  || driver.findElements(By.linkText("Find your account and login")).size() > 0) {
	 				  
	   System.out.println("Error Message displayed :Given credentials are invalid");
	   
	  }else {
		  
		  System.out.println("Error Message not displayed :Given credentials are valid");
	  }

	}

}
