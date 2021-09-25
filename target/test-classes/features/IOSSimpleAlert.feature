@simple
  Feature: UiCataolog test
    Scenario: Secure text test
      Given install the ios app on device
      When user clicks on Alert Views button
      When user clicks on Simple button
      And user verify popup is displayed
      Then user clicks OK button on IOS
      Then take the screenshot