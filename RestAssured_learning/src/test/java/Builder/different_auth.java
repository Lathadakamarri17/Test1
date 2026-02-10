package Builder;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class different_auth {
	@Test
	void dif_auth_method() {
		given().
		auth().
		basic("username","password")
		.when()
		.get("http://reqres.in/api")
		.then()
		.log().all().statusCode(200);
	}

}
