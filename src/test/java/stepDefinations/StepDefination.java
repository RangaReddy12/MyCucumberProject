package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	@Given("^user navigates orangehrm url$")
	public void user_navigates_orangehrm_url() throws Throwable {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://orangehrm.qedgetech.com/");
	    Thread.sleep(4000);
	}

	@When("^user logs in using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_logs_in_using_Username_as_and_Password_as(String user, String pass) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys(user);
	    driver.findElement(By.name("txtPassword")).sendKeys(pass);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
	}

	@When("^user click Admin$")
	public void user_click_Admin() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Thread.sleep(3000);
	}

	@When("^user click Add button$")
	public void user_click_Add_button() throws Throwable {
		driver.findElement(By.name("btnAdd")).click();
		Thread.sleep(3000);
	}

	@When("^user Enter employeename as \"([^\"]*)\" and Username as\"([^\"]*)\" and password as\"([^\"]*)\" and Confirm Password as \"([^\"]*)\"$")
	public void user_Enter_employeename_as_and_Username_as_and_password_as_and_Confirm_Password_as(String employeename, String username, String password, String cpassword) throws Throwable {
	    driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys(employeename);
	    driver.findElement(By.name("systemUser[userName]")).sendKeys(username);
	    driver.findElement(By.name("systemUser[password]")).sendKeys(password);
	    Thread.sleep(3000);
	    driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys(cpassword);
	    
	}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
		driver.findElement(By.name("btnSave")).click();
		Thread.sleep(3000);
	}

	@Then("^user validate url$")
	public void user_validate_url() throws Throwable {
	   String expected ="viewSystemUsers";
	   String actuaL = driver.getCurrentUrl();
	   if(actuaL.contains(expected))
	   {
		   System.out.println("Add user success::"+expected+"   "+actuaL);
	   }
	   else
	   {
		   System.out.println("Add user Fail::"+expected+"   "+actuaL);
	   }
		   
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	    driver.close();
	}


}
