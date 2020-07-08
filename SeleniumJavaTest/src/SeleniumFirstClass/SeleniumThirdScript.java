package SeleniumFirstClass;

import org.openqa.selenium.WebElement;

/*
 * This program checks if image reacts on "click here" button.
 */

public class SeleniumThirdScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		testComandsClass.setup();
		testComandsClass.openWebsite("http://the-internet.herokuapp.com");
		
		//click Shifting Content
		testComandsClass.clickElement("#content > ul > li:nth-child(39) > a");
		//click an image
		testComandsClass.clickElement("#content > div > a:nth-child(6)");
		
		//find image on canvas
		WebElement imageBeforClick = testComandsClass.fElement("#content > div > img");
	    //get x coordinate of image.
		int xcorBeforClick = getxCoordinate(imageBeforClick);
	   
		//press "click here" button.
		testComandsClass.clickElement("#content > div > p:nth-child(4) > a");
		
		//get image x coordinate
		WebElement imageAfterClick = testComandsClass.fElement("#content > div > img");
		int xcorAfterClick = getxCoordinate(imageAfterClick);
		
		//check image moving
		if(xcorBeforClick != xcorAfterClick) {
			System.out.println("Image moved");
		} else {
			System.out.println("Image did not moved");
		}
	}

	public static int getxCoordinate(WebElement i) {
		org.openqa.selenium.Point testImage = i.getLocation();
		int xcor = testImage.getX();
		System.out.println("testImage's Position from left side " + xcor +" pixels.");
		return xcor;
	}
	
}

