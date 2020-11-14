package AskuitySolution.AskuitySolution.Common;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import AskuitySolution.AskuitySolution.Common.AppManager;


import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Hooks {
	 public static final AppManager app = new AppManager();
	   
	    
	    @Before
	    public void setUp() throws FileNotFoundException, MalformedURLException {
	        app.init();
	        app.help().setUpBrowser();
	    }
	    
	    @After
	    public void tearDown() {
	        app.help().stopBrowser();
	    }
	    
	    
}
