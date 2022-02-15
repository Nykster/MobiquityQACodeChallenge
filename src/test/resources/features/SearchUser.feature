Feature: Retrieve a user based on different categories

Scenario: End user makes call to web service to retrieve user by username
	Given a user with "username" "Delphine" exists
	When an end user searches for the user
	Then the status code is 200

Scenario: End user makes call to web service to retrieve user by email
	Given a user with "email" "Chaim_McDermott@dana.io" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by phone
	Given a user with "phone" "(775)976-6794 x41206" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by website
	Given a user with "website" "conrad.com" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by id
	Given a user with "id" "9" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by name
	Given a user with "name" "Glenna Reichert" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by company name
	Given a user with "company.name" "Yost and Sons" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by company catch phrase
	Given a user with "company.catchPhrase" "Switchable contextually-based project" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by street address
	Given a user with "address.street" "Dayna Park" exists
	When an end user searches for the user
	Then the status code is 200
	
Scenario: End user makes call to web service to retrieve user by non existent username
	Given a user with "username" "Anyik" exists
	When an end user searches for the user
	Then the status code is 200