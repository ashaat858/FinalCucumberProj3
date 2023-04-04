package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.TestBase;

public class StepDefenition2 extends TestBase {
	MainPage mainpage;
	
	@Before
	public void BeforeRun() {
		initDriver();
		mainpage = PageFactory.initElements(driver, MainPage.class);
	
}
	@Given("the Set White Background button exists")
	public void user_is_on_the_techfios_login_page() {
		
		driver.get("https://techfios.com/test/104/");
	}

	@When("I click on the white button")
	public void I_Click_On_white_Button() {
		
		mainpage.clickWhitePageButton();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	@Then("the background color will change to white")
	public void the_background_color_will_change_to_sky_blue() {
		takeScreenshot(driver);	
		TearDown();
	}
	

}
