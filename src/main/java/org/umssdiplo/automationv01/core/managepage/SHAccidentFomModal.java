package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SHAccidentFomModal extends BasePage {

    @FindBy(id = "mat-dialog-1")
    private WebElement modalDialog;


    public boolean isModalDialogPresent() {
        boolean resp;
        resp = modalDialog.isDisplayed();
        return resp;
    }
}
