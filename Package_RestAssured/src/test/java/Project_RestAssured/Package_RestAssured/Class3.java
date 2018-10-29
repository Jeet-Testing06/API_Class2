// post method

package Project_RestAssured.Package_RestAssured;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;

public class Class3 {
	
	public static void main(String[] args) {
		
		Class2 obj = new Class2();
		
		obj.setId(5);
		obj.setTitle("Kakkar");
		obj.setAuthor("Gaurav");
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		
		.when()
		.post("http://localhost:3000/posts")
		
		.then()
		.statusCode(201);
				
	}

}