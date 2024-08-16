Feature: Login User with incorrect email and password

Scenario:


Given the user Launch URL
Then the user  Verify that home page is visible successfully
Given the user  Click on Signup-Login button
Then the user  Verify Login to your account is visible
Given the user  Enter incorrect email address and password
And the user  Click login button
Then  Verify error Your email or password is incorrect! is visible