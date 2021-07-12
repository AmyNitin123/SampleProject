package utilities;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.sun.tools.sjavac.Log;

public class TestLogs {
	
	
	public static Logger log=Logger.getLogger(TestLogs.class.getName());
	public static void main(String[] args) {
		
		
		Date d=new Date();
		
	
		
		System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("This is the log for tests");
		
		log.error("errors will be printed here");
		
	}

}
