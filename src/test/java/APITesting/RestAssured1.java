package APITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssured1 {
	
   @Test(groups= {"positive"})
	public void Getrequest() {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping").
		when().get().
		then().log().all().statusCode(201);
	
		
	}
   
   @Test(groups= {"negetive"})
 	public void Getrequest1() {
     RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping").
 		when().get().
 		then().log().all().statusCode(200);
 	
 		
 	}

}
