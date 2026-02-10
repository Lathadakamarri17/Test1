package param_example;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class pathparam_sample {
	@Test
	void test_01() {
		baseURI="https://reqres.in/api";
		given().header("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b")
		.pathParam("resource","users")
		.queryParam("pages", 2)
		.get("{resource}?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("George"))
		.body("data.first_name",hasItems("George","Rachel"));
		
	}

}
