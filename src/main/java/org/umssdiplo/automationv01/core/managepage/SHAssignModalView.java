package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignModalView extends BasePage {
    @FindBy(id = "mat-dialog-1")
    private WebElement assignmentModal;

    @FindBy(name = "closeX")
    private WebElement closeX;

    @FindBy(name = "close")
    private WebElement close;

    public boolean isModalDialogPresent() {
        return assignmentModal.isDisplayed();
    }
    public void clickclose(){
        CommonEvents.clickButton(closeX);
    }
}