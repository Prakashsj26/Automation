Feature: Search Products and Verify Cart After Login

Scenario:

Given the user Launch URL
When the user Click on Products button
Then the user Verify user is navigated to ALL PRODUCTS page successfully
When the user Enter product name in search input and click search button
And the user Verify SEARCHED PRODUCTS is visible
Then the user Verify all the products related to search are visible
When the user Add those products to cart
And the user Click Cart button and
Then the user verify that products are visible in cart
When the user Click Signup - Login button and submit login details
And the user Again, go to Cart page
Then the user Verify that those products are visible in cart after login as well