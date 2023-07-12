package TestDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

WebDriver driver;
public InventoryPage(WebDriver driver) {
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
/*driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();*/

		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		WebElement addToCart;
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		WebElement shoppingCartLink;

		public void addProuct() {
			// TODO Auto-generated method stub
			addToCart.click();
			shoppingCartLink.click();
		}
		
	

}
