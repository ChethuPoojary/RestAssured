package APITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssured3 {
	
	@Test
	public void postrequest()
	{
		
	PostRequestClass Req = new PostRequestClass();
	Req.setFirstname("chethan");
	Req.setLastname("kumara");
	Req.setTotalprice(5000);
	Req.setDepositpaid(true);
	Req.setAdditionalneeds("Lunch");
	
	Bookingdates BK = new Bookingdates();
	BK.setCheckin("2013-02-23");
	BK.setCheckout("2013-05-23");
	
	
	Req.setBookingdates(BK);
	
	System.out.println(Req.getFirstname());
	
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking")
	.contentType(ContentType.JSON)
	.when().body(Req).post()
	
	.then().log().all().statusCode(200);
}
}
