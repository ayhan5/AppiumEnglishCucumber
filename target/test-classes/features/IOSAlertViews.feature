@alertViews
  Feature: UiCatalog
    Scenario: text box test
      Given install the ios app on device
      When user clicks on Alert Views button
      When user clicks on Text Entery button
      And user provide a text to text box "Appium Course"
      Then user clicks OK button on IOS
      Then take the screenshot