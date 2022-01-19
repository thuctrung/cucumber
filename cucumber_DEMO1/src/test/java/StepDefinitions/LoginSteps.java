package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
	 WebDriver driver= null;
	 String projectPath = System.getProperty("user.dir");
	@SuppressWarnings("deprecation")
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\trung.trinh22\\geckodriver.exe");
	    driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_login_page() throws Throwable {
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("hello world");
	}

	@And("^user enters username and Password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
		driver.findElement(By.id("SubmitLogin")).click();   
		System.out.println("hello world 1");
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
    	Object actual = null;
		Assert.assertEquals(exp_message, actual);
        driver.quit(); 
		System.out.println("hello world 1");
	}

}
