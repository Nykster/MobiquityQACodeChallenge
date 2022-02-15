Feature: Fetch comments and validate email address

Background:
Given a user exists with postId "9"
When an end user retrieves the comment by postId
And the status code is 200

Scenario: End user makes call to web service to retrieve comments by postId
Then an end user validates the email address "Lucio@gladys.tv" is correct
Then the status code is 200
Then an end user validates the email address "Shemar@ewell.name" is correct
Then the status code is 200
Then an end user validates the email address "Jackeline@eva.tv" is correct
Then the status code is 200
Then an end user validates the email address "Marianna_Wilkinson@rupert.io" is correct
Then the status code is 200
Then an end user validates the email address "Marcia@name.biz" is correct
Then the status code is 200
