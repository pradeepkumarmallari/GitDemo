package automationUtilities;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class Logging {
	public static Logger log = Logger.getLogger(Log.class.getName());
	
	//Use this method for console logging before start of test case
	public static void startTestCase(String testCase) {
		 log.info("****************************************************************************************");
		 log.info("****************************************************************************************");
		 log.info("$$$$$$$$$$$$$$$$$$$$$                 "+testCase+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		 log.info("****************************************************************************************");
		 log.info("****************************************************************************************");
	}
	
	//Use this method for console logging after end of test case
	public static void endTestCase(String testCase) {
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		log.info("X");
		log.info("X");
		log.info("X");
		log.info("X");
		
	}
	//Use this method for console logging of information message
		
	public static void infoMessage(String message) {
		log.info(message);
		
	}
	
	//Use this method for console logging of error message
	public static void errorMessage(String message){
		log.info(message);
		
	}
	
	//Use this method for console logging of warning message
	
	public static void warnMessage(String message) {
		log.info(message);
		
	}
	
	
	
	
	

}
