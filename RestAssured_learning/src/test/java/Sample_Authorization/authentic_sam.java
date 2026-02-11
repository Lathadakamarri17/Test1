package Sample_Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class authentic_sam {
	@Test(enabled=true) 
	
	public void two() {
	RestAssured.baseURI = "http://api.github.com";
	String ep="/users/Lathadakamarri17/repos";
	String token = "ghp_YLLy7uip9P2pl3Nddx2cWpPflZZgaLT3ABkA5";
	
	ResponseOptions res2 = (ResponseOptions) RestAssured.given()
			.auth().oauth2(token)
			.get(ep).getBody();
	
	System.out.println(res2.toString());
	}
}
	
	

	
	
