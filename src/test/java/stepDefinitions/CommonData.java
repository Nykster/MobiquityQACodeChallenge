package stepDefinitions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CommonData {
	
	String baseURI = "https://jsonplaceholder.typicode.com/"; //end point
	
	// common data used across step definition classes
	protected Response response;
	protected ValidatableResponse json;
	protected RequestSpecification request;	
}
