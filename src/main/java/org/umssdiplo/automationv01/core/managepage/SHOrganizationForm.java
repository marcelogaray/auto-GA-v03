package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.dataTypes.Organization;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHOrganizationForm extends BasePage {

    @FindBy(name= "cancelNewOrganization")
    private WebElement cancelButton;

    @FindBy(name = "saveNewOrganization")
    private WebElement createButton;

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "description")
    private WebElement descriptionInputField;

    @FindBy(name = "gestion")
    private WebElement gestionInputField;

    @FindBy(name = "code")
    private WebElement codeInputField;

    @FindBy(name = "start")
    private WebElement startDateField;

    @FindBy(name = "end")
    private WebElement endDateField;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-organization-form/form/mat-dialog-content/p/mat-input-container[7]/div/div[1]")
    private WebElement nivelJerarquicoDropDown;

    @FindBy(xpath = "//*[@id=\"mat-option-2\"]")
    private WebElement selectedOptionDropDown;

    @FindBy(id = "swal2-content")
    private WebElement alertContent;

    @FindBy(className = "swal2-confirm")
    private WebElement confirmAlertButton;

    @FindBy(name = "newOrganizationForm")
    private WebElement formModal;

    public SHOrganizationForm(){
        CommonEvents.waitWebElementIsVisible(createButton);
    }

    public boolean isAlertPresent() {
        return alertContent.isDisplayed();
    }

    public void cancelModal(){
        CommonEvents.clickButton(cancelButton);
    }

    public void fillOrganizationDataInModalForm(Organization organization) {
        setNameInputField(organization.getName());
        setDescriptionInputField(organization.getDescription());
        setGestionInputField(organization.getGestion());
        setCodeInputField(organization.getCode());
        setStartDateField(organization.getStart());
        setEndDateField(organization.getEnd());
        setNivelJerarquicoDropDownField();

    }

    private void setNivelJerarquicoDropDownField() {
        CommonEvents.clickButton(nivelJerarquicoDropDown);
        CommonEvents.clickButton(selectedOptionDropDown);
    }

    private void setEndDateField(String end) {
        CommonEvents.setDateInputField(endDateField, end);
    }

    private void setStartDateField(String start) {
        CommonEvents.setDateInputField(startDateField, start);
    }

    private void setCodeInputField(String code) {
        CommonEvents.setInputField(codeInputField, code);
    }

    private void setGestionInputField(String gestion) {
        CommonEvents.setInputField(gestionInputField, gestion);
    }

    private void setDescriptionInputField(String description) {
        CommonEvents.setInputField(descriptionInputField, description);
    }

    private void setNameInputField(String name) {
        CommonEvents.setInputField(nameInputField, name);
    }

    public void saveOrganizationModalForm() {
        CommonEvents.clickButton(createButton);
    }

    public void pressConfirmAlertButton() {
        CommonEvents.clickButton(confirmAlertButton);
        CommonEvents.waitUntil(500);
    }

    public boolean isModalFormPresent() {
        return formModal.isDisplayed();
    }
}