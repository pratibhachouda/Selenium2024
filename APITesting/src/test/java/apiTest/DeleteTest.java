package apiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteTest {
  @Test
  public void DeleteRequestTest() {
	  String sys_id="2acd6c5b93e102105be8fcf08bba10fb";
	  RestAssured.baseURI = "https://dev211885.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "O@cP0kFs6qV=");
		Response response=RestAssured.given().contentType(ContentType.JSON).delete(sys_id);
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println(response.contentType());
		System.out.println(response.getTime());
  }
}
  