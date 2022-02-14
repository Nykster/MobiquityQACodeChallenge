package stepDefinitions;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsUser {
	
	private StepData stepData;
	
	public SearchStepsUser(StepData stepData) {
		this.stepData = stepData;
	}
	
	String baseURI = "https://jsonplaceholder.typicode.com/";
//	private Response response;
//	private ValidatableResponse json;
//	private RequestSpecification request;
	//private String URL = "https://jsonplaceholder.typicode.com/users";
	
	
	@Given("a user exists with username {string}")
	public void a_user_exists_with_username(String user) {
		stepData.request = given().params("username", user);
	}

	@When("an end user retrieves the user by username")
	public void an_end_user_retrieves_the_user_by_username() {
		stepData.response = stepData.request.when().get(baseURI+"users");
//		System.out.println("response: " + response.prettyPrint());
	}

	@Then("the status code is {int}")
	public void the_status_code_is(int statusCode) {
		stepData.json = stepData.response.then().statusCode(statusCode).log().body();
	}

	/*
	 * @And("response includes the following") public void
	 * response_includes_the_following(io.cucumber.datatable.DataTable dataTable) {
	 * // Write code here that turns the phrase above into concrete actions // For
	 * automatic transformation, change DataTable to one of // E, List<E>,
	 * List<List<E>>, List<Map<K,V>>, Map<K,V> or // Map<K, List<V>>. E,K,V must be
	 * a String, Integer, Float, // Double, Byte, Short, Long, BigInteger or
	 * BigDecimal. // // For other transformations you can register a DataTableType.
	 * throw new io.cucumber.java.PendingException(); }
	 */
	
}
