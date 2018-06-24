package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "view_assignment")
    private WebElement view_assignmentElement;
    @FindBy(name = "closeX")
    private WebElement closeX;

    public void viewAssignment(){
        CommonEvents.jsClickElement(view_assignmentElement);
    }

    public SHAssignModalView clicViewModal (){
        CommonEvents.clickButton(view_assignmentElement);
        return new SHAssignModalView();
    }

}