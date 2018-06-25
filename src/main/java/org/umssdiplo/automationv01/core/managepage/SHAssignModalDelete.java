package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignModalDelete extends BasePage {
    @FindBy(id = "mat-dialog-1")
    private WebElement editModal;

    @FindBy(name = "confirm_delete")
    private WebElement confirmDelete;

    public boolean isEditDialogPresent(){
        return editModal.isDisplayed();
    }
    @FindBy(id="mat-dialog-1")
    private WebElement confirmeDeleteModal;

    public void deleteOnEditForm(){
        CommonEvents.clickButton(confirmDelete);
    }
    public boolean isConfirmModalPresent(){
        return confirmDelete.isDisplayed();
    }









    @FindBy(id = "mat-dialog-1")
    private WebElement assignmentModal;

    @FindBy(name = "close")
    private WebElement close;

    @FindBy(name ="closeX")
    private WebElement closeX;

    public boolean isModalDialogPresent() {
        return assignmentModal.isDisplayed();
    }
    public void clickclose(){
        CommonEvents.clickButton(close);
    }
    public void clickCloseX(){
        CommonEvents.clickButton((closeX));
    }
}