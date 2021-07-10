package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.HomePage;
import pageFactory.LoginPage_PF;

public class LoginDemoStep_PF  {
	
	  WebDriver driver;
	  LoginPage_PF login ;
	  HomePage logout;
	  
	  @Given("browser is open") 
	  public void browser_is_open() {
	 
		System.out.println("**** I am inside Page Factory ********* ");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanj\\eclipse-workspace\\project_CC\\src\\test\\resources\\driver\\chromedriver.exe"); 
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  
	  
	  //driver.manage().window().maximize(); 
	  }
	  
	  @And("user is on login page")
	  public void user_is_on_login_page() {
	  
		 driver.navigate().to("https://example.testproject.io/web/");
	  
	  }
	  
	  @When("^user enters (.*) and (.*)$") 
	  public void user_enters_username_and_password(String username, String password) throws InterruptedException { 
		  
		  login = new LoginPage_PF(driver);
		  login.enterUsername(username);
		  login.enterpassword(password);
		  
		  
	//  driver.findElement(By.id("name")).sendKeys(username);
	 // driver.findElement(By.id("password")).sendKeys(password);
	  
	  Thread.sleep(2000);
	  
	  
	  
	  }
	  
	  @And("user clicks on login") 
	  public void user_clicks_on_login() {
		  
		  login.clickOnLogin();
		  
	 // driver.findElement(By.id("login")).click();
	  
	  }
	  
	  @Then("user is navigated to the home page") 
	  public void user_is_navigated_to_the_home_page() throws InterruptedException{
	  
		  logout = new HomePage(driver);	  
	logout.checkLogoutsDisplay();
	
	//driver.findElement(By.id("logout")).isDisplayed(); Thread.sleep(2000);
	  
	  driver.close(); 
	  driver.quit();
	  
	  
	  }
	 
}
