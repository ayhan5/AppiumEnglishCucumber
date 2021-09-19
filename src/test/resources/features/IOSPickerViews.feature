@picker
  Feature: UIcatalog test
    Scenario: picker views test
      Given install the ios app on device
      When user clicks on Picker Views
      And first column should be "50"
      And second column should be "200"
      And third column should be "150"
      Then take the screenshot