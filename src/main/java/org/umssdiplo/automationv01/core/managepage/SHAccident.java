package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    @FindBy(xpath = "//*[@id=\"listAccidents\"]/div/a[3]")
    private WebElement deleteButton;

    public SHAccidentFormModal clickRegistarAccBtn() {
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFormModal();
    }

    public SHDeleteConfirmModal clickDeleteButton() {
        CommonEvents.clickButton(deleteButton);
        return new SHDeleteConfirmModal();
    }
}
