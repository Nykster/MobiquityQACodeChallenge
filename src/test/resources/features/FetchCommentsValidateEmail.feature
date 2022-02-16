Feature: Fetch comments and validate email address

Background: Comments fetched
Given a user exists with "postId" "9"
When an end user retrieves the comment by postId
And the status code is 200

Scenario: Successful validation of email addresses
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

Scenario: Unsuccessful validation of email addresses
Then an end user validates the email address "Lucio@gladys.tv " is correct
Then an empty list is returned
Then an end user validates the email address "Shemarewell.name" is correct
Then an empty list is returned
Then an end user validates the email address "Jackeline@evatv" is correct
Then an empty list is returned
Then an end user validates the email address "Marianna_Wilkinsonrupertio" is correct
Then an empty list is returned
Then an end user validates the email address "Marcia@name.bizxtra" is correct
Then an empty list is returned
