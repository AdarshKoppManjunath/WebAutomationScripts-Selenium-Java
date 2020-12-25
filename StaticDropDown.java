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
		String webpage="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(webpage);
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	
	}

}
	