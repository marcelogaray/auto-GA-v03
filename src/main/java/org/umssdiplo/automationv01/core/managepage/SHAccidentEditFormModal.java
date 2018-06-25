package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentEditFormModal extends BasePage {

    @FindBy(id = "editAccidentTitle")
    private WebElement editTitleModal;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "code")
    private WebElement code;

    @FindBy(id = "save")
    private WebElement saveButton;

    public boolean isEditModalPresent() {
        return editTitleModal.isDisplayed();
    }

    public void setTitleField() {
        CommonEvents.clearInputField(title);
        CommonEvents.pressEnterKey(title);
        CommonEvents.backPress(title);
    }

    public boolean isSaveBtnEnable() {
        CommonEvents.waitUntil(3000);
        return CommonEvents.isAttributPresent(saveButton, "disabled");
    }

    public void clickCodeField() {
        CommonEvents.jsClickElement(code);
        CommonEvents.setInputField(code, "Code");
    }
}