// get method

package Project_RestAssured.Package_RestAssured;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class1 {
	
	public static void main(String[] args) {
		
		Response res =
				
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("http://localhost:3000/posts/5");
		System.out.println("Status code of Request in Response is: "+res.statusCode());
		System.out.println("Data of Request in Response is: "+res.asString());
		
	}
	
}