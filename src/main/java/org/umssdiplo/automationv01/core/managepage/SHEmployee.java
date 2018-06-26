package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEmployee extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-employee/div/div[1]/div[2]/div/mat-list/mat-list-item[1]/div/a[3]")
    private WebElement deleteButton;

    @FindBy(id = "swal2-content")
    private WebElement alertContent;

    @FindBy(className = "swal2-confirm")
    private WebElement confirmAlertButton;

    @FindBy(className = "swal2-cancel")
    private WebElement cancelAlertButton;

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
        CommonEvents.waitUntil(1000);
        return CommonEvents.isVisible(alertContent);
    }

    public boolean isAlertVisible() {
        CommonEvents.waitUntil(1000);
        return CommonEvents.isVisible(alertContent);
    }
}
