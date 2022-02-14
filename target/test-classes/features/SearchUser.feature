Feature: Get a user by username

Scenario: End user makes call to web service to retrieve user by username
Given a user exists with username "Delphine"
When an end user retrieves the user by username
Then the status code is 200