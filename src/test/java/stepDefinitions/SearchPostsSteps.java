package stepDefinitions;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPostsSteps {

	private CommonData commonData;
	
	//dependency injection
	public SearchPostsSteps(CommonData commonData) {
		this.commonData = commonData;
	}

	@Given("an end user searches for posts by username {string}")
	public void an_end_user_searches_for_posts_by_username(String string) {
		commonData.request = given().queryParam("userId", "9");
	}

	@When("an end user retrieves the posts")
	public void an_end_user_retrieves_the_posts() {
		commonData.response = commonData.request.when().get(commonData.baseURI + "posts");
		System.out.println("response: " + commonData.response.prettyPrint());
	}
}
