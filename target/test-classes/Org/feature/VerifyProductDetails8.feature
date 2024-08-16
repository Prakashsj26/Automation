Feature: Verify All Products and product detail page

Scenario:

Given the User Launch URL
Then the user  Verify that home page is visible successfully
When the user  Click on Products button
Then the user  Verify user is navigated to ALL PRODUCTS page successfully
Then the user verify The products list is visible
When the user Click on View Product of first product
And the User is landed to product detail page
Then the user  Verify that detail detail is visible: product name, category, price, availability, condition, brand name