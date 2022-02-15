Feature: Get a user by username

Scenario: End user makes call to web service to retrieve comments by postId
Given a user exists with postId "9"
When an end user retrieves the comment by postId
And the status code is 200
Then an end user validates the "email" address "Lucio@gladys.tvv" is correct
Then the status code is 200