package demo;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class log4jdemo {
	private static Logger logger = 
			 (Logger) LogManager.getLogger(log4jdemo.class);
	public static void main(String[] args) {
		 
		System.out.println("hello world");
		
		logger.info("This is a information message");
		logger.debug("debug mode");
		System.out.println("Completed"); // using fine
		 
		
	}

}
