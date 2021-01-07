

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromDriver Path.
		String filepath = "C://Users//user//Downloads//chromedriver_win32 (1)//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filepath);
		//Create Driver Object.
		WebDriver driver = new ChromeDriver();
		String webpage="https://www.spicejet.com/";
		driver.get(webpage);
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());	
		driver.close();
		driver.quit();
}
}
	