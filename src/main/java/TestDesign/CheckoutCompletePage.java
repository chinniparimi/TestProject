package TestDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	
	WebDriver driver;
	public CheckoutCompletePage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.xpath("//*[text()='Back Home']")).click();
	@FindBy(xpath="//*[text()='Back Home']")
	WebElement backHome_button;
	
	public void backHome()
	{
      backHome_button.click();
	}

}
