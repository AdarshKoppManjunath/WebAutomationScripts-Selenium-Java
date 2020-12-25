

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//ChromDriver Path.
		String filepath = "C://Users//user//Downloads//chromedriver_win32 (1)//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",filepath);
		//Create Driver Object.
		WebDriver driver = new ChromeDriver();
		String webpage="https://www.cheapoair.ca/";
		driver.get(webpage);
		driver.findElement(By.xpath("//input[@id='from0']")).sendKeys("Prince");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("ul[class='suggestion-box__list']"));
		
		
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("YPA"))
			{
				option.click();
				break;
			}
		Thread.sleep(2000);
				
	}
		driver.close();
		driver.quit();
}
}
	