package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalPage {
	
	public WebDriver driver;
	
By Alert =	By.cssSelector("div[class*='alert']");


public PortalPage(WebDriver driver) {
	this.driver = driver;
}

public WebElement getAlert() {
	return driver.findElement(Alert);
}

}
