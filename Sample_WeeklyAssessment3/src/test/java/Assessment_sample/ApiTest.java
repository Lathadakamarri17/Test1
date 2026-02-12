package Assessment_sample;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;


import org.testng.annotations.Test;



public class ApiTest {
	
	@DataProvider(name ="userIds")
	public Object[][] provideUserIds() {
		return new  Object[][] {
			{1},
			{2},
			{3},
			
			
		};
	};
	@Test(dataProvider = "userIds")
	public void validateUserApi(int userId) {
		RestAssured.baseURI="https://reqres.in/api";
	given().header("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b").
	.pathParam("https://reqres.in/",userId)
	given()
	.pathParam("id",userId)
	.when()
	.get("/api/users/{id}",userId)
	.then()
	.statusCode(200)
	.body("data.id", equalTo(userId));
	
	
	
	
	
	
	

	
	
	
}
}
