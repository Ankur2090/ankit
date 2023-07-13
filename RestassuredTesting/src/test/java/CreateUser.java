import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;

public class CreateUser
{

	@Test
	public void create()
	{
		// Map<String, String> map = new HashMap<String, String>();
		
	
		
		JSONObject param=new JSONObject ();
		 param.put("name", "Ankur");
		 param.put("job", "QA");
		 param.put("id", "88");
		 param.put("createdAt", "2023-07-13T18:00:20.883Z");
		
		//map.put("name", "morpheus");
	//	map.put("job", "leader");
		
		  RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="/api/users";
		Response res = RestAssured.given().accept(ContentType.JSON).contentType("application/json")
		.and().body(param).post("");
	
	String json = res.getBody().jsonPath().prettify();
	int code = res.getStatusCode();
	
System.out.println(json +" "+ code);
		
	}	
}
