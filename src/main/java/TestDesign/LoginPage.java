package TestDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
public LoginPage(WebDriver driver) {
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
		
		/*WebElement username= driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		WebElement login= driver.findElement(By.xpath("//input[@id='login-button']")).click();*/
		
		@FindBy(xpath="//input[@placeholder='Username']")
		WebElement userName;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement passWord;
		
		@FindBy(xpath="//input[@id='login-button']")
		WebElement login;
		
		public void loginApplication(String username, String password)
		{
			userName.sendKeys(username);
			passWord.sendKeys(password);
			login.click();
		}
		
		public void goTo() {
			
			driver.get("https://www.saucedemo.com/");
		}
	

}
