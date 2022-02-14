package stepDefinitions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepData {
	
	String baseURI = "https://jsonplaceholder.typicode.com/";
	
	protected Response response;
	protected ValidatableResponse json;
	protected RequestSpecification request;	
}
