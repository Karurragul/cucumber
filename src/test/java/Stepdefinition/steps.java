package Stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

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

	@Given("the user is in add tariff plan")
	public void the_user_is_in_add_tariff_plan() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\ragul\\Selenium\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		 driver.get("http://www.demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	/*@When("the user fill valid details")
	public void the_user_fill_valid_details() {
	  driver.findElement(By.id("rental1")).sendKeys("2000");
	  driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys("1500");
	  driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys("1400");
	  driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys("200");
	  driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys("2200");
	  driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys("4200");
	  driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys("4900");	 
	 
	}
*/
	/*// below lines for one dimensional List code
	@When("the user fill valid details")
	public void the_user_fill_valid_details(DataTable details) {
		List<String> cusDetail = details.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(cusDetail.get(0));
        driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys(cusDetail.get(1));
        driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys(cusDetail.get(2));
  	  driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys(cusDetail.get(3));
  	  driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys(cusDetail.get(4));
  	  driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys(cusDetail.get(5));
  	  driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys(cusDetail.get(6));	 
  	 // above one dimensional list code
        	}
	*/
	
	///***1d map
	/*@When("the user fill valid details")
	public void the_user_fill_valid_details(DataTable details) {
		Map<String, String> cuDetail  = details.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(cuDetail.get("monthlyrental"));
        driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys(cuDetail.get("freelocalmin"));
        driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys(cuDetail.get("freeinternationalmin"));
  	  driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys(cuDetail.get("freesmspack"));
  	  driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys(cuDetail.get("localperminutescharge"));
  	  driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys(cuDetail.get("Internationalperminutes"));
  	  driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys(cuDetail.get("SMSpercharges"));	 
	}
	*/ 
	//* 1d map
	
	//***scenario outline
	/*@When("the user fill valid details{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_valid_details(String monthlyrental, String freelocalmin, String freeinternationalmin, String freesmspack, String localperminutescharge, String Internationalperminutes, String SMSpercharges ) 
		 { 
	  driver.findElement(By.id("rental1")).sendKeys(monthlyrental);
      driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys(freelocalmin);
      driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys(freeinternationalmin);
  	  driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys(freesmspack);
  	  driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys(localperminutescharge);
  	  driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys(Internationalperminutes);
  	  driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys(SMSpercharges);	 
	}	
	*/	
	//* scenario outline
	
	/*///***2d list
		@When("the user fill valid details")
		public void the_user_fill_valid_details(DataTable details) {
			List<List<String>> cuDetail = details.asLists(String.class);
		  driver.findElement(By.id("rental1")).sendKeys(cuDetail.get(1).get(0));
	      driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys(cuDetail.get(1).get(3));
	      driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys(cuDetail.get(1).get(4));
	  	  driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys(cuDetail.get(3).get(5));
	  	  driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys(cuDetail.get(0).get(4));
	  	  driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys(cuDetail.get(2).get(6));
	  	  driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys(cuDetail.get(2).get(4));	 
		}
		
		//* 2d list
	*/	
	///***2d map
		@When("the user fills the valid details")
		public void the_user_fills_valid_details(DataTable details) {
	    	List<Map<String, String>> cuDetail  = details.asMaps(String.class,String.class);
		  driver.findElement(By.id("rental1")).sendKeys(cuDetail.get(1).get("rental1"));
		  driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys(cuDetail.get(1).get("freelocalmin"));
		  driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys(cuDetail.get(1).get("freeinternationalmin"));
		  driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys(cuDetail.get(3).get("freesmspack"));
		  driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys(cuDetail.get(0).get("localperminutescharge"));
		  driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys(cuDetail.get(2).get("Internationalperminutes"));
		  driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys(cuDetail.get(2).get("SMSpercharges"));	 
				}
				
				//* 2d map
	
	@When("the user click submit button")
	public void the_user_click_submit_button() {
	    driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("I validate the outcome")
	public void i_validate_the_outcome() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}
}
