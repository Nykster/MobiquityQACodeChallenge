package stepDefinitions;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsPosts {
	
private StepData stepData;
	
	public SearchStepsPosts(StepData stepData) {
		this.stepData = stepData;
	}
			
	@Given("an end user searches for posts by username {string}")
	public void an_end_user_searches_for_posts_by_username(String string) {
//		baseURI = "https://jsonplaceholder.typicode.com/";
		stepData.request = given().queryParam("userId", "9");
	}
	
	@When("an end user retrieves the posts by {string}")
	public void an_end_user_retrieves_the_posts_by(String string) {    
		stepData.response = stepData.request.when().get(stepData.baseURI+"posts");
//		System.out.println("response: " + stepData.response.prettyPrint());
	}
	
	@Then("the posts are successfully returned status code {int}")
	public void the_posts_are_successfully_returned_status_code(Integer statusCode) {
		stepData.json = stepData.response.then().statusCode(statusCode);
	}
}
