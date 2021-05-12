Feature: Search and place order for vegetables

@Test
Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User serached for Cucumber vegetables
Then "Cucumber" results are displayed


@RegressionTest
Scenario: Search for items and then move to checkout page
Given User is on Greencart Landing page
When User serached for <Name> vegetables
And Added itmes to cart
And User proceeded to Checkout page for purchase
Then verify selected <Name> items are displayed in checkout page


Examples:
|Name |
|Brinjal  |
|Beetroot|