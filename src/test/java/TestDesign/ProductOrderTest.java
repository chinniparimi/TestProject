package TestDesign;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductOrderTest extends BaseTest{
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("anusha", "parimi");
	}
	
		@Test(dataProvider="getData")
		public void SubmitOrder(String username, String password, String firstname, String lastname, String postalcode) throws IOException
		{
		extent.createTest("Order Creation");
		LoginPage loginPage= launchApplication();
		loginPage.loginApplication(username, password);

InventoryPage inventoryPage = new InventoryPage(driver);
inventoryPage.addProuct();

CartPage cartPage = new CartPage(driver);
cartPage.checkOut();

CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(driver);
checkoutInformationPage.yourInformation(firstname, lastname, postalcode);

CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
checkoutOverviewPage.overView();

CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
checkoutCompletePage.backHome();
extent.flush();
	}
		public File getScreenshot(String testcaseName) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File file = new File(System.getProperty("user.dir") + "//reports" + testcaseName + ".png");
			FileUtils.copyFile(src, file);
			return file;
		}
		@DataProvider
		public Object[][] getData()
		{
			return new Object[][] {{"standard_user","secret_sauce","anusha","parimi","500008"}};
			
		}
}
