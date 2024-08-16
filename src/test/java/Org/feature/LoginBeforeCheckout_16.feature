Feature: Place Order: Login before Checkout

Scenario:

Given the user Launch URL
Then the user Verify that home page is visible successfully
When the user Click Signup - Login button
And the user Fill email, password and click Login button
Then the user Verify Logged in as username at top
When the user Add products to cart
And the user Click Cart button
Then the user Verify that cart page is displayed
When the user Click Proceed To Checkout
Then the user Verify Address Details and Review Your Order
When the user Enter description in comment text area and click Place Order
And the user Enter payment details: Name on Card, Card Number, CVC, Expiration date
And the user Click Pay and Confirm Order button
Then the user Verify success message Your order has been placed successfully!
When the user Click Delete Account button
Then the user Verify ACCOUNT DELETED! and click Continue button