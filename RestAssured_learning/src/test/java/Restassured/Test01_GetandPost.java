package Restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;
public class Test01_GetandPost {
	@Test(enabled=false)
void test_01() {
		baseURI="https://reqres.in/api";
		given().header("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b")
		.get("/users?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("Srinu"))
		.body("data.first_name",hasItems("Srinu","Latha"));
		
	}
}
