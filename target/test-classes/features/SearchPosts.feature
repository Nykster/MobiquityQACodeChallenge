Feature: Search for posts written by a user

Scenario: End user makes call to web service to retrieve posts by user
Given an end user searches for posts by username "Delphine"
When an end user retrieves the posts by "userId"
#Then the posts are successfully returned status code 200
Then the status code is 200
