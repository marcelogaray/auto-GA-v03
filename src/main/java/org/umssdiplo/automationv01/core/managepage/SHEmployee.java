package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEmployee extends BasePage {

    @FindBy(name = "new_employee_button")
    private WebElement addEmployeeButton;

    public SHEmployee() {
        CommonEvents.waitWebElementIsVisible(addEmployeeButton);
    }

    @FindBy(xpath = "//mat-list/mat-list-item[1]/div/a[3]")
    private WebElement deleteButton;

    @FindBy(xpath = "//mat-list/mat-list-item[1]/div/a[4]")
    private WebElement assignmentItenButton;

    @FindBy(xpath = "//mat-list/mat-list-item[47]/div/a[1]")
    private WebElement detailsButton;

    @FindBy(id = "swal2-content")
    private WebElement alertContent;

    @FindBy(className = "swal2-confirm")
    private WebElement confirmAlertButton;

    @FindBy(className = "swal2-cancel")
    private WebElement cancelAlertButton;

    @FindBy(xpath = "//div[@class='mat-list-item-content']/p[contains(text(),'EMP-')]")
    private WebElement detailsEmployee;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-positionalhitoricalform/form/mat-dialog-content/p[1]/mat-input-container/div")
    private WebElement itemDropDownList;

    @FindBy(xpath = "//*[@id=\"mat-option-2\"]")
    private WebElement itemOptionList;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-positionalhitoricalform/form/mat-dialog-actions/button[1]")
    private WebElement cancelItemForm;



    public void clickDeleteButton() {
        CommonEvents.clickButton(deleteButton);
    }

    public void clickConfirmAlertButton() {
        CommonEvents.clickButton(confirmAlertButton);
        CommonEvents.waitUntil(500);
    }

    public void clickAcceptAlertButton() {
        CommonEvents.clickButton(confirmAlertButton);
        CommonEvents.waitUntil(500);
    }

    public void clickCancelAlertButton() {
        CommonEvents.clickButton(cancelAlertButton);
        CommonEvents.waitUntil(500);
    }

    public boolean isAlertPresent() {
        return CommonEvents.isVisible(alertContent);
    }

    public boolean isAlertVisible() {
        return CommonEvents.isVisible(alertContent);
    }

    public void clickViewDetailsEmployee() {
        CommonEvents.clickButton(detailsButton);
    }

    public boolean isDetailsVisible() {
        return CommonEvents.isVisible(detailsEmployee);
    }

    public void clickAssignItemButton() {
        CommonEvents.clickButton(assignmentItenButton);
    }

    public void clickItemDropDownList() {
        CommonEvents.clickButton(itemDropDownList);
    }

    public boolean isItemOptionsVisible() {
        return CommonEvents.isPresent(itemOptionList);
    }

    public void cancelItemAssignmentModal() {
        CommonEvents.clickButton(itemOptionList);
        CommonEvents.clickButton(cancelItemForm);
        CommonEvents.waitUntil(500);
    }

    public SHNewEmployeeForm clickNewEmployeeButton() {
        CommonEvents.clickButton(addEmployeeButton);
        return new SHNewEmployeeForm();
    }
}
