Feature: Logout User

Scenario:

Given the user launch URL
Then the user Verify that home page is visible successfully
When the user Click on Signup- Login button
Then the user Verify Login to your account is visible
When the user Enter correct email address and password
And the user Click login button
Then the user Verify that Logged in as username is visible
When the user Click Logout button
Then  Verify that user is navigated to login page
