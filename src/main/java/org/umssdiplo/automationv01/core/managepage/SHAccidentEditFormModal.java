package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentEditFormModal extends BasePage {

    @FindBy(id = "editAccidentTitle")
    private WebElement editTitleModal;

    @FindBy(name = "employee")
    private WebElement employeeAuto;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "code")
    private WebElement code;

    @FindBy(name = "levelRisk")
    private WebElement levelRisk;

    @FindBy(name = "accidentTypeKey")
    private WebElement accidentTypeSelect;

    @FindBy(name = "dateEvent")
    private WebElement dateEvent;

    @FindBy(name = "describeIssue")
    private WebElement description;

    @FindBy(name = "status")
    private WebElement statusSelect;

    @FindBy(id = "save")
    private WebElement saveButton;

    @FindBy(id = "cancel")
    private WebElement cancelButton;

    public boolean isEditModalPresent() {
        return CommonEvents.isPresent(editTitleModal);
    }

    public String getEmployeeValue() {
        return employeeAuto.getAttribute("value");
    }

    public String getTitleValue() {
        return title.getAttribute("value");
    }

    public String getCodeValue() {
        return code.getAttribute("value");
    }

    public String getLevelRiskValue() {
        return levelRisk.getAttribute("value");
    }

    public String getAccidentTypeValue() {
        return accidentTypeSelect.getAttribute("value");
    }

    public String getDateEventValue() {
        return dateEvent.getAttribute("value");
    }

    public String getDescriptionValue() {
        return description.getAttribute("value");
    }

    public String getStatusValue() {
        return statusSelect.getAttribute("value");
    }

    public void setTitleField() {
        CommonEvents.clearInputField(title);
        CommonEvents.pressEnterKey(title);
        CommonEvents.backPress(title);
    }

    public void setEditTitleModal() {
        CommonEvents.clearInputField(title);
        CommonEvents.setInputField(title, "Titulo Accidente 4");
    }

    public boolean isSaveBtnEnable() {
        CommonEvents.waitUntil(3000);
        return CommonEvents.isAttributPresent(saveButton, "disabled");
    }

    public void clickCodeField() {
        CommonEvents.jsClickElement(code);
        CommonEvents.setInputField(code, "Code");
    }

    public void setCodeField() {
        CommonEvents.setInputField(code, "Codigo 4");
    }

    public void setLevelRiskField() {
        CommonEvents.setInputField(levelRisk, "4");
    }

    public void setDescriptionField() {
        CommonEvents.setInputField(description, "Descripcion 4");
    }

    public SHAccident clickSaveButton() {
        CommonEvents.waitUntil(2000);
        CommonEvents.clickButton(saveButton);
        return new SHAccident();
    }

    public void clickCancelButton() {
        CommonEvents.waitUntil(2000);
        CommonEvents.clickButton(cancelButton);
    }

    public void fillEditModalForm() {
        setEditTitleModal();
        setCodeField();
        setLevelRiskField();
        setDescriptionField();
    }
}