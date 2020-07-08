package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testComandsClass {

	public static WebDriver driver;

	public static void setup() {
		//setup
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void openWebsite(String siteName) throws InterruptedException {
		driver.navigate().to(siteName);
		driver.manage().window().maximize();	
		Thread.sleep(1500);
	}
	
	public static void clickElement(String elementCssName) {
		driver.findElement(By.cssSelector(elementCssName)).click();
	}
	
	public static WebElement fElement(String elementCssName) {
		WebElement element = driver.findElement(By.cssSelector(elementCssName));
		return element;
	}

	public static String getElementColor(WebElement i) {
		String elementColor = i.getCssValue("color");
		return elementColor;
	}

	public static void mouseHover(WebElement i) {
		Actions action = new Actions(driver);
		action.moveToElement(i).build().perform();
	}

}
