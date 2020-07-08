package SeleniumFirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// This program checks the image uploading
 
public class SeleniumFirstScript {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//setup
		testComandsClass.setup();
		testComandsClass.openWebsite("http://the-internet.herokuapp.com");
		
		//find and click file upload button
		testComandsClass.clickElement("#content > ul > li:nth-child(18) > a");
		
		//upload the file path
		WebElement fileUpload = testComandsClass.fElement("#file-upload");
		fileUpload.sendKeys("C:/Users/gshuk/Desktop/test.png");
		
		//upload button click
		testComandsClass.clickElement("#file-submit");
		
		//check upload result
		if(testComandsClass.fElement("#content > div > h3") != null) {
			System.out.println("File was uploaded");
		} else {
			System.out.println("!!! File wasn't uploaded !!! ");
		}
	}
	
	
}
