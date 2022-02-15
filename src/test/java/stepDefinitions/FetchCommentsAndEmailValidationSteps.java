package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FetchCommentsAndEmailValidationSteps {

	private CommonData commonData;

	public FetchCommentsAndEmailValidationSteps(CommonData commonData) {
		this.commonData = commonData;
	}

	@Given("a user exists with {string} {string}")
	public void a_user_exists_with(String key, String value) {
		commonData.request = given().queryParam(key, value);
	}
	
	@When("an end user retrieves the comment by postId")
	public void an_end_user_retrieves_the_comment_by_post_id() {
		commonData.response = commonData.request.when().get(commonData.baseURI + "comments");
	}
	
	@Then("an end user validates the email address {string} is correct")
	public void an_end_user_validates_the_address_is_correct(String emailadd) {
		commonData.response.then().assertThat().body("email", hasItem(emailadd));
	}

}
