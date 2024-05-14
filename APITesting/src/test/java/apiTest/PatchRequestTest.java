package apiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PatchRequestTest {
  @Test
  public void UpdatingThroughPatchrequest() {
	  String sys_id="9c573169c611228700193229fff72400";
	  RestAssured.baseURI = "https://dev211885.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "O@cP0kFs6qV=");
		Response response=RestAssured
				.given().
				contentType(ContentType.JSON)
				.when()
				.body("{\"short_description\":\"Incident Updating Through Patch request\"}")
				.patch(sys_id);
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
	  
  }
}
