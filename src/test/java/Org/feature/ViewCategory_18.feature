Feature: View Category Products

Scenario:

Given the user Launch Url
Then the user Verify that categories are visible on left side bar
When the user Click on Women category
And the user Click on any category link under Women category, for example: Dress
Then the user Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
When the user On left side bar, click on any sub-category link of Men category
Then the user Verify that user is navigated to that category page