Feature: Register user
        
Scenario:

  
Given the user Launch Url
Then the user Verify that home page is visible successfully
When the user Click on Signup Login button
Then the user verify New User Signup! is visible
When  the user Enter name and email address
And the user Click Signup button
Then the user Verify that ENTER ACCOUNT INFORMATION is visible
When  the user Enter the details: Title, Name, Email, Password, Date of birth
And the user Select checkbox Sign up for our newsletter!
And the user Select checkbox Receive special offers from our partners!
And the user enter the First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
And the user  Click Create Account button
Then the user  Verify that ACCOUNT CREATED! is visible
When  the user  Click Continue button
Then  the user  Verify that Logged in as username is visible
When  the user  Click Delete Account button
Then the user Verify that ACCOUNT DELETED! is visible and click Continue button
