package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHOrganization extends BasePage {
    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newOrganization_button")
    private WebElement newOrganizationbutton;

    @FindBy(name = "newOrganizationForm")
    private WebElement formModal;

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

    public void openOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public void openModalOrganizationForm(){
        CommonEvents.clickButton(newOrganizationbutton);
    }

    public boolean isModalFormPresent() {
        return formModal.isDisplayed();
    }

    public boolean isAlertPresent() {
        return alertContent.isDisplayed();
    }

    public void cancelModal(){
        CommonEvents.clickButton(cancelButton);
    }

    public void fillOrganizationDataInModalForm() {
        if(this.isModalFormPresent()){
        setNameInputField();
        setDescriptionInputField();
        setGestionInputField();
        setCodeInputField();
        setStartDateField();
        setEndDateField();
        setNivelJerarquicoDropDownField();
        }
    }

    private void setNivelJerarquicoDropDownField() {
        CommonEvents.clickButton(nivelJerarquicoDropDown);
        CommonEvents.clickButton(selectedOptionDropDown);
    }

    private void setEndDateField() {
        CommonEvents.setDateInputField(endDateField, PropertyAccessor.getInstance().getTextValueProperty("end"));
    }

    private void setStartDateField() {
        CommonEvents.setDateInputField(startDateField, PropertyAccessor.getInstance().getTextValueProperty("start"));
    }

    private void setCodeInputField() {
        CommonEvents.setInputField(codeInputField, PropertyAccessor.getInstance().getTextValueProperty("code"));
    }

    private void setGestionInputField() {
        CommonEvents.setInputField(gestionInputField, PropertyAccessor.getInstance().getTextValueProperty("gestion"));
    }

    private void setDescriptionInputField() {
        CommonEvents.setInputField(descriptionInputField, PropertyAccessor.getInstance().getTextValueProperty("description"));
    }

    private void setNameInputField() {
        CommonEvents.setInputField(nameInputField, PropertyAccessor.getInstance().getTextValueProperty("name"));
    }

    public void saveOrganizationModalForm() {
        CommonEvents.clickButton(createButton);
    }

    public void pressConfirmAlertButton() {
        CommonEvents.clickButton(confirmAlertButton);
    }
}