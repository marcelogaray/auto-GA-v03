package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    @FindBy(xpath = "//*[@id=\"listAccidents\"]/div/a[3]")
    private WebElement deleteButton;

    @FindBy(id = "listAccidents")
    private List<WebElement> listAccidents;

    public SHAccidentFormModal clickRegistarAccBtn() {
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFormModal();
    }

    public SHDeleteConfirmModal clickDeleteButton() {
        CommonEvents.waitUntil(2000);
        CommonEvents.clickButton(deleteButton);
        return new SHDeleteConfirmModal();
    }

    public int getSizeOfRegisters() {
        //Todo revisar ManageDriver.getInstance().getWebDriver();
        return listAccidents.size();
    }
}
