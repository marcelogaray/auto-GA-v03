package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SHAssignationModal extends BasePage{

    @FindBy(id = "new_assignment")
    private WebElement modalDialog;


    public boolean isModalDialogPresent() {

        return modalDialog.isDisplayed();
    }
}
