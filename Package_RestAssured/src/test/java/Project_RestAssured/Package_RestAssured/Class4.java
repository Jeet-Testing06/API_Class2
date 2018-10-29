// delete method

package Project_RestAssured.Package_RestAssured;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;

public class Class4 {
	
	public static void main(String[] args) {
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.delete("http://localhost:3000/posts/5")
		
		.then()
		.statusCode(200);

	}

}