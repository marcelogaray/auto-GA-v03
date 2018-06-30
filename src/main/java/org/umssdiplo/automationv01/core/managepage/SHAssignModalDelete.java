package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAssignModalDelete extends BasePage {
    @FindBy(id = "mat-dialog-1")
    private WebElement editModal;

    @FindBy(name = "confirm_delete")
    private WebElement confirmDelete;

    @FindBy(id = "mat-dialog-1")
    private WebElement confirmeDeleteModal;

    @FindBy(name = "Accept")
    private WebElement AcceptDelete;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    private WebElement okElement;

    @FindBy(className = "mat-list" )
    private List<WebElement> listDeleteModal;

    public boolean isEditDialogPresent() {
        return editModal.isDisplayed();
    }

    public void deleteOnEditForm() {
        CommonEvents.clickButton(confirmDelete);
    }

    public boolean isConfirmModalPresent() {
        return confirmDelete.isDisplayed();
    }

    public void acceptDelete() {
        CommonEvents.clickButton(AcceptDelete);
    }

    public void messageDelete() { CommonEvents.clickButton(okElement);}

    public int getSizeAssignments(){
            return listDeleteModal.size();
        }

}