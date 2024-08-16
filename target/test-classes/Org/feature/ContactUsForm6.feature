Feature:  Contact us form

Scenario:

Given the user launch url http:automationexercise.com
Then the user  Verify that home page is visible successfully
When the user  Click on Contact Us button
And the user  Verify GET IN TOUCH is visible
And the user  Enter name, email, subject and message
And the user  Upload file
And the user  Click Submit button
And the user Click OK button
Then the user Verify success message Success! Your details have been submitted successfully is visible
And the user  Click Home button 
Then the user verify that landed to home page successfully