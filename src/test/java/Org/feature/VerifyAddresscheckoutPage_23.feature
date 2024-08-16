 Feature: Verify address details in checkout page
 
 Scenario:

Given the user Launch URL
Then the user Verify that home page is visible successfully
When the user Click Signup - Login button
And the user Fill all details in Signup and create account
Then the user Verify ACCOUNT CREATED! 
When the user click Continue button
Then the user Verify  Logged in as username at top
When the user Add products to cart
And the user Click Cart button
Then the user Verify that cart page is displayed
When the user Click Proceed To Checkout
Then the user Verify that the delivery address is same address filled at the time registration of account
Then the user Verify that the billing address is same address filled at the time registration of account
When the user Click Delete Account button
Then the user Verify ACCOUNT DELETED! and click Continue button