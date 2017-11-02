@AmazonOrder
  Feature:Search For a Book and Add it to the cart

    @testCase
    Scenario:  Add a book to shopping cart from wish list

      Given I Open "Amazon.co.uk"
      When I search  for only books
      And Seach I  for "Charlie Cook's Favorite Book"
      And  I added the selected book to the shopping cart






