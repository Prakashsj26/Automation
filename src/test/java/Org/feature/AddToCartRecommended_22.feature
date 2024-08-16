Feature: Add to cart from Recommended items

Scenario:

Given the user Launch URL
When the user Scroll to bottom of page
Then the user Verify RECOMMENDED ITEMS are visible
When the user Click on Add To Cart on Recommended product
And the user Click on View Cart button
Then the user Verify that product is displayed in cart page