Feature:  Place Order: Register before Checkout

Scenario:

Given the user Launch URL
Then the user Verify that home page is visible successfully
When the user Click Signup - Login button
And the user Fill all details in Signup and create account
Then the user Verify ACCOUNT CREATED! and click Continue button
Then the user Verify Logged in as username at top
When the User Add products to cart
And the user Click Cart button
Then the user Verify that cart page is displayed
When the user Click Proceed To Checkout
Then the user Verify Address Details and Review Your Order
When the user Enter description in comment text area and click Place Order
And the user Enter payment details: Name on Card, Card Number, CVC, Expiration date
And the user Click Pay and Confirm Order button
Then Verify success message Your order has been placed successfully!
When the user Click Delete Account button
Then the user Verify ACCOUNT DELETED! and click Continue button