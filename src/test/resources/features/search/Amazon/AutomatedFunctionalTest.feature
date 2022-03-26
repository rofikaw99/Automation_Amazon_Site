Feature: Automated Functional Test

  @AmazonAutomation
  Scenario Outline: Automated Functional Test Amazon
    Given Open browser and navigate to the site
    When Navigate to the left sidebar, select for products by department electronics and then television & video
    And Select the “televisions” then select “32 inches & under” from left side refinery
    And From appearing search results, navigate to the sorting dropdown and sort the items by price descending
    And Write utility function The function should return the given ‘N’ item prices and the item names as a list, based on the previous search That very same function also should return the products whose price is less than $"<N>" and whose model year is 2017
    And Click on the product link for the first product in search result and go to the product page.
    And Click on ‘add to list’
    Then Verify if the Sign In page is showing up (since users haven’t logged in yet)
    When Enter some random username and submit
    Then Assert the error appearance then get the text from that error
    Examples: Input
      | N   |
      | 150 |
