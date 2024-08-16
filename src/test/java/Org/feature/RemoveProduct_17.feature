Feature: Remove Products From Cart

Scenario:

Given the user Launch Url
Then the user Verify that home page is visible successfully
When the user Add products to cart
And the use Click Cart button
Then the user Verify that cart page is displayed
When the user Click X button corresponding to particular product
Then the user Verify that product is removed from the cart