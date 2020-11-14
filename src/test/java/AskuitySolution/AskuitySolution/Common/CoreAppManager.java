package AskuitySolution.AskuitySolution.Common;


import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class CoreAppManager {

	public void init() throws FileNotFoundException, MalformedURLException {
        String browserName = "chrome";
        WebDriverRunner.setWebDriver(setWebdriver(browserName));
    }

	 protected WebDriver setWebdriver(String usedBrowser) throws MalformedURLException, FileNotFoundException {
	    
	        WebDriver driverToSet = null;
	        switch (usedBrowser) {
	            case "chrome":
	                WebDriverManager.chromedriver().setup();
	                ChromeOptions chromeOptions = new ChromeOptions();
	                chromeOptions.addArguments("incognito");
	                LoggingPreferences logPrefs = new LoggingPreferences();
	                
	                chromeOptions.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
	                chromeOptions.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
	              
	                driverToSet = new ChromeDriver(chromeOptions);
	                break;}
	        return driverToSet;
	    }
	 
	    public Helper help() {
	        return new Helper();
	    }
}