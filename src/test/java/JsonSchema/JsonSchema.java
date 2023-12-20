package JsonSchema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchema {

	
	@Test
	public void jsonvalidation()
	{
		RestAssured.given().baseUri("https://jsonplaceholder.typicode.com/posts/2").given().when().get().then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("/RestAssured/src/test/java/JsonSchema/Schema.json")));
	}
}
