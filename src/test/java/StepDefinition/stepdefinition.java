package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.hooks;

public class stepdefinition {
	
	WebDriver driver = hooks.driver;
	
	@Given("^Open the elearningm(\\d+) site$")
	public void open_the_elearningm_site(String url) throws Throwable {
	    driver.get("http://elearningm1.upskills.in/");
	    Thread.sleep(3000);
	}

	@And("^Click on Signup$")
	public void click_on_Signup() throws Throwable {
		driver.findElement(By.linkText("Sign up!")).click();
		Thread.sleep(3000);
	}

	@When("^I provide required fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" in step$")
	public void i_provide_required_fields_in_step(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		driver.findElement(By.name("firstname")).sendKeys("Sas");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("S");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("sas@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Sas");
		Thread.sleep(1000);
		driver.findElement(By.id("pass1")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.id("pass2")).sendKeys("1234");
		Thread.sleep(3000);
	}

	@Then("^Click on Register$")
	public void click_on_Register() throws Throwable {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}
    
	@Then("^Confirmation message comes$")
	public void confirmation_message_comes() throws Throwable {
		Thread.sleep(3000);
	}

	@When("^select user dropdown in right side of the screen$")
	public void select_user_dropdown_in_right_side_of_the_screen() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]")).click();
		Thread.sleep(2000);
	}
	@Then("^Clik on Homepage$")
	public void clik_on_Homepage() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a")).click();
	    Thread.sleep(3000);
	}
	
	@Then("^Click on Profile$")
	public void click_in_Profile() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"profile_block\"]/div[1]/a")).click();
		Thread.sleep(3000);
	}



	@When("^send a message on click of compose$")
	public void send_a_message_on_click_of_compose() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
	}

	@When("^provide required fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" in step$")
	public void provide_required_fields_in_step(String arg1, String arg2, String arg3) throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("Sasira");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"compose_message_title\"]")).sendKeys("Cucumber Test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys(" Hi Sasira,\n Cucumber Assignment.\n From\n Sowmya");
		Thread.sleep(3000);
	}

	@Then("^click on Send message$")
	public void click_on_Send_message() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"compose_message_compose\"]")).click();
		Thread.sleep(3000);
	}

	@When("^sent message should show$")
	public void sent_message_should_show() throws Throwable {
		Thread.sleep(3000);
	}




}
