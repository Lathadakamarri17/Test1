package Restassured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test01_Delete {
	@Test
	public void test_delete() {
		JSONObject request1= new JSONObject();
		
		request1.put("name","Latha");
		request1.put("Job","Trainee");
		
		given().
		header("Content-Type", "application/json").
		header("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b").
		body(request1.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).log().all();
		
	}

}
