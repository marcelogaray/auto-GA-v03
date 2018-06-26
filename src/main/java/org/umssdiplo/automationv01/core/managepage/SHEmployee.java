package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEmployee extends BasePage {

    @FindBy(xpath = "//mat-list/mat-list-item[1]/div/a[3]")
    private WebElement deleteButton;

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

    public void clickDeleteButton() {
        CommonEvents.clickButton(deleteButton);
    }

    public void clickConfirmAlertButton() {
        CommonEvents.clickButton(confirmAlertButton);
    }

    public void clickAcceptAlertButton() {
        CommonEvents.clickButton(confirmAlertButton);
    }

    public void clickCancelAlertButton() {
        CommonEvents.clickButton(cancelAlertButton);
    }

    public boolean isAlertPresent() {
        return CommonEvents.isVisible(alertContent);
    }

    public boolean isAlertVisible() {
        return CommonEvents.isVisible(alertContent);
    }

    public void clickViewDetailsEmployee() {
        CommonEvents.clickButton(detailsButton);
        CommonEvents.waitUntil(25);
    }

    public boolean isDetailsVisible() {
        return CommonEvents.isVisible(detailsEmployee);
    }
}
