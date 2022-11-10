package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.HooksClass;
import junit.framework.Assert;

public class LoginValidation {

	WebDriver driver = HooksClass.driver;

	
	@Given("User should be able to navigate to demo url")
	public void user_should_be_able_to_navigate_to_demo_url() {
	    driver.get("http://elearningm1.upskills.in/index.php");
	}

	@Given("User should click on Sing up link")
	public void user_should_click_on_Sing_up_link() {
		driver.findElement(By.xpath("//a[text()=\" Sign up! \"]")).click();
	}

	@When("User enters First name {string} and {string}")
	public void user_enters_First_name_and(String firstName, String lastName) {
	    driver.findElement(By.name("firstname")).sendKeys(firstName);
	    driver.findElement(By.name("lastname")).sendKeys(lastName);
	}

	@When("User enters Email {string} and Username {string}")
	public void user_enters_Email_and_Username(String email, String userName) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("username")).sendKeys(userName);
	}

	@When("User enters Password {string} and {string}")
	public void user_enters_Password_and(String pass, String confirmPass) {
		driver.findElement(By.name("pass1")).sendKeys(pass);
		driver.findElement(By.name("pass2")).sendKeys(confirmPass);
	}

	@When("User should click on Register button")
	public void user_should_click_on_Register_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("User should be able to Sign up")
	public void user_should_be_able_to_Sign_up() {
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()=\"Your personal settings have been registered.\"]")).isDisplayed());
		driver.findElement(By.id("logout_button")).click();  
	}
	
	@When("User enters Username {string} and Password {string}")
	public void user_enters_Username_and_Password(String userName, String password) {
	    driver.findElement(By.id("login")).sendKeys(userName);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User should click on Login")
	public void user_should_click_on_Login() {
		driver.findElement(By.name("submitAuth")).click();  
	}

	@When("User should click Inbox and then Compose message")
	public void user_should_click_Inbox_and_then_Compose_message() {
		driver.findElement(By.xpath("//a[text()=\"Inbox \"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Compose message\"]")).click();
	}

	@When("User should enter Send to {string}")
	public void user_should_enter_Send_to(String sendTo) {
		 driver.findElement(By.className("select2-search__field")).sendKeys(sendTo);
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[text()=\"amit xyz\"]")).click();
	}

	@When("User should enter Subject {string}")
	public void user_should_enter_Subject(String subject) {
		 driver.findElement(By.xpath("//input[@name=\"title\"]")).sendKeys(subject);
	}

	@Then("User should be able to send the email successfully")
	public void user_should_be_able_to_send_the_email_successfully() {
		driver.findElement(By.name("compose")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'The message has been sent to')]")).isDisplayed());
	}



}
