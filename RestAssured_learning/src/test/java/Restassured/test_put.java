package Restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class test_put {
	@Test
	public void test_put() {
		JSONObject request= new JSONObject();
		request.put("name","Latha");
		request.put("Job","Trainee");
		
		given().
		header("Content-Type", "application/json").
		header("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b").
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
		
		
		
	}

}
