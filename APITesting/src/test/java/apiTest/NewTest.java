package apiTest;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;



public class NewTest {

	@Test
	public void getAllIncident() {

		RestAssured.baseURI = "https://dev211885.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "O@cP0kFs6qV=");
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "");
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());

	}

	@Test
	public void getIncident() {

		RestAssured.baseURI = "https://dev211885.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "O@cP0kFs6qV=");
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.queryParam("number", "INC0000001").get();
		// Retrieving the response Body using get Body Method
		ResponseBody body = response.body();
		// converting the response Body to string object
		String responseBody = body.asString();
		// Create object of Jason path and passing thestring response body as parameter
		JsonPath jpath = new JsonPath(responseBody);
		String short_description = jpath.getString("result.short_description");
		System.out.println(body.asPrettyString());
		System.out.println("short_description"+short_description);
		System.out.println(jpath.getString("result.resolved_by.value"));

	}   
  
}


