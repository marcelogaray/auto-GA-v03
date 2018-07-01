package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignModalView extends BasePage {
    @FindBy(id = "mat-dialog-1")
    private WebElement assignmentModal;

    @FindBy(name = "close")
    private WebElement close;

    @FindBy(name = "closeX")
    private WebElement closeX;

    public boolean isModalDialogPresent() {
        return assignmentModal.isDisplayed();
    }

    public void isCerrarButtonVisible() {
        CommonEvents.waitWebElementIsVisible(close);
    }

    public void isCloseXButtonVisible() {
        CommonEvents.waitWebElementIsVisible(closeX);
    }

    public void clickclose() {
        CommonEvents.clickButton(close);
    }

    public void clickCloseX() {
        CommonEvents.clickButton((closeX));
    }
}