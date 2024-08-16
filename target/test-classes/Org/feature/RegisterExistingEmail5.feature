Feature: Register user with existing Email
  
Scenario:

Given the user Launch URL
Then the user  Verify that home page is visible successfully
When the user Click on Signup-Login button
Then the user Verify New User Signup! is visible
When the user Enter name and already registered email address
And the user  Click Signup button
Then  Verify error Email Address already exist! is visible