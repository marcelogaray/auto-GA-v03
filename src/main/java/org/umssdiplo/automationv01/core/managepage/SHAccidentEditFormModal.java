package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentEditFormModal extends BasePage {

    @FindBy(id = "editAccidentTitle")
    private WebElement editTitleModal;

    public boolean isEditModalPresent() {
        return CommonEvents.isPresent(editTitleModal);
    }

}