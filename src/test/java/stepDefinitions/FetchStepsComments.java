package stepDefinitions;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FetchStepsComments {

	private StepData stepData;

	public FetchStepsComments(StepData stepData) {
		this.stepData = stepData;
	}

	@Given("a user exists with postId {string}")
	public void a_user_exists_with_post_id(String string) {
		stepData.request = given().queryParam("postId", "9");
	}

	@When("an end user retrieves the comment by postId")
	public void an_end_user_retrieves_the_comment_by_post_id() {
		stepData.response = stepData.request.when().get(stepData.baseURI + "comments");
	}

}
