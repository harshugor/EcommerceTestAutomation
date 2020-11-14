package AskuitySolution.AskuitySolution.Common;

import AskuitySolution.AskuitySolution.EcommerceProject.EcommerceManager;

public class AppManager extends CoreAppManager {

    /*
     * Project Managers can be added here
     */
	
	 public EcommerceManager ecommManager() {
	        return new EcommerceManager();
	    }
}
