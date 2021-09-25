@iosScroll
  Feature: IOS scrolling method
    Background: precondition
      Given install the ios app on device
    Scenario: scrolling with ios
      Then scroll on ios
@scrollTillElement
    Scenario: scroll and find toolbars
      When user scroll and clicks on Toolbars
@reusableScrollMethod
    Scenario:  scroll with reusable method
      When user click on "Switches" page on IOS
