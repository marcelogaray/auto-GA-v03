package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHNewEmployeeForm extends BasePage {
    @FindBy(name = "save_employee_btn")
    private WebElement acceptNewEmployee;

    @FindBy(name = "organizationKey")
    private WebElement organizationKeyElement;

    @FindBy(name = "employeeCode")
    private WebElement employeeCodeElement;

    @FindBy(name = "firstName")
    private WebElement firstNameElement;

    @FindBy(name = "lastName")
    private WebElement lastNameElement;

    @FindBy(name = "birthDate")
    private WebElement birthDateElement;

    @FindBy(name = "gender")
    private WebElement genderElement;

    @FindBy(name = "nationality")
    private WebElement nationalityElement;

    @FindBy(name = "admisionDate")
    private WebElement admisionDateElement;

    @FindBy(name = "status")
    private WebElement statusElement;

    @FindBy(name = "registrationDate")
    private WebElement registrationDateElement;

    @FindBy(id = "mat-option-4")
    private WebElement organizationOption;

    @FindBy(name = "organizationKey")
    private WebElement organizationSelect;

    @FindBy(name = "status")
    private WebElement statusSelect;

    @FindBy(id = "mat-option-2")
    private WebElement statusOption;

    @FindBy(name = "gender")
    private WebElement genderSelect;

    @FindBy(id = "mat-option-1")
    private WebElement genderOption;

    @FindBy(id = "swal2-content")
    private WebElement messageAlert;

    public SHNewEmployeeForm() {
        CommonEvents.waitWebElementIsVisible(acceptNewEmployee);
    }

    private void setEmployeeCodeInputField() {
        CommonEvents.setInputField(employeeCodeElement, PropertyAccessor.getInstance().getNewEmployeeCode());
    }

    private void setEmployeeNameInputField() {
        CommonEvents.setInputField(firstNameElement, PropertyAccessor.getInstance().getNewEmployeeName());
    }

    private void setEmployeeLastNameInputField() {
        CommonEvents.setInputField(lastNameElement, PropertyAccessor.getInstance().getNewEmployeeLastName());
    }

    private void setEmployeeNacionalityInputField() {
        CommonEvents.setInputField(nationalityElement, PropertyAccessor.getInstance().getNewEmployeeNacionality());
    }

    private void setEmployeeBirthDateInputField() {
        CommonEvents.setDateInputField(birthDateElement, PropertyAccessor.getInstance().getNewEmployeeBirthDate());
    }

    private void setEmployeeAdmisionDateInputField() {
        CommonEvents.setDateInputField(admisionDateElement, PropertyAccessor.getInstance().getNewEmployeeAdmisionDate());
    }

    private void setEmployeeRegistrationDateInputField() {
        CommonEvents.setDateInputField(registrationDateElement, PropertyAccessor.getInstance().getNewEmployeeRegistrationDate());
    }

    private void clickOrganizationSelect() {
        CommonEvents.clickButton(organizationSelect);
    }

    private void selectOrganization() {
        CommonEvents.clickButton(organizationOption);
    }

    private void clickGenderSelect() {
        CommonEvents.clickButton(genderSelect);
    }

    private void selectGender() {
        CommonEvents.clickButton(genderOption);
    }

    private void clickStatusSelect() {
        CommonEvents.clickButton(statusSelect);
    }

    private void selectStatus() {
        CommonEvents.clickButton(statusOption);
    }

    public void clickAcceptNewEmployee() {
        CommonEvents.clickButton(acceptNewEmployee);
    }

    public String getDuplicateCodeMessage() {
        String message = String.format(PropertyAccessor.getInstance().getNewEmployeeDuplicateCodeMessage(), PropertyAccessor.getInstance().getNewEmployeeCode());
        return message;
    }

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    public void fillNewEmployeeForm() {
        clickOrganizationSelect();
        selectOrganization();
        setEmployeeCodeInputField();
        setEmployeeNameInputField();
        setEmployeeLastNameInputField();
        setEmployeeBirthDateInputField();
        clickGenderSelect();
        selectGender();
        setEmployeeNacionalityInputField();
        setEmployeeAdmisionDateInputField();
        clickStatusSelect();
        selectStatus();
        setEmployeeRegistrationDateInputField();
    }
}