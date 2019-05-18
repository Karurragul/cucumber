package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer  {
	
	
	
	
	
	@Given("The user is in telecom Homepage")
	public void the_user_is_in_telecom_Homepage() {
		
		Base.driver.get("http://www.demo.guru99.com/telecom/");
	   
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		Base.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("The user is filling all the fields")
	public void the_user_is_filling_all_the_fields() throws Exception {
		Base.driver.findElement(By.xpath("//label[@for='done']")).click();
		Base.driver.findElement(By.id("fname")).sendKeys("geetha");
		Base.driver.findElement(By.id("lname")).sendKeys("anjali");
		Base.driver.findElement(By.id("email")).sendKeys("geetha12@gmail.com");
	   //
		Base.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("chennai");
		Base.driver.findElement(By.id("telephoneno")).sendKeys("9751660421");
	    
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		
		Base.driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("The user should see the id is generated")
	public void the_user_should_see_the_id_is_generated() {
		Assert.assertTrue(Base.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	   
	}

}
