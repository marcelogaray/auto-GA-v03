package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SHDeleteConfirmModal extends BasePage {
    @FindBy(xpath = "//*[@id=\"mat-dialog-title-0\"]/div[1]")
    private WebElement deleteConfirmModal;

    public boolean isModalDialogPresent() {
        return deleteConfirmModal.isDisplayed();
    }
}
