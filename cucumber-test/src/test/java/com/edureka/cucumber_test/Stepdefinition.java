package com.edureka.cucumber_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.Loginpage;
import PageObjects.BasePage;

public class Stepdefinition 
{
 WebDriver driver;
 Loginpage lp;
 BasePage BP;
 String url = "https://www.amazon.in/";
 @Before
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

	@Given("I am in the login page of url https:\\/\\/www.amazon.in\\/")
	public void openurl(String url) 
	{
	driver.get(url);
	driver.manage().window().maximize();
	lp.uname("swati.d.bajpayee@gmail.com");
	lp.pwd("******");
	
	
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		lp.btncon();
	}


	@Then("I should be successfully logged in")
	public void successfulLogin() {
	    System.out.println("logged in successfully");
	}




}
