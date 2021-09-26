package pages;

import pages.android.*;
import pages.ios.AlertViewsPage;
import pages.ios.HomePage;
import pages.ios.PickerViewsPage;
import pages.ios.SwitchesPage;

public class AllPages {
    public AllPages(){}
    //Create private object for each page classes
    private APIDemosPage apiDemosPage;
    private DragDropPage dragDropPage;
    private MainPage mainPage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private PreferencePage preferencePage;
    private SwitchPage switchPage;
    private ViewsPage viewsPage;
    private DateWidgetsPage dateWidgetsPage;
    private ExpandableListPage expandableListPage;
    private SpinnerPage spinnerPage;
    //below belongs to IOS app
    private HomePage homePage;
    private AlertViewsPage alertViewsPage;
    private SwitchesPage switchesPage;
    private PickerViewsPage pickerViewsPage;

    //create public methods with class return type and put the condition
    //and create an object and return it
    public APIDemosPage apiDemosPage(){
        if (apiDemosPage == null){
            apiDemosPage = new APIDemosPage();
        }
        return apiDemosPage;
    }
    public DragDropPage dragDropPage(){
        if (dragDropPage == null){
            dragDropPage = new DragDropPage();
        }
        return dragDropPage;
    }

    public SwitchPage switchPage(){
        if (switchPage == null){
            switchPage = new SwitchPage();
        }
        return switchPage;
    }
    public PreferencePage preferencePage(){
        if (preferencePage == null){
            preferencePage = new PreferencePage();
        }
        return preferencePage;
    }
    public ViewsPage viewsPage(){
        if (viewsPage == null){
            viewsPage =  new ViewsPage();
        }
        return viewsPage;
    }

    public DateWidgetsPage dateWidgetsPage(){
        if (dateWidgetsPage == null){
            dateWidgetsPage = new DateWidgetsPage();
        }
        return dateWidgetsPage;
    }

    public ExpandableListPage expandableListPage(){
        if (expandableListPage == null){
            expandableListPage = new ExpandableListPage();
        }
        return expandableListPage;
    }

    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }

    public AlertViewsPage alertViewsPage(){
        if (alertViewsPage == null){
            alertViewsPage = new AlertViewsPage();
        }
        return alertViewsPage;
    }
    public MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage == null){
            preferenceDependenciesPage = new PreferenceDependenciesPage();
        }
        return preferenceDependenciesPage;
    }

    public SwitchesPage switchesPage(){
        if (switchesPage == null){
            switchesPage = new SwitchesPage();
        }
        return switchesPage;
    }

    public PickerViewsPage pickerViewsPage(){
        if (pickerViewsPage == null){
            pickerViewsPage = new PickerViewsPage();
        }
        return pickerViewsPage;
    }
    public SpinnerPage spinnerPage(){
        if (spinnerPage == null){
            spinnerPage = new SpinnerPage();
        }
        return spinnerPage;
    }

}
