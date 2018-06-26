package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignModalDelete extends BasePage {
    @FindBy(id = "mat-dialog-1")
    private WebElement editModal;

    @FindBy(name = "confirm_delete")
    private WebElement confirmDelete;

    @FindBy(id = "mat-dialog-1")
    private WebElement confirmeDeleteModal;

    @FindBy(name= "Cancel")
    private WebElement cancelDelete;


    public boolean isEditDialogPresent() {

        return editModal.isDisplayed();
    }

    public void deleteOnEditForm() {

        CommonEvents.clickButton(confirmDelete);
    }

    public boolean isConfirmModalPresent() {

        return confirmDelete.isDisplayed();
    }

    public void cancelModal(){
        CommonEvents.clickButton(cancelDelete);
    }
}