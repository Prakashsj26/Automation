Feature: Verify Product quantity in Cart

Scenario:

Given the user Launch URL
Then the user Verify that home page is visible successfully
When the user Click View Product for any product on home page
Then the user Verify product detail is opened
When the user Increase quantity to four
And the user Click Add to cart button
And the user Click View Cart button
Then the user Verify that product is displayed in cart page with exact quantity