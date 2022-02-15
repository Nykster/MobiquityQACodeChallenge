package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
	
	/*
	 * @And("a list of email addresses to be validated") public void
	 * a_list_of_email_addresses_to_be_validated() { List<String> emailRepo =
	 * .given().get(stepData.baseURI.jso) }
	 */

	@When("an end user retrieves the comment by postId")
	public void an_end_user_retrieves_the_comment_by_post_id() {
		stepData.response = stepData.request.when().get(stepData.baseURI + "comments");
	}
	
	@Then("an end user validates the {string} address {string} is correct")
	public void an_end_user_validates_the_address_is_correct(String email, String emailadd) {
		stepData.response.then().assertThat().body("email", hasItem("emailadd"));
	}

}
