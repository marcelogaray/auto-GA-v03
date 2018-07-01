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

    @FindBy(className = "mat-card")
    private WebElement employeeName;

    @FindBy(className = "mat-list-item-content")
    private WebElement equipmentName;

    public boolean isModalDialogPresent() {
        return assignmentModal.isDisplayed();
    }

    public String getEmployeeName() {
        return employeeName.getText();
    }

    public String getEquipmentName() {
        return equipmentName.getText();
    }

    public void isButtonCloseVisible() {
        CommonEvents.waitWebElementIsVisible(close);
    }

    public void closeModalView() {
        isButtonCloseVisible();
        CommonEvents.clickButton(close);
    }
}