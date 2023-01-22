package StepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Stepdefinitioin {
	
	WebDriver driver = new ChromeDriver();
	@Given("browser is initiated  by the user")
	public void browser_is_initiated_by_the_user() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\\\notes\\\\chromedriver.exe");

		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/admin/viewSystemUsers#");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    System.out.println("Browser is Initiated");
	}

	@When("Valied used Login ID and Password")
	public void valied_used_login_id_and_password() {
		
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		 System.out.println("loged in ");
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {

		String str =driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM')]")).getText().toString();
		System.out.println(str);
		
		driver.close();
		driver.quit();
	}
	@When("i click on {string} buttom")
	public void i_click_on_buttom(String add) {
		
	   driver.findElement(By.xpath("//input[contains(@id,\"btnAdd\")]")).click();
	   System.out.println("Clicked on"+add);
	
	}

	@Then("enter name as  {string}")
	public void enter_name_as(String name) {
		
		 driver.findElement(By.xpath("//input[contains(@class,\"formInputText inputFormatHint ac_input\")]")).sendKeys("SANJEEV KUMAR PRASAD");
		   driver.findElement(By.xpath("(//input[contains(@class,\"formInputText\")])[2]")).sendKeys(name);
		   System.out.println("name added ");
	}

	@Then("enter password as  {string}")
	public void enter_password_as(String password) {
		   driver.findElement(By.xpath("(//input[contains(@class,\"formInputText password\")])[1]")).sendKeys(password);
		   System.out.println("password added");
	}

	@Then("confirm the password  {string}")
	public void confirm_the_password(String confirm) {
		   driver.findElement(By.xpath("(//input[contains(@class,\"formInputText password\")])[2]")).sendKeys(confirm);
		   System.out.println("confirmed password");
	}

	@Then("Click {string}")
	public void click(String string) {
		
		 driver.findElement(By.xpath("//input[contains(@class,\"addbutton\")]")).click();
		 
		 System.out.println("successfully added the employee");
	
		 driver.quit();
	}

	

}
