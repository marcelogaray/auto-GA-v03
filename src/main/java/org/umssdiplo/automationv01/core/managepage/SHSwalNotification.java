package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHSwalNotification extends BasePage {

    @FindBy(className = "swal2-popup")
    private WebElement dialog;

    @FindBy(id = "swal2-content")
    private WebElement message;

    @FindBy(className = "swal2-success")
    private WebElement successIcon;

    @FindBy(className = "swal2-warning")
    private WebElement warningIcon;

    @FindBy(className = "swal2-question")
    private WebElement questionIcon;

    @FindBy(className = "swal2-info")
    private WebElement infoIcon;

    @FindBy(className = "swal2-confirm")
    private WebElement acceptBtn;

    public SHSwalNotification() {
        dialog.isDisplayed();
    }

    public boolean isDialogPresent() {
        return dialog.isDisplayed();
    }

    public boolean isSuccess() {
        return successIcon.isDisplayed();
    }

    public void clickAcceptBtn() {
        CommonEvents.jsClickElement(acceptBtn);
    }
}