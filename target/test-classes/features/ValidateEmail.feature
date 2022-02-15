Feature: Get a user by username

Scenario: End user makes call to web service to retrieve comments by postId
Given a user exists with postId "9"
When an end user retrieves the comment by postId
Then the status code is 200