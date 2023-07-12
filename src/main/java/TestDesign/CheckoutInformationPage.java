package TestDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage {
	
	WebDriver driver;
	public CheckoutInformationPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/*driver.findElement(By.id("first-name")).sendKeys("anusha");
	driver.findElement(By.id("last-name")).sendKeys("parimi");
	driver.findElement(By.id("postal-code")).sendKeys("500008");
	driver.findElement(By.xpath("//*[@value='Continue']")).click();*/
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(xpath="//*[@value='Continue']")
	WebElement continue_button;
	
	public void yourInformation(String firstname, String lastname, String postalcode)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		postalCode.sendKeys(postalcode);
		continue_button.click();
	}
}
