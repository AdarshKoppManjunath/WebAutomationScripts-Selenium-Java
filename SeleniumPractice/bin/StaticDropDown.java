import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromDriver Path.
		String filepath = "C://Users//user//Downloads//chromedriver_win32 (1)//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",filepath);
		//Create Driver Object.
		WebDriver driver = new ChromeDriver();
		String webpage="https://www.cheapoair.ca/";
		driver.get(webpage);
		driver.findElement(By.id("travellerButton")).click();
		WebElement staticDropdown=driver.findElement(By.cssSelector("select[id='Class']"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("First");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		driver.quit();
	
	}

}
	