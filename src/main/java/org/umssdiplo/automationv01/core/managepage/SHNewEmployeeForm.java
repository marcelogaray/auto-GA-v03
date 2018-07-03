package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

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

    @FindBy(className = "swal2-confirm")
    private WebElement acceptButtonMessageConfirmation;

    public SHNewEmployeeForm() {
        CommonEvents.waitWebElementIsVisible(acceptNewEmployee);
    }

    private void setEmployeeCodeInputField(String employeeCode) {
        CommonEvents.setInputField(employeeCodeElement, employeeCode);
    }

    private void setEmployeeNameInputField(String employeeName) {
        CommonEvents.setInputField(firstNameElement, employeeName);
    }

    private void setEmployeeLastNameInputField(String employeeLastName) {
        CommonEvents.setInputField(lastNameElement, employeeLastName);
    }

    private void setEmployeeNacionalityInputField(String employeeNacionality) {
        CommonEvents.setInputField(nationalityElement, employeeNacionality);
    }

    private void setEmployeeBirthDateInputField(String birthDate) {
        CommonEvents.setDateInputField(birthDateElement, birthDate);
    }

    private void setEmployeeAdmisionDateInputField(String admisionDate) {
        CommonEvents.setDateInputField(admisionDateElement, admisionDate);
    }

    private void setEmployeeRegistrationDateInputField(String registrationDate) {
        CommonEvents.setDateInputField(registrationDateElement, registrationDate);
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

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    public void fillNewEmployeeForm(Employee employee) {
        clickOrganizationSelect();
        selectOrganization();
        setEmployeeCodeInputField(employee.getEmployeeCode());
        setEmployeeNameInputField(employee.getFirstName());
        setEmployeeLastNameInputField(employee.getLastName());
        setEmployeeBirthDateInputField(employee.getBirthDate());
        clickGenderSelect();
        selectGender();
        setEmployeeNacionalityInputField(employee.getNationality());
        setEmployeeAdmisionDateInputField(employee.getAdmisionDate());
        clickStatusSelect();
        selectStatus();
        setEmployeeRegistrationDateInputField(employee.getRegistrationDate());
    }

    public void clickAcceptButtonMessage() {
        CommonEvents.clickButton(acceptButtonMessageConfirmation);
    }
}