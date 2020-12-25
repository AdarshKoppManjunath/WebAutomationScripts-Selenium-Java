import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//ChromDriver Path.
		String filepath = "C://Users//user//Downloads//chromedriver_win32 (1)//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",filepath);
		//Create Driver Object.
		WebDriver driver = new ChromeDriver();
		String webpage="https://www.spicejet.com/";
		driver.get(webpage);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.close();
		driver.quit();
		
	}

}
	