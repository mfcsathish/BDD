package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WrapperClass;

public class Hooks extends WrapperClass{
	

	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        driver.quit();
    }

	
	
}
	
	



