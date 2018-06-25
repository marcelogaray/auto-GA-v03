package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "new_assignment")
    private WebElement newAssignmentElement;

    public SHAssignModalForm clickFormModal (){
        CommonEvents.clickButton(newAssignmentElement);
        return new SHAssignModalForm();
    }
}