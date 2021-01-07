

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class AssertionsUsage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromDriver Path.
		String filepath = "C://Users//user//Downloads//chromedriver_win32 (1)//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filepath);
		//Create Driver Object.
		WebDriver driver = new ChromeDriver();
		String webpage="https://www.spicejet.com/";
		driver.get(webpage);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);	
		driver.close();
		driver.quit();
}
}
	