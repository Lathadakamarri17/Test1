Feature:
Background:
Given user is on HRMLogin page "http://opensource-demo.orangehrm"

@ValidCredentials
Scenario:Login with valid credentials

When  user enters username as "Admin" and password as "admin123"
Then user should ba able to login successfully and new page open


@MissingUsername
Scenario:Lgin with blank username

When User enters username as "" and password as "admin123"
Then User should not be able to  login