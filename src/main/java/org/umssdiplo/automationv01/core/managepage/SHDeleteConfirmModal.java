package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import sun.security.provider.SHA;

public class SHDeleteConfirmModal extends BasePage {

    @FindBy(xpath = "//*[@id=\"mat-dialog-title-0\"]/div[1]")
    private WebElement deleteConfirmModal;

    @FindBy(id = "delete")
    private WebElement deleteButton;

    public boolean isModalDialogPresent() {
        return deleteConfirmModal.isDisplayed();
    }

    public SHAccident clickDeleteButton() {
        CommonEvents.waitUntil(2000);
        CommonEvents.clickButton(deleteButton);
        CommonEvents.waitUntil(3000);
        return new SHAccident();
    }
}
