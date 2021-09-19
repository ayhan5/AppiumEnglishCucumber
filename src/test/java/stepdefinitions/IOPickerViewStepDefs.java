package stepdefinitions;

import io.cucumber.java.en.When;
import pages.AllPages;

public class IOPickerViewStepDefs {
    AllPages elements = new AllPages();
    @When("user clicks on Picker Views")
    public void user_clicks_on_picker_views() {
      elements.homePage().pickerViewButton.click();
    }

    @When("first column should be {string}")
    public void first_column_should_be(String first) {
     elements.pickerViewsPage().firstColumn.sendKeys(first);
    }

    @When("second column should be {string}")
    public void second_column_should_be(String second) {
        elements.pickerViewsPage().secondColumn.sendKeys(second);
    }

    @When("third column should be {string}")
    public void third_column_should_be(String third) {
       elements.pickerViewsPage().thirdColumn.sendKeys(third);
    }

}
