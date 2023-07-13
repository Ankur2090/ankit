import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Auth {
	

@Test
 public void Auther()
{
	//RestAssured.baseURI="https://api.dev.sentric.pro";
	String json="{\r\n"
			+ "  \"encoded_data\": \"string\",\r\n"
			+ "  \"data\": {\r\n"
			+ "    \"organizationId\": \"87c2dc08-518b-434c-996c-ee2522c03206\"\r\n"
			+ "  }\r\n"
			+ "}";
	
	//JSONObject reqparam=new JSONObject ();
	
	 //reqparam.put("organizationId", "87c2dc08-518b-434c-996c-ee2522c03206");
	 
	 
	//reqparam.put("password", "Password123$");
       Response rsep = RestAssured.given().auth().oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IjRFRTExQjc3OUFENzExOUFBRDkyODlEMTczMTk0MDg1Q0ExMjU1MzVSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6IlR1RWJkNXJYRVpxdGtvblJjeGxBaGNvU1ZUVSJ9.eyJuYmYiOjE2NzM1ODMxMzgsImV4cCI6MTY3MzYxOTEzOCwiaXNzIjoiaHR0cHM6Ly9sb2dpbi5kZXYuc2VudHJpYy5wcm8iLCJjbGllbnRfaWQiOiJhbmd1bGFyLWRldmNsaWVudCIsInN1YiI6IjdjZTI3ZTk5LTUwNTMtNDQxNC1hZTU4LTVjZGQ3YTBiZmFhOCIsImF1dGhfdGltZSI6MTY3MzU4MzEzNiwiaWRwIjoibG9jYWwiLCJJbWFnZVBhdGgiOiIiLCJmaXJzdG5hbWUiOiJhbmt1cnIiLCJsYXN0bmFtZSI6Imt1bWFycnciLCJ1c2VyaWQiOiI3Y2UyN2U5OS01MDUzLTQ0MTQtYWU1OC01Y2RkN2EwYmZhYTgiLCJvcmdhbml6YXRpb25JZCI6Ijg3YzJkYzA4LTUxOGItNDM0Yy05OTZjLWVlMjUyMmMwMzIwNiIsInJvbGUiOiJBZG1pbmlzdHJhdG9yIiwidGltZVpvbmVJZCI6IkFzaWEvQ2FsY3V0dGEiLCJzaWQiOiJERjAzRDZDQjY0MDg0NjYwNzJFMDZBRjRENkUxQUJEOCIsImlhdCI6MTY3MzU4MzEzOCwic2NvcGUiOlsib3BlbmlkIiwicHJvZmlsZSIsIndlYl9hcGkiLCJvZmZsaW5lX2FjY2VzcyJdLCJhbXIiOlsicHdkIl19.FEIVpmrrAa7BG72mhqZ9hB_c6pt97xKlAV-QtHjiRdpj7j96YgbYNqGYCAPgjDGf5BiaAQMD_FzBOCNIZzAQc8aIMoGmRrL5Y46R5esXEVHc_OtQfz7uTp2rZEcHMMGuHICMhDpuIMu50SRrZW_QwjyoHOrx62nYzoJQD4gf6vDuehHtnMGuERAfGreIAGuofmkD9c3hrCqhxaPSufCKiWASE33O7qvrr02j3o9vYic97yVtGR7EACloHKINvh9zM0B_ECGQn2b8g_OuZAQBQx3jdDo6fyXmmxvTZD1CSTdBoCrpS9Kgp3ociAmLSzW-MxMTViFSZE1majzIrozHYQ")
                  .accept(ContentType.JSON)
                  .contentType("application/json")
                  .and()
                  .body(json)
                  .post("https://api.dev.sentric.pro/api/device/list");
             
              String son = rsep.jsonPath().prettify();
          int code = rsep.statusCode();
         String line = rsep.statusLine();
       long tim = rsep.getTimeIn(TimeUnit.SECONDS);
         System.out.println(tim);
         System.out.println(code + ""+ line );
          Assert.assertEquals(code, 200); 
		 System.out.println(son);

 
	 
	 
}

	
}


