package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "new_assignment")
    private WebElement addAssignmentButton;

    @FindBy(name = "delete_assignment")
    private WebElement editModal;

    public void newAssignment(){
        CommonEvents.clickButton(addAssignmentButton);
    }
    public SHAssignmentEditModal clicViewEditModal() {
        CommonEvents.clickButton(editModal);
        return new SHAssignmentEditModal();
    }
}
