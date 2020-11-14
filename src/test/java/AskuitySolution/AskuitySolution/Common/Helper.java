package AskuitySolution.AskuitySolution.Common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Condition.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;



public class Helper {
	 public Helper() {
	    }
	public void setUpBrowser() {
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
       
    }
	
	public void getURL(String url) {
        Selenide.open(url);
        waitFor(10);
    }
	
	 public void waitFor(int sec) {
	        try {
	            Thread.sleep(sec * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public SelenideElement waitForVisibility(SelenideElement element, int timeToWaitInSec) throws AssertionError {
	        return element.waitUntil(visible, timeToWaitInSec * 1000);
	    }
	    
	    public SelenideElement waitForClickability(SelenideElement element, int timeout) {
	        Condition clickable = and("can be clicked", exist, enabled);
	        return element.waitUntil(clickable, timeout * 1000);
	    }
	    
	    public void hover(SelenideElement Element) {
	    	Actions ac = new Actions(WebDriverRunner.getWebDriver());
	    	ac.moveToElement(Element).perform();
	    }
	    
	    public String randomEmailGenerator() {
	       String emailAddress = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
	    	return emailAddress;
	    }
	    
	    public void moveToFrame() {
	    	int size = WebDriverRunner.getWebDriver().findElements(By.tagName("iframe")).size();
	    	WebDriverRunner.getWebDriver().switchTo().frame(0);
	    }
	    public void stopBrowser() {
	    WebDriverRunner.getWebDriver().quit();
	    }
}
