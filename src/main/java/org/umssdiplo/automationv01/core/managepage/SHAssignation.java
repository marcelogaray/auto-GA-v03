package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "new_assignment")
    private WebElement addAssignmentButton;

    @FindBy(name = "edit_assignment")
    private WebElement editModal;

    @FindBy(name = "view_assignment")
    private WebElement viewButton;

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewButton);
    }

    public SHAssignmentNewModal newAssignment() {
        CommonEvents.clickButton(addAssignmentButton);
        return new SHAssignmentNewModal();
    }

    public SHAssignmentEditModal clicViewEditModal() {
        CommonEvents.clickButton(editModal);
        return new SHAssignmentEditModal();
    }
}