package Api.endpoint;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.json.JSONObject;

public class Api {
	
	 private String accessKey;
	    private String refreshKey;
	    
	    @BeforeClass
	    public void setup() {
	        RestAssured.baseURI = "https://mntfd.epixel.link/afl/api/v1/user/";  // Replace with your actual base URI
	    }

	    @Test(priority = 1)
	    public void Login() {
	        JSONObject requestParams = new JSONObject();
	        requestParams.put("username", "system-api-admin");
	        requestParams.put("password", "Bu@Admin123");

	        RequestSpecification request = RestAssured.given()
	                .header("Content-Type", "application/json")
	                .header("apiKey", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0eXAiOiJ3ZWJzaXRlIiwiYXVkIjoiYmFzZS1hcHBsaWNhdGlvbiIsImlhdCI6MTcxNjI4NjEyMywiaXNzIjoibW50ZmQuZXBpeGVsLmxpbmsifQ.Wa7uhCwHaVSWl961NC0xc3LykcvGIZPg9x5sP8kzkS8")  // Replace with your actual API key
	                .body(requestParams.toString());

	        Response response = request.post("login/");  // Replace with your actual endpoint

	        System.out.println("Response Body: " + response.getBody().asString());
	        
	  
	            this.accessKey = response.jsonPath().getString("access");
	            this.refreshKey = response.jsonPath().getString("refresh");
	            System.out.println("Access Key: " + accessKey);
	            System.out.println("Refresh Key: " + refreshKey);
	    }
	     


	    @Test(priority = 2, dependsOnMethods = "Login",invocationCount = 50)
	    public void Registration() {
	        if (this.accessKey != null) {
	        	
	    		Faker faker = new Faker();
	    		String lastname = faker.name().lastName();
	    		System.out.println("lastname: " + lastname);
	    
	    		Map<String, String> jsonAsMap = new HashMap<>();
	    		jsonAsMap.put("country_code", "IN");
	    		jsonAsMap.put("first_name", "john");
	    		jsonAsMap.put("last_name", lastname);
	    		jsonAsMap.put("username", "user" + Integer.toString(((new Random().nextInt(1000000)) + 1)));
	    		jsonAsMap.put("email", "john" + Integer.toString(((new Random().nextInt(1000000)) + 1)) + "@gmail.com");
	    		jsonAsMap.put("phone_number", "9790" + Integer.toString(((new Random().nextInt(100000)) + 1)));
	    		jsonAsMap.put("password", "As@12345");
	    		jsonAsMap.put("agree_terms", "1");
	    		jsonAsMap.put("user_type", "member");
	    		jsonAsMap.put("place_genealogy", "1");
	    		jsonAsMap.put("sponsor", "demo1");
	    		jsonAsMap.put("subdomain", "domain" + Integer.toString(((new Random().nextInt(100000)) + 1)));
	    
	    		Map<String, String> jsonMap = new HashMap<>();
	    		jsonMap.put("apikey",
	    				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0eXAiOiJ3ZWJzaXRlIiwiYXVkIjoiYmFzZS1hcHBsaWNhdGlvbiIsImlhdCI6MTcxNjI4NjEyMywiaXNzIjoibW50ZmQuZXBpeGVsLmxpbmsifQ.Wa7uhCwHaVSWl961NC0xc3LykcvGIZPg9x5sP8kzkS8");
	    
	    		String authToken = this.accessKey;
	    		System.out.println("new value"+authToken);
	    		given().contentType("application/json").headers(jsonMap).headers("Authorization", "Bearer " + authToken)
	    				.body(jsonAsMap).when().post("https://mntfd.epixel.link/afl/api/v1/user/signup/").then().statusCode(200)
	    				.log().all();
	          
	        } else {
	            System.out.println("Access Key is not available.");
	        }
	    }
}
