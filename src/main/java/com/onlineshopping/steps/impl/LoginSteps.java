package com.onlineshopping.steps.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	private WebDriver wb = null;
	
	public LoginSteps() {
		System.clearProperty("webdriver.chrome.driver");
	    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_win32/chromedriver.exe");
		wb = new ChromeDriver();
	}
	
	@Given("^user have valid credentials$")
	public void user_have_valid_credentials() throws Throwable {
	    System.out.println("Inside Given");
	  
		
		
		wb.get("http://192.168.11.138:8080");
		wb.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		System.out.println(" SYSO START ");
		
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		System.out.println("Inside When");
		Thread.sleep(1000);
		wb.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		Thread.sleep(1000);
		wb.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);
		
		wb.findElement(ById.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		wb.findElement(ById.id("password")).sendKeys("admin");
		Thread.sleep(1000);
		
		wb.findElements(By.xpath("//span[contains(text(),'Sign in')]")).get(2).click();
		
		
	}

	@Then("^user able to login$")
	public void user_able_to_login() throws Throwable {
		System.out.println("Inside Then");
		
		Assert.assertTrue(wb.findElement(By.xpath("//span[contains(text(),'Welcome, Java Hipster!')]")).isDisplayed());
		
	}

}
