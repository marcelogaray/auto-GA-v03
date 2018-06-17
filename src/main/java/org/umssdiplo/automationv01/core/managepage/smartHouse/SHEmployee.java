package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHEmployee extends BasePage {

    @FindBy(name = "emp_button")
    private WebElement employeeTab;

    @FindBy(name = "new_employee_button")
    private WebElement addEmployeeButton;

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

    @FindBy(xpath = "//*[@id=\"mat-option-4\"]")
    private WebElement organizationOption;

    @FindBy(xpath = "/html/body/app-root/app-employeeform/form/mat-card/mat-list/mat-list-item[1]/div/mat-input-container/div/div[1]/div")
    private WebElement organizationSelect;

    @FindBy(xpath = "/html/body/app-root/app-employeeform/form/mat-card/mat-list/mat-list-item[9]/div/mat-input-container/div/div[1]/div")
    private WebElement statusSelect;

    @FindBy(xpath = "//*[@id=\"mat-option-2\"]")
    private WebElement statusOption;

    @FindBy(xpath = "/html/body/app-root/app-employeeform/form/mat-card/mat-list/mat-list-item[6]/div/mat-input-container/div/div[1]/div")
    private WebElement genderSelect;

    @FindBy(xpath = "//*[@id=\"mat-option-1\"]")
    private WebElement genderOption;




    public void setEmployeeForm() {
        CommonEvents.clickButton(employeeTab);
        CommonEvents.clickButton(addEmployeeButton);
        String employeeCode = PropertyAccessor.getInstance().getSHDataProperty("employeeCode");
        String firstName = PropertyAccessor.getInstance().getSHDataProperty("firstName");
        String lastName = PropertyAccessor.getInstance().getSHDataProperty("lastName");
        String birthDate = PropertyAccessor.getInstance().getSHDataProperty("birthDate");
        String nationality = PropertyAccessor.getInstance().getSHDataProperty("nationality");
        String admisionDate = PropertyAccessor.getInstance().getSHDataProperty("admisionDate");
        String registrationDate = PropertyAccessor.getInstance().getSHDataProperty("registrationDate");
        //CommonEvents.setInputField(organizationKeyElement, organizationKey);
        CommonEvents.jsClickElement(organizationSelect);
        CommonEvents.jsClickElement(organizationOption);
        CommonEvents.setInputField(employeeCodeElement, employeeCode);
        CommonEvents.setInputField(firstNameElement, firstName);
        CommonEvents.setInputField(lastNameElement, lastName);
        CommonEvents.jsClickElement(genderSelect);
        CommonEvents.jsClickElement(genderOption);
        CommonEvents.setInputField(nationalityElement, nationality);
        CommonEvents.jsClickElement(statusSelect);
        CommonEvents.jsClickElement(statusOption);
        CommonEvents.setInputField(birthDateElement, birthDate);
        CommonEvents.setInputField(admisionDateElement, admisionDate);
        CommonEvents.setInputField(registrationDateElement, registrationDate);
        CommonEvents.clickButton(acceptNewEmployee);
    }
}
