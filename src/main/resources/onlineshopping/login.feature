Feature: This is the Login feature

@LoginTest
Scenario: To validate the login functionality
	Given user have valid credentials
	When click on the login button
	Then user able to login
	
