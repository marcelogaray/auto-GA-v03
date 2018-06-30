package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignModalEdit extends BasePage {

    @FindBy(id = "mat-dialog-1")
    private WebElement modalEdit;

    @FindBy(className = "mat-card")
    private WebElement employeeName;

    @FindBy(className = "mat-input-2")
    private WebElement equipmentName;

    @FindBy(name = "edit")
    private WebElement editAssignmentInModal;

    @FindBy(name = "actualizar")
    private WebElement actualizarAssignment;

    @FindBy(name = "closeEdit")
    private WebElement closeModalEdit;

    public boolean isModalEditPresent() {
        return modalEdit.isDisplayed();
    }

    public void isEditButtonVisible() {
        CommonEvents.waitWebElementIsVisible(editAssignmentInModal);
    }

    public void isActualizarButtonVisible() {
        CommonEvents.waitWebElementIsVisible(actualizarAssignment);
    }

    public String getEmployeeName() {
        isActualizarButtonVisible();
        return employeeName.getText();
    }

    public String getEquipmentName() {
        isActualizarButtonVisible();
        return equipmentName.getText();
    }

    public void clickAssignmentSpecific() {
        isEditButtonVisible();
        CommonEvents.clickButton(editAssignmentInModal);
    }

    public void closeModalEdit() {
        CommonEvents.clickButton(closeModalEdit);
    }
}