
Feature: Login User with correct email and password

 Scenario:

Given the user Launch URL
Then  Verify that home page is visible successfully
When the user Click on Signup / Login button
Then the user Verify Login to your account is visible
When  the user Enter correct email address and password
And the user Click login button
And the user Verify that Logged in as username is visible
And the user Click Delete Account button
Then the user Verify that ACCOUNT DELETED! is visible