package Sample_Authorization;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample_github {
	@Test(enabled=true) 
		public void two() {
		RestAssured.baseURI = "http://api.github.com";
		RestAssured.basePath="/users/Lathadakamarri17/repos";
		
		RequestSpecification RequestSpec = RestAssured.given();
		RequestSpec.header("Authorization", "Bearer ghp_YLLy7uip9P2pl3Nddx2cWpPflZZgaLT3ABkA5");
		
		Response response = RequestSpec .get();
		
		JsonPath jsonpath= response.jsonPath();
		String reposname = jsonpath.getString("name");
		
		System.out.println(reposname);
		
		Assert.assertEquals(response.statusCode(),401);
	
		
	}

}
