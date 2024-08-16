Feature: Add Products in Cart

Scenario:

Given the user Launch URL
Then the user Verify that home page is visible successfully
When the user Click Products button
And the user Hover over first product and click Add to cart 
And the user  Click Continue Shopping button
And the user  Hover over second product and click Add to cart
And  the user Click View Cart button
Then the user Verify both products are added to Cart
Then  the user  Verify their prices, quantity and total price