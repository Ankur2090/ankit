import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class dashboardlist {
	
	@Test
   public void daslist()
   {
		
		String json="{\r\n"
				+ "  \"encoded_data\": \"string\",\r\n"
				+ "  \"data\": {\r\n"
				+ "    \"organizationId\": \"87c2dc08-518b-434c-996c-ee2522c03206\",\r\n"
				+ "    \"userId\": \"7ce27e99-5053-4414-ae58-5cdd7a0bfaa8\"\r\n"
				+ "  }\r\n"
				+ "}";
		
		
	 Response list = RestAssured.given().log().all().auth().oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IjRFRTExQjc3OUFENzExOUFBRDkyODlEMTczMTk0MDg1Q0ExMjU1MzVSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6IlR1RWJkNXJYRVpxdGtvblJjeGxBaGNvU1ZUVSJ9.eyJuYmYiOjE2ODkyNzI4NzQsImV4cCI6MTY4OTI3NjQ3NCwiaXNzIjoiaHR0cHM6Ly9sb2dpbi5kZXYuc2VudHJpYy5wcm8iLCJjbGllbnRfaWQiOiJhbmd1bGFyLWRldmNsaWVudCIsInN1YiI6IjQ0Y2RlNmI5LWE4M2YtNDQzMy04OGMyLTJiMjk2MDE5OWM4ZSIsImF1dGhfdGltZSI6MTY4OTI3Mjg3MiwiaWRwIjoibG9jYWwiLCJyb2xlIjoiU3lzdGVtIiwiQWNjb3VudHMiOlsiYWNjb3VudHMubWZhIiwiYWNjb3VudHMuZGVsZXRlIiwiYWNjb3VudHMuYWNjY291bnRtZmEiLCJhY2NvdW50cy51cGRhdGUiLCJhY2NvdW50cy5kZXRhaWwiLCJhY2NvdW50cy5jcmVhdGUiXSwiRGV2aWNlcyI6WyJkZXZpY2VzLmRlbGV0ZSIsImRldmljZXMuYXNzaWduZGV2aWNlIiwiZGV2aWNlcy5kZWxldGVkZXZpY2VzZXJ2aWNlIiwiZGV2aWNlcy51cGRhdGUiLCJkZXZpY2VzLmNyZWF0ZSIsImRldmljZXMuZGV0YWlsIl0sIkFnZW50cyI6WyJhZ2VudHMuY3JlYXRlIiwiYWdlbnRzLnVwZGF0ZSIsImFnZW50cy5kZWxldGUiLCJhZ2VudHMuYXNzaWduYWdlbnQiLCJhZ2VudHMuZGVsZXRlYWdlbnRzZXJ2aWNlIiwiYWdlbnRzLmRldGFpbCJdLCJQcm9maWxlIjpbInByb2ZpbGUucHJvZmlsZXVwZGF0ZSIsInByb2ZpbGUuY2hhbmdlcGFzc3dvcmQiLCJwcm9maWxlLnByb2ZpbGVtZmEiLCJwcm9maWxlLmRldGFpbCJdLCJEYXNoYm9hcmQiOlsiZGFzaGJvYXJkLmRhc2hib2FyZHNjaGVkdWxlciIsImRhc2hib2FyZC5kZXRhaWwiLCJkYXNoYm9hcmQuZGFzaGJvYXJkZmF2b3VyaXRlIiwiZGFzaGJvYXJkLmRlbGV0ZSIsImRhc2hib2FyZC5kYXNoYm9hcmRjb3B5IiwiZGFzaGJvYXJkLnVwZGF0ZSIsImRhc2hib2FyZC5kYXNoYm9hcmRzaGFyZSIsImRhc2hib2FyZC51cGRhdGV2aXN1YWxzIiwiZGFzaGJvYXJkLnByaW50ZGFzaGJvYXJkIiwiZGFzaGJvYXJkLnJlZnJlc2hkYXNoYm9hcmQiLCJkYXNoYm9hcmQuY3JlYXRlIl0sIk9yZ2FuaXNhdGlvbiI6WyJvcmdhbmlzYXRpb24uY3JlYXRlc3Vib3JnIiwib3JnYW5pc2F0aW9uLnVwZGF0ZXN1Ym9yZyIsIm9yZ2FuaXNhdGlvbi5kZWxldGVzdWJvcmciLCJvcmdhbmlzYXRpb24udXBkYXRlIiwib3JnYW5pc2F0aW9uLmFkZGl0aW9uYWxkZXRhaWxzIiwib3JnYW5pc2F0aW9uLmRlbGV0ZSIsIm9yZ2FuaXNhdGlvbi5kZXRhaWxzdWJvcmciLCJvcmdhbmlzYXRpb24uY3JlYXRlIiwib3JnYW5pc2F0aW9uLmRldGFpbCJdLCJJbWFnZVBhdGgiOiIiLCJmaXJzdG5hbWUiOiJBbmt1clN0b25lIiwibGFzdG5hbWUiOiJrdW1hciIsInVzZXJpZCI6IjQ0Y2RlNmI5LWE4M2YtNDQzMy04OGMyLTJiMjk2MDE5OWM4ZSIsIm9yZ2FuaXphdGlvbklkIjoiIiwibG9nbyI6IiIsIm9yZ2FuaXNhdGlvbiI6IiIsInRpbWVab25lSWQiOiJBc2lhL0NhbGN1dHRhIiwic2lkIjoiMTk3RjgwRDc3MTYyOTBCNDExNEQ4NDJEMEFGODdDMTkiLCJpYXQiOjE2ODkyNzI4NzQsInNjb3BlIjpbIm9wZW5pZCIsInByb2ZpbGUiLCJ3ZWJfYXBpIiwib2ZmbGluZV9hY2Nlc3MiXSwiYW1yIjpbInB3ZCJdfQ.EnNp8ECgQBcDeHPK3qUw7A5EV6JuWjyZmMDHQaSxn-vklw-bG7rkb-DU_y2jQO_MugnqgURuDwgR4yR27Wwqfy2Dvw_wI23h9zV1vMX8umri_qbI-LIeCG5UXxaSVepGE-IEmGtgqsSGBEw3tfNPB3xkUJ7_A2SPU9MAIz8VIUesJYq1eKA_VoBP3nZQmUAGHaPkDIZT-11M1-iHVbfRrGd3YVZZrSBVo47mwZrFNvSNlKJwpaGUL3M0DskWtsDd6Cs5bhgJyq-q6iC0OFCu3g5obR7z486IGnWYccNcz02yLNGupcGq3DQJkQ6L1XZaRXAfVC9uUTcx67W4nNEPkQ")	
		.contentType("application/json")
		.and()
		.body(json)
		.post("https://api.dev.sentric.pro/api/dashboard/list");
	
          
		String path = list.getBody().asPrettyString();
		System.out.println(path);
		
	JsonPath pathe = list.getBody().jsonPath();
		 
		Object name = pathe.get("name");
		System.out.println(name);
	// int code = list.statusCode();
	//	String message = list.getStatusLine();
	//	 long time = list.getTimeIn(TimeUnit.SECONDS);
		
	//	System.out.println("Status code : "+code);
	//	System.out.println("Time : "+time);
	//	System.out.println("status line : "+message);
		
   }
	
	
}
