package API.Automation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payLoads.JsonExtractor;
import payLoads.addPlaceBody;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class AddPlace 
{
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		// POST API
		String responce = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(addPlaceBody.loadAddPlaceBody())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		. header("server", equalTo("Apache/2.4.41 (Ubuntu)")).extract().response().asString();
		
		JsonPath jp1 = JsonExtractor.objectJP(responce);
		String placeId = (jp1.getString("place_id"));
		
		System.out.println("Place Id : " + placeId);	
		
		// GET API
		String getResponce = given().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jp2 = JsonExtractor.objectJP(getResponce);
		String longitude = jp2.getString("location.longitude");
		System.out.println(longitude );
		
	}	
}
