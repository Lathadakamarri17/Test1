package Restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



public class Sample_restassured{
	@Test
	void test_get(){
		baseURI="http://reqres.in/api";
		
		given().header ("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b")
				.get("/user?page=2")
				.then().statusCode(200).log().all();
	}
}



