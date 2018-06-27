package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentFormModal extends BasePage {

    @FindBy(id = "mat-dialog-1")
    private WebElement modalDialog;

    @FindBy(id = "btnClose")
    private WebElement closeBtn;

    @FindBy(id = "create")
    private WebElement crearBtn;

    @FindBy(id = "btnCancel")
    private WebElement cancelBtn;

    @FindBy(name = "employee")
    private WebElement employeeAuto;

    @FindBy(id = "mat-option-19")
    private WebElement employeeOption;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "code")
    private WebElement code;

    @FindBy(name = "levelRisk")
    private WebElement levelRisk;

    @FindBy(name = "accidentTypeKey")
    private WebElement accidentTypeSelect;

    @FindBy(id = "mat-option-2")
    private WebElement accidentTypeOption1;

    @FindBy(id = "mat-option-105")
    private WebElement accidentTypeOption2;

    @FindBy(id = "mat-option-124")
    private WebElement accidentTypeOption3;

    @FindBy(name = "dateEvent")
    private WebElement dateEvent;

    @FindBy(name = "describeIssue")
    private WebElement description;

    @FindBy(name = "status")
    private WebElement statusSelect;

    @FindBy(id = "mat-option-0")
    private WebElement statusOption;

    public SHAccidentFormModal() {
        CommonEvents.isVisible(modalDialog);
    }

    public boolean isModalDialogPresent() {
        return modalDialog.isDisplayed();
    }

    public boolean isCrearBtnEnable() {
        return CommonEvents.isAttributPresent(crearBtn, "disabled");
    }
}