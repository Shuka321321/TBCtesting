package SeleniumFirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This program checks if the home button
 * changes design when we move the cursor 
 * on it.
 */

public class SeleniumSecondScript {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//setup
		testComandsClass.setup();
		testComandsClass.openWebsite("http://the-internet.herokuapp.com");
		
		//click Shifting Content
		testComandsClass.clickElement("#content > ul > li:nth-child(39) > a");
		//click Menu Element
		testComandsClass.clickElement("#content > div > a:nth-child(3)");
		
		//search home button
		WebElement homeBtn = testComandsClass.fElement("#content > div > ul > li:nth-child(1) > a");
		String homeBtnColor = testComandsClass.getElementColor(homeBtn);
		Thread.sleep(1500);
		
		//mouse over
		//Actions action = new Actions(driver);
		//action.moveToElement(homeBtn).build().perform();
		testComandsClass.mouseHover(homeBtn);
		Thread.sleep(1500);
		//check button color while mouse hover.
		String homeBtnColorHovered = testComandsClass.getElementColor(homeBtn);;  
		
		if(homeBtnColor.equals(homeBtnColorHovered)) {
			System.out.println("Home button did not changed color");
		} else {
			System.out.println("Home button changed color");
		}
	}
}
