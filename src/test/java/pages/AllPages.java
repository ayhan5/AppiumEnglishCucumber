package pages;

import pages.android.*;

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

}
