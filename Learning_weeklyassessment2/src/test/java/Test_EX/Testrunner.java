package Test_EX;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
features="src/test/resources/features/Timesofindia.feature"
,glue= {"Test_EX"}

  )

public class Testrunner extends  AbstractTestNGCucumberTests {

}



	


