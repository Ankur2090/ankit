import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001GET 
{

	@Test
	public void GetRequest()
	{
		Response Response = RestAssured.given()
				.auth().oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IjRFRTExQjc3OUFENzExOUFBRDkyODlEMTczMTk0MDg1Q0ExMjU1MzVSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6IlR1RWJkNXJYRVpxdGtvblJjeGxBaGNvU1ZUVSJ9.eyJuYmYiOjE2NzM0MTg3ODksImV4cCI6MTY3MzQ1NDc4OSwiaXNzIjoiaHR0cHM6Ly9sb2dpbi5kZXYuc2VudHJpYy5wcm8iLCJjbGllbnRfaWQiOiJhbmd1bGFyLWRldmNsaWVudCIsInN1YiI6IjdjZTI3ZTk5LTUwNTMtNDQxNC1hZTU4LTVjZGQ3YTBiZmFhOCIsImF1dGhfdGltZSI6MTY3MzQxODc4NywiaWRwIjoibG9jYWwiLCJJbWFnZVBhdGgiOiIiLCJmaXJzdG5hbWUiOiJhbmt1cnIiLCJsYXN0bmFtZSI6Imt1bWFycnciLCJ1c2VyaWQiOiI3Y2UyN2U5OS01MDUzLTQ0MTQtYWU1OC01Y2RkN2EwYmZhYTgiLCJvcmdhbml6YXRpb25JZCI6Ijg3YzJkYzA4LTUxOGItNDM0Yy05OTZjLWVlMjUyMmMwMzIwNiIsInJvbGUiOiJBZG1pbmlzdHJhdG9yIiwidGltZVpvbmVJZCI6IkFzaWEvQ2FsY3V0dGEiLCJzaWQiOiIwRjY3NUYzMTgzMTZDOEJDMEUzQjk4QzA1MkYzOTREQyIsImlhdCI6MTY3MzQxODc4OSwic2NvcGUiOlsib3BlbmlkIiwicHJvZmlsZSIsIndlYl9hcGkiLCJvZmZsaW5lX2FjY2VzcyJdLCJhbXIiOlsicHdkIl19.VSCAldceGZA4N-iZqVOqKszTbccUOFKe4-NAPIUdi4Me7wt4xcuTJEiEWiP52xrpg2MiBXRTyXvxho-AA_qVhgwG0Kixee09HZdjZzYj9t8oxNMlZd9r6hNQdY7qp4KAVPqvpcCALeH_Z3jrGosq-xhaH-4c977OuF9gtR0esIM_F99nyHVhQL1zz_pKRrd0mx0pKuyDvcw_WUH84EK2Ay2bPw47cZNn4KIlP1KknwX9dSE1cjkPekagaED75SIvnAMFEDE8zDwYZkw0HfizhscMx4QzUGAuBqgAABSxmbDC85KWUnvxKA7PT1GjWVWv7jW8vB4spst-4fl4_LV-bQ")
				.get("https://api.dev.sentric.pro/api/organization/organization");
	//String body = Response.getBody().asPrettyString();
	JsonPath json = Response.jsonPath();
	Object value = json.prettify();
	
	System.out.println(value);
		//System.out.println(body);
	}



	
	
}	
	
	
	