Feature: ATM Smilulator

  Scenario: Invalid card
    Given I Inserted a  invalid card
    When The card is verified
    Then Reject the card and exit

  Scenario Outline: Incorrect PIN number
    Given I enter a valid card
    When I enter incorrect PIN for the <Attempt number> time
    Then I see <Message> on the screen
    And the status of the card is: <Card status>

    Examples:
      | Attempt number | Message                                                                          | Card status          |
      | First          | Invalid PIN number                                                               | card NOT held by ATM |
      | Second         | Invalid PIN number                                                               | card NOT held by ATM |
      | Third          | Sorry, you have exceeded your number of invalid attempts. Forget your card now!! | card held by ATM     |

  Scenario Outline: Correct PIN number
    Given I enter a valid card
    When I enter correct PIN
    Then I see the options are <Options>


    Examples:
      | Options |
      |Cash withdrawal without receipt|
      |Cash withdrawal with receipt   |
      |Balance                        |
      |Cancel                         |




#
# Below are the Different other tests to test this application
#
#  To verify ATM card validation
  #  To verify invalid Pin entry
  #  To verify invalid Pin entry 3 times
  #  To verify Account Type selection
  #  To verify Invalid Account Type selection with respective
#  inserted card
  #  verify withdrawal option selection
  #  verify Amount entry
  #  verify Amount entry with wrong denominations(fr eg:999Rs)
  #  verify withdrawal success operation
  #  Verify operation when our entered amount is grater than
#  possible balance
  #  Verify operation when our entered amount is grater than
  #  day limit
  #  Verify when our ATM have lack of Amount
  #  Verify when our ATM have network problem
  #  Verify Current transaction No  exceeded than day limit
  #  Verify operation with exceeded delay in between
#  operations in ATM
  #  Verify Cancel after insert card
  #  Verify Cancel after Pin entry
  #  Verify Cancel after Amount type selection
  #  Verify Cancel after withdrawal operation
  #  Verify Cancel after Amount entry
  #  Verify correction of Amount during entry
