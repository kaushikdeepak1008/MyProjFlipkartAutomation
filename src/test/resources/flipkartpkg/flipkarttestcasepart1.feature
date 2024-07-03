Feature: Search Product via global search flow

Scenario: Global search
Given user is on flipkart website homepage
When user enter "shirts for men" on global search
Then page should display results

Scenario: Click on first searched item
Given user is on result page
When user clicks on first result
Then page should be redirected to product page

