package APITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssured2 {

@Test	
	public void postrequest() {
	
	String payload = "{\r\n"
			+ "\"username\":\"admin\",\r\n"
			+ "\"password\": \"password123\"\r\n"
			+ "} " ;

	RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/auth")
	.contentType(ContentType.JSON)
	.when().body(payload).post()
	
	.then().log().all().statusCode(200);
	}

}
