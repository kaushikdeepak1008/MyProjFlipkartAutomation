Feature: Place order via global search flow

Scenario: Add to cart
Given user is on product page
When user clicks on ADD TO CART button
Then page should be redirected to cart page
And selected shirt should be added in the cart

Scenario: Place order
Given user is on cart page
When user clicks on PLACE ORDER button
Then page should be redirected to Login or Signup page