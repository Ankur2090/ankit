import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Listuser
{

	
	
	@Test
	public void list()
	{
		
		//RestAssured.baseURI="https://reqres.in/";
		//RestAssured.basePath="/api/users?page=2";
		
		Response res = RestAssured.given().get("https://reqres.in/api/users?page=2");
		String jsoon = res.getBody().jsonPath().prettify();
		 String json = res.jsonPath().prettify();
		String body = res.getBody().toString();
		int code = res.getStatusCode();
		String line = res.getStatusLine();
		System.out.println(jsoon+" "+code+" "+line);
		
	}
	
	
}
