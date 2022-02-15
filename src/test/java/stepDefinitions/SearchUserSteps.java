package stepDefinitions;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchUserSteps {
	
	private CommonData commonData;
	
	public SearchUserSteps(CommonData commonData) {
		this.commonData = commonData;
	}
	
	@Given("a user with {string} {string} exists")
	public void a_user_with_exists(String key, String value) {
		commonData.request = given().params(key, value);
	}

	@When("an end user searches for the user")
	public void an_end_user_searches_for_the_user() {
		commonData.response = commonData.request.when().get(commonData.baseURI+"users");
//		System.out.println("response: " + response.prettyPrint());
	}

	@Then("the status code is {int}")
	public void the_status_code_is(int statusCode) {
		commonData.json = commonData.response.then().statusCode(statusCode).log().body();
		System.out.println("*****************RESPONSE CODE*****************:" + commonData.response.statusCode());
	}

	
}
