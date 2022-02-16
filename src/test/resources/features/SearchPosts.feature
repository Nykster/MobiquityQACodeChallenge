Feature: Search for posts written by a user

Scenario: End user makes call to web service to retrieve posts by userId
Given a user with "userId" "9"
When an end user retrieves the posts
Then the status code is 200

Scenario: End user makes call to web service to retrieve posts by title
Given a user with "title" "optio ipsam molestias necessitatibus occaecati facilis veritatis dolores aut"
When an end user retrieves the posts
Then the status code is 200

Scenario: End user makes call to web service to retrieve posts by id
Given a user with "id" "88"
When an end user retrieves the posts
Then the status code is 200

Scenario: End user makes call to web service to retrieve posts by non-existent userId
Given a user with "userId" "123"
When an end user retrieves the posts
Then an empty list is returned

Scenario: End user makes call to web service to retrieve posts by non-existent title
Given a user with "title" "non-existent title"
When an end user retrieves the posts
Then an empty list is returned

Scenario: End user makes call to web service to retrieve posts by non-existent id
Given a user with "id" "88123"
When an end user retrieves the posts
Then an empty list is returned