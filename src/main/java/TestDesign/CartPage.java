package TestDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.xpath("//*[text()='Checkout']")).click();
	
	@FindBy(xpath="//*[text()='Checkout']")
	WebElement Checkout;

	public void checkOut() {
		// TODO Auto-generated method stub
		Checkout.click();
	}
}
