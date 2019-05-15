package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	static WebDriver driver;
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\ragul\\Selenium\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.demo.guru99.com/telecom/");
	}
	
	@Given("the user click on add feature")
	public void the_user_click_on_add_feature() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();;
	}

	@When("the user fill the valid details")
	public void the_user_fill_the_valid_details() {
	   driver.findElement(By.xpath("//label[text()='Done']")).click();
	   driver.findElement(By.id("fname")).sendKeys("Ragul");
	   driver.findElement(By.id("lname")).sendKeys("Kulandaivelu");
	   driver.findElement(By.id("email")).sendKeys("karurragul@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("kelambakkam");
	   driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("karur");
	   driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("12345678");
	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}



}
