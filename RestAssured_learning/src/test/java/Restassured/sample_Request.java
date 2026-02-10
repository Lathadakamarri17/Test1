package Restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class sample_Request {
	@Test
	void test_get() {
	
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("x-api-key", "reqres_2381122e9f974209b55018f0ba98e39b");
	httpRequest.baseUri("http://reqres.in/api");
	Response response = httpRequest.get("/users?page=2");
	
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	
	int code = response.getStatusCode();
	Assert.assertEquals(code,200);

}
}
