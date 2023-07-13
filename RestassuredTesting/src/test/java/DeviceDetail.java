import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DeviceDetail 
{
@Test
	public void TC002()
	{
		
		String json = "{\r\n"
				+ "  \"encoded_data\": \"string\",\r\n"
				+ "  \"data\": {\r\n"
				+ "    \"id\": \"45c58571-b31e-49dc-a3d0-b549792f5566\"\r\n"
				+ "  }\r\n"
				+ "}";
	
		
		
		Response res = RestAssured.given().log().all().auth().oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IjRFRTExQjc3OUFENzExOUFBRDkyODlEMTczMTk0MDg1Q0ExMjU1MzVSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6IlR1RWJkNXJYRVpxdGtvblJjeGxBaGNvU1ZUVSJ9.eyJuYmYiOjE2NzM5NDY4ODUsImV4cCI6MTY3Mzk4Mjg4NSwiaXNzIjoiaHR0cHM6Ly9sb2dpbi5kZXYuc2VudHJpYy5wcm8iLCJjbGllbnRfaWQiOiJhbmd1bGFyLWRldmNsaWVudCIsInN1YiI6IjQ0Y2RlNmI5LWE4M2YtNDQzMy04OGMyLTJiMjk2MDE5OWM4ZSIsImF1dGhfdGltZSI6MTY3Mzk0Njg4MywiaWRwIjoibG9jYWwiLCJJbWFnZVBhdGgiOiIiLCJmaXJzdG5hbWUiOiJBbmt1clN0b25lZSIsImxhc3RuYW1lIjoia3VtYXJlIiwidXNlcmlkIjoiNDRjZGU2YjktYTgzZi00NDMzLTg4YzItMmIyOTYwMTk5YzhlIiwib3JnYW5pemF0aW9uSWQiOiIiLCJyb2xlIjoiU3lzdGVtIiwidGltZVpvbmVJZCI6IkF1c3RyYWxpYS9TeWRuZXkiLCJzaWQiOiI5Q0FCRDE5NzkwRTM1RDRDNkMyRTY4NDVBNDJERTQ2MiIsImlhdCI6MTY3Mzk0Njg4NSwic2NvcGUiOlsib3BlbmlkIiwicHJvZmlsZSIsIndlYl9hcGkiLCJvZmZsaW5lX2FjY2VzcyJdLCJhbXIiOlsicHdkIl19.AaylZVHlaaiYw1QmFW1wmCwBQZLNUIq6-3Ox-oeyDMQ201gkCJvTzpSbobF1NgbDe3vCDqku8aehkkNA4uZXOL8foDHRUheTrEuN6VlylGq_OJLwtV_llqZ6Ell0GdbyfgVvKsEJm81MHJDvWLAZOpY8lJmI-N69Bsz4rbB9PTsHtnRTJyRGuxQErWnFZiW-A6JZL8CSyLBRV9PD78GqtZdmmqpj34VG9psPvGg4qnhThuKWpeyMM45iQ16fk9jU0Vd8Jo1sM_iz7lq6fcmpQ9cXuSypd-pHhhgI_lKoyQk-PMLBApE3YlWy6lxz46TziPff1Yu3b2BjxOQPz92NBA")
		.accept(ContentType.JSON)
		.contentType("application/json")
		.and()
		.body(json)
		.post("https://api.dev.sentric.pro/api/device/detail");		
		
 JsonPath print = res.getBody().jsonPath();
		
		Object out = print.get("message");
		
		System.out.println(out);
	}
	
	
	
	
	
	
}
