package apiTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;




public class postRequestTest {
  @Test
  public void creatIncident() {
	  RestAssured.baseURI = "https://dev211885.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "O@cP0kFs6qV=");
		Response response=RestAssured
				.given().
				contentType(ContentType.JSON)
				.when()
				.body("{\"caller_id\":\"5137153cc611227c000bbd1bd8cd2005\",\"short_description\":\"Post Request Creat Incident\"}")
				.post();
		    System.out.println(response.getStatusCode());
		    System.out.println(response.prettyPrint());
		    
		    JsonPath jsonResponse =response.jsonPath();
		    String sys_id=jsonResponse.get("result.sys_id");
		    System.out.println(sys_id);
		    
		    
		    
		
  }
}
