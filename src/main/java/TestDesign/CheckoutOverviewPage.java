package TestDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	
	WebDriver driver;
	public CheckoutOverviewPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.xpath("//*[text()='Finish']")).click();
	@FindBy(xpath="//*[text()='Finish']")
	WebElement Finish_button;

	public void overView() {
		// TODO Auto-generated method stub
		Finish_button.click();
	}
}
