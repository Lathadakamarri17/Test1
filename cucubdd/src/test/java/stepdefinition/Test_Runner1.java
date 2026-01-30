package stepdefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions (
features="src/test/resources/features"
,glue= {"stepdefinition"},monochrome=true,
plugin= {"pretty", "html:target/HtmlReports.html"
		,"json:target/JSONReports"}

  )

public class Test_Runner1 {

}
