Feature: Add review on product

Scenario:

Given the user Launch URL
When the user Click on Products button
Then the user Verify user is navigated to ALL PRODUCTS page successfully
When the user Click on View Product button
Then the user Verify Write Your Review is visible
When the user Enter name, email and review
And the user Click Submit button
Then the user Verify success message Thank you for your review.