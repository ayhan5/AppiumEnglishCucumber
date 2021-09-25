@scrollUiScrollable
  Feature: API Demos
    Scenario: UiScrollable operations
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Views
      Then user clicks on Switches with UiScrollable

    Scenario: use reusable method for scrolling
      Given install the app on device
      When user click on "API Demos"
      When user click on "Views"
      When user click on "Switches"
